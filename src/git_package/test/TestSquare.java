package git_package.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import git_package.gitclass;

class TestSquare {

	@Test
	void test() {
		gitclass Klasse2 = new gitclass();
		assertEquals(25, Klasse2.square(5));
		System.out.println("Test für die Square Methode");
	}
}
