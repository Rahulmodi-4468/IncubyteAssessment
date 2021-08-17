package com.TechnicalAssessment;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    static  Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here

        Main calc = new Main();
        System.out.println("Enter Your String for testing");
        String input = sc.nextLine();
        int sum = calc.Add(input);
        System.out.print(sum);
    }
    static int Add(String numbers)
    {
        int sum = 0;
        StringTokenizer tokens = new StringTokenizer(numbers,",");
        int len = tokens.countTokens();
        if(len <= 0)
        {
            System.out.println("-----------------------\nTest Case  :- \nEmpty String");
            return 0;
        }
        else if(len >= 1 && len <= 2){
            while(tokens.hasMoreTokens()) {
                sum += Integer.parseInt(tokens.nextToken());
            }
            System.out.println("-----------------------\nTest Case  :- \nUpto two numbers & their 'sum=' : ");

            return sum;
        }
        System.out.println("-----------------------\nTest Case  :- \nUnkown Amount of Numbers : " );
        return 1;

    }
}


/*
* while(tokens.hasMoreTokens()) {
            int val = Integer.parseInt(tokens.nextToken());
            if (val <  0) {
                throw new NegativeValueException("Negative Values Not allowed" + val);
            } else if (len <= 2) {
                int numArr[] = new int[len];

                for (int i = 0; i < len; i++) {
                    numArr[i] = Integer.parseInt(arr[i]);
                    sum += numArr[i];
                }

                return sum;
            }
            //else{
            int numArr[] = new int[len];
            sum = 0;
            for (int i = 0; i < len; i++) {
                numArr[i] = Integer.parseInt(arr[i]);
                sum += numArr[i];
            }
            //System.out.println("Handled Unknown Amount of numbers 'Sums =' : "+ sum);
            //}
            return sum;
        }
* */