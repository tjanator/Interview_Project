package InterviewProject;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author travis hart
 * 
 */

import org.junit.jupiter.api.Test;

class mathTest {

	/**
	 * 
	 */
	@Test
	void test() {
		assertArrayEquals("+".toCharArray(), InterviewProject.mathFunction(1,2,3).toCharArray());
		assertArrayEquals("+*".toCharArray(), InterviewProject.mathFunction(2,2,4).toCharArray());
		assertArrayEquals("*".toCharArray(), InterviewProject.mathFunction(3,-3,-9).toCharArray());
		assertArrayEquals("-".toCharArray(), InterviewProject.mathFunction(1,2,-1).toCharArray());
		assertArrayEquals("/".toCharArray(), InterviewProject.mathFunction(3,3,1).toCharArray());
		assertArrayEquals("None".toCharArray(), InterviewProject.mathFunction(7,1,11).toCharArray());
	}


}
