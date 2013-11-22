package tests;

import static org.junit.Assert.*;
import main.Lift;

import org.junit.Before;
import org.junit.Test;

public class Test_go_to_EC_PW {

	Lift andar = new Lift();
	
	@Test
	public void TestCase1(){
		andar.setFloor(1);
		andar.go_to(2);
		assertEquals(2,andar.getFloor());
	}
	@Test
	public void TestCase2(){
		andar.setFloor(1);
		andar.go_to(3);
		assertEquals(3,andar.getFloor());
	}
	@Test
	public void TestCase3(){
		andar.setFloor(1);
		andar.go_to(4);
		assertEquals(4,andar.getFloor());
	}
	@Test
	public void TestCase4(){
		andar.setFloor(1);
		andar.go_to(5);
		assertEquals(5,andar.getFloor());
	}
	@Test
	public void TestCase6(){
		andar.setFloor(2);
		andar.go_to(1);
		assertEquals(1,andar.getFloor());
	}
	@Test
	public void TestCase7(){
		andar.setFloor(2);
		andar.go_to(3);
		assertEquals(3,andar.getFloor());
	}
	@Test
	public void TestCase8(){
		andar.setFloor(2);
		andar.go_to(4);
		assertEquals(4,andar.getFloor());
	}
	@Test
	public void TestCase9(){
		andar.setFloor(2);
		andar.go_to(5);
		assertEquals(5,andar.getFloor());
	}
	@Test
	public void TestCase10(){
		andar.setFloor(3);
		andar.go_to(1);
		assertEquals(1,andar.getFloor());
	}
	@Test
	public void TestCase11(){
		andar.setFloor(3);
		andar.go_to(2);
		assertEquals(2,andar.getFloor());
	}
	@Test
	public void TestCase12(){
		andar.setFloor(3);
		andar.go_to(4);
		assertEquals(4,andar.getFloor());
	}
	@Test
	public void TestCase13(){
		andar.setFloor(3);
		andar.go_to(5);
		assertEquals(5,andar.getFloor());
	}
	@Test
	public void TestCase14(){
		andar.setFloor(4);
		andar.go_to(1);
		assertEquals(1,andar.getFloor());
	}
	@Test
	public void TestCase15(){
		andar.setFloor(4);
		andar.go_to(2);
		assertEquals(2,andar.getFloor());
	}
	@Test
	public void TestCase16(){
		andar.setFloor(4);
		andar.go_to(3);
		assertEquals(3,andar.getFloor());
	}
	@Test
	public void TestCase17(){
		andar.setFloor(4);
		andar.go_to(5);
		assertEquals(5,andar.getFloor());
	}
	@Test
	public void TestCase18(){
		andar.setFloor(5);
		andar.go_to(1);
		assertEquals(1,andar.getFloor());
	}
	@Test
	public void TestCase19(){
		andar.setFloor(5);
		andar.go_to(2);
		assertEquals(2,andar.getFloor());
	}
	@Test
	public void TestCase20(){
		andar.setFloor(5);
		andar.go_to(3);
		assertEquals(3,andar.getFloor());
	}
	@Test
	public void TestCase21(){
		andar.setFloor(5);
		andar.go_to(4);
		assertEquals(4,andar.getFloor());
	}
}
