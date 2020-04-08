package git_package.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import git_package.gitclass;
class TestCountA {

	@Test
	void test() {
		gitclass Klasse = new gitclass();
		assertEquals(2, Klasse.countA("Aplabet"));
	}

}
