package com.TechnicalAssessment;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    static  Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here

        Main calc = new Main();
        System.out.print("Enter Your String  : ");
        String input = sc.nextLine();
        int sum = calc.Add(input);
        System.out.print(sum);
    }
    static int Add(String numbers)
    {
        int sum = 0;                     //Initializing sum as 0
        StringTokenizer tokens = new StringTokenizer(numbers,","); //Tokenizing String to Iterate
        int len = tokens.countTokens();   //length of numbers
        if(len == 0)                      //here Checking length is 0
        {
            System.out.println("-----------------------\nTest Case  :- \nEmpty String");
            return 0;
        }
        else if(len >= 1 && len <= 2){    //here checking length is upto 2
            while(tokens.hasMoreTokens()) {   //Iterating token with hasMoreTokens() method of StringTokenizer
                int num ;
                try {
                    num = Integer.parseInt(tokens.nextToken());
                    sum += num;
                }
                catch(NumberFormatException ex)
                {
                    System.out.println("We can catch the NumberFormatException ");
                }
            }
            System.out.print("-----------------------\nTest Case  :- \nUpto two numbers & their 'sum=' : ");

            return sum;                        //return Addition of numbers
        }

        System.out.println("-----------------------\nTest Case  :- \nUnkown Amount of Numbers : " );
        return 1;

    }

}

