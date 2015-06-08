package com.parksystem.model;

import static org.junit.Assert.*;
/**
 * @author IvanushkoSergey
 */

import org.junit.Test;

public class MotorcycleTest {

	@Test
	public void testObjectMotorcycle() {
		Motorcycle moto=new Motorcycle();
		
		assertTrue(moto instanceof Motorcycle);
		assertTrue(moto instanceof Vehicle);
	}

}
