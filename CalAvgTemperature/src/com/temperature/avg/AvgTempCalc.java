package com.temperature.avg;

import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.Scanner;

public class AvgTempCalc {

	public static float total = 0, total1 = 0, total2 = 0, total3 = 0;
	public static int count = 0, count1 = 0, count2 = 0, count3 = 0;
	public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			List<String> tempInput = new ArrayList<String>();
			for(int i =0; i<7 ;i++){
			  tempInput.add(in.nextLine());
		}

		oneSecondDiff(tempInput);
	}

	public static void oneSecondDiff(List<String> tempInput) {
		
	
		Formatter fmt = new Formatter();Formatter fmt1 = new Formatter();Formatter fmt2 = new Formatter();Formatter fmt3 = new Formatter();
		for(int i =0; i<tempInput.size();i++){
			float val1 = Integer.parseInt(tempInput.get(i).substring(2, 7));
			float val2 = Integer.parseInt(tempInput.get(i).substring(8, 10));
			if(val1 >=10000 && val1 <=10999 ){
				++count;
				total = total + val2;
			    
			}
			if(val1 >=11000 && val1 <=11999 ){
				++count1;
				total1 = total1 + val2;
				
			}
			if(val1 >=12000 && val1 <=12999 ){
				++count2;
				total2 = total2 + val2;	
				
			}
			if(val1 >=13000 && val1 <=13999 ){
				++count3;
				total3 = total3 + val2;
				
			}
		
		}
		System.out.println("10000-10999: " + fmt.format("%.2f", total/count));
		System.out.println("11000-11999: " + fmt1.format("%.2f", total1/count1));
		System.out.println("12000-12999: " + fmt2.format("%.2f", total2/count2));
		System.out.println("13000-13999: " + fmt3.format("%.2f", total3/count3));
		
	}

}
