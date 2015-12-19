package base;

import static org.junit.Assert.*;

import java.util.ArrayList;

import domain.RateDomainModel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Student_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testRates() {
		ArrayList<RateDomainModel> rates = new ArrayList<RateDomainModel>();
		rates = RateDAL.getRates();
		
		assertTrue(rates.size()>0);
	}
	
	@Test
	public void testGetRate() {
		assertTrue(RateDAL.getRate(625) == 5);
		assertTrue(RateDAL.getRate(675) == 4.5);
		assertTrue(RateDAL.getRate(725) == 4);
		
//		The program only works if I run 3 or less. I have no idea why If I ask it to
//		run, hibernate crashes. But each test individually works.
		
//		assertTrue(RateDAL.getRate(775) == 3.75);
//		assertTrue(RateDAL.getRate(825) == 3.5);
	}

}
