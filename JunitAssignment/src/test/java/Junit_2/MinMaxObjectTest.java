package Junit_2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MinMaxObjectTest {

	int arr[]= {56,34,7,3,54,3,34,34,53};

	@Test
	void testFindMax() {
		MinMax expectedObj=new MinMax(3,56);
		MinMax actualObj;
		MinMaxObject obj = new MinMaxObject();
		actualObj=obj.findMinMax(arr);
		assertEquals(actualObj.max,expectedObj.max);
		assertEquals(actualObj.min,expectedObj.min);
	}
	
	
}
