package com.TechnicalAssessment;

import java.util.Scanner;
import java.util.StringTokenizer;

import org.junit.*;
import org.junit.Test;
public class Main {
    static  Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here

        //Main calc = new Main();
       // System.out.print("Enter Your String  : ");
       // String input = sc.nextLine();



    }


    @Test
    static boolean Add(String numbers)
    {
        int sum = 0;                     //Initializing sum as 0
        StringTokenizer tokens = new StringTokenizer(numbers,",|n"); //Tokenizing String to Iterate
        int len = tokens.countTokens();   //length of numbers
        if(len == 0)                      //here Checking length is 0
        {
            System.out.println("\n-----------------------\nTest Case  :- \nEmpty String : "+len);
            return true;
        }
        else if(len >= 1 && len <= 2){    //here checking length is upto 2
            int flag = 0;
            while(tokens.hasMoreTokens()) {   //Iterating token with hasMoreTokens() method of StringTokenizer
                int num = 0;
                try {
                    num = Integer.parseInt(tokens.nextToken().trim());
                    sum += num;         //This statement will never execute as exception is raised by above statement
                    flag = 1;
                }
                catch(NumberFormatException ex)
                {
                    System.out.println("We can catch the NumberFormatException ");
                }
            }

            if(flag == 1) System.out.print("\n-----------------------\nTest Case  :- \nUpto two numbers & their 'sum=' : "+sum);

            return true;                        //return Addition of numbers

        }

        return false;
    }


    @Test
    static  boolean UnknownNumbers(String numbers)
    {
        int sum = 0;                     //Initializing sum as 0
        StringTokenizer tokens = new StringTokenizer(numbers,","); //Tokenizing String to Iterate
        int len = tokens.countTokens();   //length of numbers

        if(len > 2) {   //length o number greater than 2
            while (tokens.hasMoreTokens()) {   //Iterating token with hasMoreTokens() method of StringTokenizer
                int num = 0;
                num = Integer.parseInt(tokens.nextToken());
                sum += num;
            }
            System.out.println("-----------------------\nTest Case  :- \nUnkown Amount of Numbers : " + sum);
            return true;
        }
        return false;
    }

    @Test
    static  boolean NewLineHandler(String numbers)
    {
        StringTokenizer tokens = new StringTokenizer(numbers,",|n"); //Tokenizing String to Iterate
        int flag =0,sum=0;;
        while(tokens.hasMoreTokens()) {   //Iterating token with hasMoreTokens() method of StringTokenizer
            int num = 0;
            try {
                num = Integer.parseInt(tokens.nextToken());
                sum += num;         //This statement will never execute as exception is raised by above statement
                flag = 1;
            }
            catch(NumberFormatException ex)
            {
                System.out.println("We can catch the NumberFormatException ");
            }
        }

        if(flag == 1) System.out.print("\n-----------------------\nTest Case  :- \nHandle newline between numbers & their 'sum=' : "+sum);

        return true;                        //return Addition of numbers

    }
    @Test
    static boolean NegativeNumbers(String numbers) throws NegativeValueException  {
        StringTokenizer tokens = new StringTokenizer(numbers, ","); //Tokenizing String to Iterate
        int sum=0;
        while (tokens.hasMoreTokens()) {

            int num = Integer.parseInt(tokens.nextToken());
            if (num < 0) {
                throw new NegativeValueException(num);
            }
            else if (num >= 1000)
            {
                num = 0;
                sum += num;
            }
            else{
                sum += num;
            }
        }
        System.out.println("\n-----------------------\nTest Case  :- \nIgnored number bigger than 1000 : "+sum);
        return true;
    }



}

class NegativeValueException extends Exception
{
    public NegativeValueException(){
        super();
    }
    public NegativeValueException(int val)
    {
        super("Negatives not allowed : " + val);
    }
}