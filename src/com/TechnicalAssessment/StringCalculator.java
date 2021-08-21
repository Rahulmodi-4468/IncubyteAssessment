package com.TechnicalAssessment;
import java.util.StringTokenizer;

public class StringCalculator {

    static int num = 0,sum =0;
    public static void main(String[] args) {
	// write your code here

    }


    static int Add(String numbers)
    {
        sum = 0;
        StringTokenizer tokens = new StringTokenizer(numbers,",|\n"); //Tokenizing String to Iterate
        int len = tokens.countTokens();   //length of numbers

        if(len == 0)                      //here Checking length is 0
        {
            System.out.println("\nEmpty String : "+ len);
            return 0;
        }
        else if(len >= 1 && len <= 2){    //here checking length is upto 2
            int flag = 0;
            while(tokens.hasMoreTokens()) {   //Iterating token with hasMoreTokens() method of StringTokenizer

                try {
                    num = Integer.parseInt(tokens.nextToken());
                    if (num < 0) {
                        throw new NegativeValueException(num);  //throw NegativeValueException
                    }
                    else {
                        sum += num;         //This statement will never execute as exception is raised by above statement
                        flag = 1;
                    }
                }
                catch(NumberFormatException ex)
                {
                    System.out.println("We can catch the NumberFormatException ");
                }
                catch(NegativeValueException ex)
                {
                    System.out.println(ex);
                }
            }

            if(flag == 1) System.out.print("\nSum : "+sum);

            return sum;

        }
        else{
            sum=0;
            while(tokens.hasMoreTokens()) {   //Iterating token with hasMoreTokens() method of StringTokenizer
                num = 0;

                num = Integer.parseInt(tokens.nextToken());

                try{
                    if (num < 0) {
                        throw new NegativeValueException(num);  //throw NegativeValueException
                    }
                    else
                    {
                        sum += num;
                    }
                }
                catch(NegativeValueException ex)
                {
                    System.out.println(ex);
                }


            }
            System.out.println("\nSum : "+sum);
            return sum;
        }


    }


    static int isSupportDifferentDelimiters(String numbers)
    {

        char delim = numbers.charAt(2);
        String delimS = Character.toString(delim);
        String[] seprated = numbers.split("\n");
        String mainStr = seprated[1];

        StringTokenizer tokens = new StringTokenizer(mainStr,delimS); //Tokenizing String to Iterate
        int flag =0;
        sum=0;
        while(tokens.hasMoreTokens()) {   //Iterating token with hasMoreTokens() method of StringTokenizer

            try {
                num = Integer.parseInt(tokens.nextToken());
                sum += num;         //This statement will never execute as exception is raised by above statement
                flag = 1;
            }
            catch(NumberFormatException ex)
            {
                System.out.println("\nWe can catch the NumberFormatException ");
            }
        }

        if(flag == 1) System.out.println("Handle '"+delim+"' Delimiter & Their numbers 'sum=' : "+sum);

        return sum;                        //return Addition of numbers

    }

    static int isIgnoreBiggerNumber(String numbers)
    {
        StringTokenizer tokens = new StringTokenizer(numbers, ","); //Tokenizing String to Iterate
        sum=0;
        while (tokens.hasMoreTokens()) {
            num = 0;
            num = Integer.parseInt(tokens.nextToken());

            if (num >= 1000)
            {
                num = 0;
            }
            else{
                sum += num;
            }
        }
        System.out.println("Thier Number's Sum :  "+sum);
        return sum;
    }




    static int deliWithLength(String numbers)
    {
        sum = 0;
        String[] seprated = numbers.split("\n");
        String mainStr = seprated[1];

        for(int i=0;i<mainStr.length();i++)
        {
            char ch = mainStr.charAt(i);
            if(ch == '*')
            {
                continue;
            }
            sum += Integer.parseInt(Character.toString(ch));
        }
        System.out.println("their numbers 'sum=' : "+ sum);
        return sum;
    }

    static int allowMultipleDelimiters(String numbers)
    {
        sum = 0;

        String[] seprated = numbers.split("\n");
        String mainStr = seprated[1];


        for(int i=0;i<mainStr.length();i++) {
            char ch = mainStr.charAt(i);

            if(!Character.isDigit(ch))
            {
                continue;
            }
            sum += Integer.parseInt(Character.toString(ch));
        }
        System.out.println("their numbers 'sum=' :"+ sum);
        return sum;
    }


}

class NegativeValueException extends Exception
{
    int str;

    NegativeValueException(int val)
    {
        str = val;
    }
    public String toString(){
        return("Negatives not allowed : "+str);
    }
}
