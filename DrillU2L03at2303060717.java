package lrn.cc.drill.current;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

class DrillU2L03at2303060717 {

	@Test
	void testU2L03int() {
		// https://resources.coderscampus.com/docs/drills/U2L03/ for more detailed instructions
        int flower = 0;
        int minInt = -2147483648;
       
        int maxInt = 2147483647;
     
        int hurt = 3;
        int question = 5;
        int alarm = 55;
        int championship = 1;
        
		assertTrue(Integer.class.isInstance(flower));
		assertEquals(minInt, Integer.MIN_VALUE);
		assertEquals(maxInt, Integer.MAX_VALUE);
		assertEquals(15, hurt * question);
		assertEquals(54, alarm - championship);
	}

}
