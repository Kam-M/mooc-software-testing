package tudelft.ghappy;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

import static org.hamcrest.core.IsNot.*;

import static org.hamcrest.MatcherAssert.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GHappyTest {
	
	private GHappy gHappy;
	
	@BeforeEach
	void initialize() {
		this.gHappy = new GHappy();
	}
	
	@Test
	void shouldReturnTrueIfGIsHappy() {
		boolean isHappy = gHappy.gHappy("xxxggxx");
		assertTrue(isHappy);
	}
	
	@Test
	void shouldReturnFalseIfOnlyOneGIsHappy() {
		boolean isHappy = gHappy.gHappy("xxxggxgx");
		assertThat(isHappy, not(true));
	}
	
	@Test
	void shouldReturnFalseIsOnlyOneG() {
		boolean isHappy = gHappy.gHappy("xxxxgx");
		assertFalse(isHappy);
	}
	
	@Test
	void shouldReturnFalseIfTwoGButNotNearly() {
		boolean isHappy = gHappy.gHappy("xxgxxgx");
		assertFalse(isHappy);
	}
	
}
