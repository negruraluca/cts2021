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
	@Test
	public void testCalculeazaMedie()
	{
		Student student=new Student();
		int nota1=8;
		int nota2=10;
		int nota3=5;
		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		student.adaugaNota(nota3);
		float medie=(nota1+nota2+nota3)/3.0f;
		assertEquals(medie, student.calculeazaMedie(),0.01); //punem o marja de eroare at cand lucram cu valori reale
	}
	@Test
	public void testCalculeazaMediePentruONota()
	{
		Student student=new Student();
		int nota1=8;
		student.adaugaNota(nota1);
		assertEquals(nota1, student.calculeazaMedie(),0.01);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testCalculeazaMediePentruZeroNote()
	{
		Student student=new Student();
		//assertEquals(student.calculeazaMedie());
		student.calculeazaMedie();
	}
	@Test
	public void testAreRestanta()
	{
		Student student=new Student();
		int nota1=8;
		int nota2=3;
		int nota3=2;
		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		student.adaugaNota(nota3);
		//student.areRestante();
		assertTrue( student.areRestante());
	}
	@Test
	public void testNuAreRestanta()
	{
		Student student=new Student();
		int nota1=8;
		int nota2=9;
		int nota3=10;
		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		student.adaugaNota(nota3);
		//student.areRestante();
		assertFalse( student.areRestante());
	}
	@Test
	public void testGetNotaPozitieIncorecta()
	{
		Student student=new Student();
		int nota1=8;
		int nota2=9;
		int nota3=10;
		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		student.adaugaNota(nota3);
		//1
		try
		{
			//2
			student.getNota(3);
			//3
			fail("metoda nu arunca exceptie");
		}
		
		catch(IndexOutOfBoundsException exception)
		{
			//4
		}
		//5
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testAdaugaNotaIncorecta()
	{
		Student student=new Student();
		int nota=11;
		student.adaugaNota(nota);
	}
}
