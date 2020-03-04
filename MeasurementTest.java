package junit;

import junit.framework.TestCase;

public class MeasurementTest extends TestCase {
public MeasurementTest(String name) {
	super(name);

	}
public void testAddMeasurement() {
	Measurement m1=new Measurement(20);
	Measurement m2=new Measurement(40);
	m1.add(m2);
	assertEquals(60,m1.getValue());
	assertEquals(40,m2.getValue());
}


public void testSubstractMeasurement() {
	Measurement m1=new Measurement(20);
	Measurement m2=new Measurement(40);
	m1.add(m2);
	assertEquals(60,m1.getValue());
	assertEquals(40,m2.getValue());
}
}
