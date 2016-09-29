package fengkai.springmvc;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public AppTest(String testName) {
		super(testName);
	}
	
	public AppTest() {
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(AppTest.class);
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp() {
		assertTrue(true);
	}

	public static void main(String[] args) {
		
		new AppTest().loopChar();
	}
	
	public void loopSet() {
		String a = "123";
		String b = "123";
		System.out.println(a == b);
		Set<Object> set = new HashSet<>();
		for (int i = 0; i < 10; i++) {
			set.add(i);
		}
		set.add("");
		set.add("123");
		set.add("123");
		System.out.println(set.size());
		Iterator<Object> iterator = set.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());

		}
	}
	
	public void loopChar() {
		for (char i = 0; i < 128; i++) {
			if (Character.isLowerCase(i)) {
				System.out.println(i+"," +(int) i);
				break;
			}
		}
		char a = 97;
		System.out.println(a);
		char b = 'a';
		System.out.println(b);
		System.out.println(a==b);
		
		int[] a1 = new int[8];
		a1[0]=100;
		int[] b1 = new int[3];
		b1=a1;
		System.out.println(b1[0]);
		System.out.println(b1==a1);
	}
}
