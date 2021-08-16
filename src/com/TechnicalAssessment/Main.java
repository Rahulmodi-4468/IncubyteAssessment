package com.TechnicalAssessment;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String num1 = "12,25";
        String num2 = "5";
        String num3 = "";
        int val;
        val= Add(num1);
        System.out.println("Test Case 1 : "+ val);
        val = Add(num2);
        System.out.println("Test Case 2 : "+val);
        val = Add(num3);
        System.out.println("Test Case 3 : "+val);
    }
    static int Add(String numbers)
    {
        int sum = 0;
        if(numbers.length() == 0)
        {
            return sum;
        }
        else
        {
            String[] arr = numbers.split(",");
            int len = arr.length;
            if(len <= 2 ) {
                int numArr[] = new int[len];

                for (int i = 0; i < len; i++) {
                    numArr[i] = Integer.parseInt(arr[i]);
                    sum += numArr[i];
                }

                //System.out.println(sum);

            }
            return sum;
        }

    }
}
