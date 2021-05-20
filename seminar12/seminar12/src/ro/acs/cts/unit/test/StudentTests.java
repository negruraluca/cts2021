package ro.acs.cts.unit.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.acs.cts.unit.clase.Student;

public class StudentTests {

	@Test
	public void testConstructorCuParametru() {
		String nume="Gigel";
		Student student=new Student(nume);
		assertEquals("numele nu a fost initializat",nume, student.getNume());
		//assertNotEquals(null, student.getNote());
		assertNotNull("lista nu a fost initializata",student.getNote());
	
	}
	@Test
	public void testConstructorFaraParametrii() {
		Student student=new Student();
		assertNotNull("numele nu a fost initializat",student.getNume());
		//assertNotEquals(null, student.getNote());
		assertNotNull("lista nu a fost initializata",student.getNote());
	
	}
	@Test
	public void testSetterNume() {
		String nume="Gigel";
		Student student=new Student();
		student.setNume(nume);
		assertEquals(nume, student.getNume());
	}
	@Test
	public void testAdaugareNotainLista()
	{
		Student student=new Student();
		int nota=8;
		student.adaugaNota(nota);
		assertEquals(nota, student.getNota(0));
	}
	@Test
	public void testDimensiuneLista()
	{
		Student student=new Student();
		int nota=8;
		student.adaugaNota(nota);
		assertEquals(1, student.getNote().size());
	}
}
