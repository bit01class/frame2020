package com.bit.emp.model;

import org.junit.Assert;
import org.junit.Test;

import com.bit.emp.model.entity.EmpVo;

public class EmpDaoTest {
/*
메소드 - 설명

assertSame(ox, oy) - 객체 ox와 oy가 같은 객체임을 확인합니다. ox와 oy가 같은 객체를 참조하고 있으면 테스트 통과. assertEquals()메서드는 두 객체의 값이 같은지 확인하고, assertSame()메서드는 두 객체의 레퍼런스가 동일한가를 확인합니다. (== 연산자)
assertEquals(x, y) - 객체 x와 y가 일치함을 확인합니다. x(예상 값)와 y(실제 값)가 같으면 테스트 통과
assertNotSame(ox, oy) - ox와 oy가 같은 객체를 참조하고 있지 않으면 통과
assertNotEquals(x, y)
assertArrayEquals(a, b); -  배열 A와 B가 일치함을 확인합니다.
assertFalse(x) -  x가 false 인지 확인합니다.
assertTrue(x) - x가 true 인지 확인합니다.
assertNull(o) - 객체o가 null인지 확인합니다.
assertNotNull(o) - 객체o가 null이 아닌지 확인합니다.
assertfail() - 테스트를 바로 실패처리
//////////////////////////////////////////////////////////
 @FixMethodOrder

@FixMethodOrder(MethodSorters.DEFAULT)
테스트로 출력을 할 수 있지만 순서가 보장되지 않습니다.
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
메소드명 기준으로하여 오름차순으로 실행됩니다.
@FixMethodOrder(MethodSorters.JVM)
테스트방법을 JVM이 리턴한 순서대로 실행됩니다. 
*/	
	@Test
	public void testGetConnection() throws Exception {
		EmpDao dao=new EmpDao();
		Assert.assertNotNull(dao.getConnection());
	}
	
	@Test
	public void testSelectAll() throws Exception {
		EmpDao dao=new EmpDao();
		Assert.assertSame(5,dao.selectAll().size());
//		if(dao.selectAll().size()!=6)Assert.fail();
	}

	@Test
	public void testSelectOne() throws Exception{
		EmpVo target=new EmpVo(1,"tester1","test1",null,1000);
		EmpDao dao=new EmpDao();
		Assert.assertEquals(target, dao.selectOne(target.getSabun()));
	}
}
















