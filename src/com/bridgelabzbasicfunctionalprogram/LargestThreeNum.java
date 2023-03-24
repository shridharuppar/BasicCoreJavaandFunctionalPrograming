package com.bridgelabzbasicfunctionalprogram;

public class LargestThreeNum {
	public static void main(String[] args) {

        double n1 = -40, n2 = 56, n3 = 35.5;

        if( n1 >= n2 & n1 >= n3)
            System.out.println(n1 + " is the largest number.");

        else if (n2 >= n1 & n2 >= n3)
            System.out.println(n2 + " is the largest number.");

        else
            System.out.println(n3 + " is the largest number.");
    }
}

