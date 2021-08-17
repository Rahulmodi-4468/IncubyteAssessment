package com.TechnicalAssessment;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String num1 = "12,25";
        String num2 = "";
        String num3 = "5,15,25,36,9,8";
        int val;
        val= Add(num1);
        System.out.println("-----------------------\nTest Case 1 :- \nUpto two numbers & their 'sum=' : "+ val);
        val = Add(num2);
        System.out.println("-----------------------\nTest Case 2 :-\nEmpty String : "+val);
        val = Add(num3);
        System.out.println("-----------------------\nTest Case 3 :-\nHandled Unknown Amount of Numbers & Display their 'Sum=' : "+val);

    }
    static int Add(String numbers)
    {
        int sum = 0;
        String[] arr = numbers.split(",");
        int len = arr.length;
        if(numbers.length() == 0)
        {
            return sum;
        }
        else if(len <= 2 )
        {
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
}
