package ro.acs.cts.junit.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.acs.cts.categorii.TestGetPromovabilitate;
import ro.acs.cts.clase.mockuri.StudentStub;
import ro.acs.cts.junit.clase.Grupa;
import ro.acs.cts.junit.clase.IStudent;

public class TestPromovabilitateWithStub {

	@Test
	@Category(TestGetPromovabilitate.class)
	public void testPromovabilitateLimitaSuperioara() {
		Grupa grupa=new Grupa(1083);
		IStudent student=new StudentStub();
		grupa.adaugaStudent(student);
		assertEquals(1, grupa.getPromovabilitate(),0.01);
	}

}
