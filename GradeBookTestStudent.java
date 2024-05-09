import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTestStudent {

	GradeBook book1 = new GradeBook(5);
	GradeBook book2 = new GradeBook(5);
	GradeBook book3 = new GradeBook(5);
	GradeBook book4 = new GradeBook(5);
	@BeforeEach
	void setUp() throws Exception {
		book1.addScore(100);
		book1.addScore(99);
		book1.addScore(78.5);
		book1.addScore(88.8);
		book2.addScore(96.4);
		book2.addScore(68);
		book3.addScore(68);
	}

	@AfterEach
	void tearDown() throws Exception {
		book1 = null;
		book2 = null;
	}

	@Test
	void testAddScore() {
		book1.addScore(40);
		assertEquals(5, book1.getScoresSize());
		assertEquals("100.0 99.0 78.5 88.8 40.0 ", book1.toString());
	}

	@Test
	void testSum() {
		assertEquals(366.3, book1.sum());

		assertEquals(164.4, book2.sum());
	}

	@Test
	void testMinimum() {
		assertEquals(78.5, book1.minimum());
		assertEquals(68.0, book2.minimum());


	}

	@Test
	void testFinalScore() {
		assertEquals(287.8, book1.finalScore());
		assertEquals(96.4, book2.finalScore());
		assertEquals(68.0, book3.finalScore());
		assertEquals(0.0, book4.finalScore());
	}

	@Test
	void testGetScoresSize() {
		assertEquals(4, book1.getScoresSize());
		assertEquals(2, book2.getScoresSize());
	}

	@Test
	void testToString() {
		assertEquals("100.0 99.0 78.5 88.8 0.0 ", book1.toString());
		assertEquals("96.4 68.0 0.0 0.0 0.0 ", book2.toString());
	}

}
