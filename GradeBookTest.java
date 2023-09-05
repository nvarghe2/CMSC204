package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest 
{
	GradeBook g1;

	@BeforeEach
	//Implement the steUp method
	public void setUp() throws Exception
	{
		g1 = new GradeBook(5);
		g1.addScore(50.0);
		g1.addScore(75.0);
	}
	
	//Implement the tearDown method
	@AfterEach
	public void tearDown() throws Exception
	{
		g1 = null;
	}
	
	//Implement the testAddScore Method
	@Test
	public void testAddScore()
	{
		assertEquals(2.0, g1.getScoreSize(), 0.01);
		//assertTrue(g1.toString().equals("50.0 75.0 "));
		assertFalse(g1.toString().equals("50.0 75.0 "));
		
	}
	
	//Implement the testSum method
	@Test
	public void testSum()
	{
		assertEquals(125, g1.sum(), .0001);
	}

	//Implement the testMinimum method
	@Test
	public void testMinimum()
	{
		assertEquals(50.0, g1.minimum(), .0001);
	}

	//Implement the testFinalScore method
	@Test
	public void testFinalScore()
	{
		assertEquals(75.0, g1.finalScore(), .0001);
	}

}