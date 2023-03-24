package com.bridgelabzbasicfunctionalprogram;

import java.util.Scanner;

public class LeapYear {
public static void main(String[] args) {
		
		int y;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter the year: ");
			y=sc.nextInt();
		}
		if(y%400==0 || (y%4==0 && y%100!=0)) 
		{
       System.out.println("the year is leap year");
	}
		else {
			System.out.println("the year is not a leap year");
		}

}
}

