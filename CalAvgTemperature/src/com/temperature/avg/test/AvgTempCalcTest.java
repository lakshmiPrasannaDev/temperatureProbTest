package com.temperature.avg.test;


import org.junit.Test;

import com.temperature.avg.AvgTempCalc;

import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

public class AvgTempCalcTest {

	AvgTempCalc avgTempCalc = new AvgTempCalc();
   
   @Test
   public void testPrintMessage() {	
	   List<String> tempInput = new ArrayList<String>();
	   tempInput.add("1,10000,43");
	   tempInput.add("1,10000,40");
	   tempInput.add ("1,10002,45");
	   tempInput.add("1,11015,50");
	   tempInput.add("2,10005,42");
	   tempInput.add("2,11051,45");
	   tempInput.add("2,12064,42");
	   tempInput.add("2,13161,42");

	   AvgTempCalc.oneSecondDiff(tempInput);
	   int total = (int) (avgTempCalc.total3/avgTempCalc.count3);
	   assertEquals(42,total);
   }
}