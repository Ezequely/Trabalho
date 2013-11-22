package tests;

import static org.junit.Assert.*;
import main.Lift;

import org.junit.Before;
import org.junit.Test;

public class Test_go_up_EC_EC {

	Lift andar = new Lift();

	@Test
	public void TestCase1(){
		andar.setFloor(1);
		andar.go_up();
		assertEquals(2,andar.getFloor());
	}
	@Test
	public void TestCase2(){
		andar.setFloor(2);
		andar.go_up();
		assertEquals(3,andar.getFloor());
	}
	@Test
	public void TestCase3(){
		andar.setFloor(3);
		andar.go_up();
		assertEquals(4,andar.getFloor());
	}
	@Test
	public void TestCase4(){
		andar.setFloor(4);
		andar.go_up();
		assertEquals(5,andar.getFloor());
	}
	@Test
	public void TestCase5(){
		andar.setFloor(5);
		andar.go_up();
		assertEquals(5,andar.getFloor());
	}
}
