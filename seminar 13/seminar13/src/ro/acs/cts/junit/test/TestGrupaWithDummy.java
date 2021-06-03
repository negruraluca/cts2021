package ro.acs.cts.junit.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.acs.cts.junit.clase.Grupa;
import ro.acs.cts.junit.clase.IStudent;
import ro.acs.cts.junit.clase.Student;

public class TestGrupaWithDummy {

	@Test
	public void testAdaugaStudent() {
		IStudent student=new Student();
		Grupa grupa=new Grupa(1083);
		grupa.adaugaStudent(student);
		assertEquals(1, grupa.getStudenti().size());
	}

}
