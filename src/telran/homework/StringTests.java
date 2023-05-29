package telran.homework;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringTests {

	@Test
	void compareToTest() {
		String str1 = "Hello12";
		String str2 = "Hello1";
		assertEquals(1, str1.compareTo(str2));
		assertEquals(-1, str2.compareTo(str1));
		assertEquals(0, str1.compareTo(str1));
	}
	@Test
	void compareToIgnoreCaseTest() {
		String str1 = "Hello";
		String str2 = "HeLlO";
		String str3 = "HelLoO";
		assertEquals(0, str1.compareToIgnoreCase(str2));
		assertEquals(-1, str1.compareToIgnoreCase(str3));
		assertEquals(1, str3.compareToIgnoreCase(str2));
	}
	@Test
	void concatTest() {
		String str = "Hello";
		assertEquals("Hello world", str.concat(" world"));
	}
	@Test
	void startWithTest() {
		String str = "Hello";
		assertTrue(str.startsWith("He"));
		assertFalse(str.startsWith("Hi"));
		assertFalse(str.startsWith("he"));
	}
	@Test
	void endWithTest() {
		String str = "Hello";
		assertTrue(str.endsWith("o"));
		assertFalse(str.endsWith("i"));
		assertFalse(str.endsWith("O"));
	}
	@Test 
	void equalsIgnoreCaseTest() {
		String str1 = "Hello";
		String str2 = "HeLlO";
		String str3 = "Hell0";
		assertTrue(str1.equalsIgnoreCase(str2));
		assertFalse(str1.equalsIgnoreCase(str3));
	}
	@Test
	void indexOfTest() {
		String str = "Hello";
		assertEquals(0, str.indexOf(str));
		assertEquals(1, str.indexOf("e"));
		assertEquals(-1, str.indexOf("world"));
	}
	@Test 
	void lastIndexOfTest() {
		String str = "Hello";
		assertEquals(1, str.lastIndexOf('e'));
		assertEquals(-1, str.lastIndexOf('E'));
		assertEquals(-1, str.lastIndexOf('k'));
	}
 }
