package junitDemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Remove2AsTest {
	/*TODOLIST TO MY FEATURE
	  "ABCD"=>"BCD"
	  "AABC"=>"BC"
	  "BACD"=>"BCD"
	  "BBAA"=>"BBAA"
	  "AABAA"=>"BAA"
	 */ 
	Remove2As removeObject;
	
	@BeforeEach
	void setup() {
		removeObject=new Remove2As();
		
	}
	@Test
	void test1() {
		
		assertEquals("BCD",removeObject.removeFirst2A("ABCD"));
		
		
	}
	@Test
void test2() {
		
		System.out.println(removeObject.removeFirst2A("AABC"));
		assertEquals("BC",removeObject.removeFirst2A("AABC"));
		
		
	}
	@Test
	
void test3() {
	
	assertEquals("BCD",removeObject.removeFirst2A("BACD"));
	
	
}
	@Test
void test4() {
	
	assertEquals("BBAA",removeObject.removeFirst2A("BBAA"));
	
}
	@Test
void test5() {
	
	assertEquals("BAA",removeObject.removeFirst2A("AABAA"));
	
	
}



	
	
	

}
