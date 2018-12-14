package com.temperature.avg;

import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.Scanner;

public class AvgTempCalc {


	public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			List<String> tempInput = new ArrayList<String>();
			for(int i =0; i<7 ;i++){
			tempInput.add(in.nextLine());
		}

		oneSecondDiff(tempInput);
	}

	private static void oneSecondDiff(List<String> tempInput) {
		float var1 = 0;
		int count = 0,count2=0,count3=0,count4=0;
		for(int i =0; i<tempInput.size();i++){
			float val1 = Integer.parseInt(tempInput.get(i).substring(2, 7));
			float val2 = Integer.parseInt(tempInput.get(i).substring(8, 10));
			if(val1 >=10000 && val1 <=10999 ){
				++count;
				var1 = var1 + val2;
				Formatter fmt = new Formatter();
				fmt.format("%.2f", var1/count);
			    System.out.println(i+"-"+j +":" + fmt);
			}
			if(val1 >=11000 && val1 <=11999 ){
				++count2;
				var1 = var1 + val2;
				Formatter fmt = new Formatter();
				fmt.format("%.2f", var1/count);
			    System.out.println(i+"-"+j +":" + fmt);
			}
			if(val1 >=12000 && val1 <=12999 ){
				++count3;
				var1 = var1 + val2;
				Formatter fmt = new Formatter();
				fmt.format("%.2f", var1/count);
			    System.out.println(i+"-"+j +":" + fmt);
			}
			if(val1 >=13000 && val1 <=13999 ){
				++count4;
				var1 = var1 + val2;
				Formatter fmt = new Formatter();
				fmt.format("%.2f", var1/count);
			    System.out.println(i+"-"+j +":" + fmt);
			}
		}
		
	}

	private static void printValues(float var1, float val2, int i, int j, int count) {
		++count;
		var1 = var1 + val2;
		Formatter fmt = new Formatter();
		fmt.format("%.2f", var1/count);
	    System.out.println(i+"-"+j +":" + fmt);
		
	}


}
