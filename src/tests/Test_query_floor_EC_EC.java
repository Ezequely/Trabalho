package tests;

import static org.junit.Assert.*;
import main.Lift;

import org.junit.Before;
import org.junit.Test;

public class Test_query_floor_EC_EC {

	Lift andar = new Lift();

	@Test
	public void TestCase1(){
		andar.setFloor(1);
		assertEquals(1,andar.query_floor());
	}
	@Test
	public void TestCase2(){
		andar.setFloor(2);
		assertEquals(2,andar.query_floor());
	}
	@Test
	public void TestCase3(){
		andar.setFloor(3);
		assertEquals(3,andar.query_floor());
	}
	@Test
	public void TestCase4(){
		andar.setFloor(4);
		assertEquals(4,andar.query_floor());
	}
	@Test
	public void TestCase5(){
		andar.setFloor(5);
		assertEquals(5,andar.query_floor());
	}	
}
