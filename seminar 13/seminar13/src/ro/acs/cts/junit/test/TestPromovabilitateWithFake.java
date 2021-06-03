package ro.acs.cts.junit.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.acs.cts.clase.mockuri.StudentFake;
import ro.acs.cts.junit.clase.Grupa;

public class TestPromovabilitateWithFake {

	@Test
	public void testPromovabilitateRight() {
		Grupa grupa=new Grupa(1083);
		for(int i=0;i<8;i++)
		{
			StudentFake student=new StudentFake();
			student.setValoareAreRestante(false);
			grupa.adaugaStudent(student);
		}
		for(int i=0;i<2;i++)
		{
			StudentFake student=new StudentFake();
			student.setValoareAreRestante(true);
			grupa.adaugaStudent(student);
		}
		assertEquals(0.8, grupa.getPromovabilitate(),0.01);
	}

}
