package com.TechnicalAssessment;
import org.junit.Assert;
import org.junit.Test;

import static com.TechnicalAssessment.StringCalculator.*;


public class AppTest {

    @Test
    public final void whenUptoTwoNumbersAreAccept()
    {
        System.out.print("\n-----------------------\nTest Case  :- \nHandle numbers Upto Two : ");
        Assert.assertEquals(10+20,Add("10,20"));
    }

    @Test
    public final void whenEmptyStringReturnZero(){
        System.out.print("\n-----------------------\nTest Case  :- \nHandle String is Empty : ");
        Assert.assertEquals(0,Add(""));
    }

    @Test
    public final void whenHandleUnknownAmountOfNumbers() {
        System.out.print("\n-----------------------\nTest Case  :- \nHandle Unknown Amount of Numbers  : ");
        Assert.assertEquals(10 + 20 + 30 + 40, Add("10,20,30,40"));
    }

    @Test
    public final void whenHandleNewLinesBetweenNumbers(){
        System.out.print("\n-----------------------\nTest Case  :- \nHandle Newlines Between Numbers : ");
        Assert.assertEquals(1+1+1,Add("1\n1,1"));
        Assert.assertEquals(4+6,Add("4,\n6"));
    }

    @Test
    public final void isSupportDifferentdelimiter()
    {
        System.out.print("\n-----------------------\nTest Case  :- \nHandle Different Delimiters\n");
        Assert.assertEquals(1+2,isSupportDifferentDelimiters("//;\n1;2"));
        Assert.assertEquals(1+2+2,isSupportDifferentDelimiters("//#\n1#2#2"));

    }

    @Test
    public final void negativeNumberWillThrowAnException() {
        System.out.println("\n-----------------------\nTest Case  :- \nHandle Negatives Numbers : ");
        Assert.assertEquals(0,Add("-6,-7"));
    }

    @Test
    public final void whenIgnoredNumberBiggerThan1000(){
        System.out.println("\n-----------------------\nTest Case  :- \nIgnored Number If number >= 1000 : ");
        Assert.assertEquals(2,isIgnoreBiggerNumber("1000,2"));
    }

    @Test
    public final void whendelimiterCanBeAnyLength()
    {
        System.out.println("\n-----------------------\nTest Case  :- \nHandle Delimiters can be of any length ");
        Assert.assertEquals(1+2+3,deliWithLength("//[***]\n1***2***3"));
    }

    @Test
    public final void whenallowMultipledelimiter()
    {
        System.out.println("\n-----------------------\nTest Case  :-\nHandle Multiple types of Delimiters");
        Assert.assertEquals(1+2+3,allowMultipleDelimiters("//[+][%]\n1+2%3"));
    }

    @Test
    public final void whenallowMultipledelimiterWithAnyLength()
    {
        System.out.println("\n-----------------------\nTest Case  :-\nHandle Multiple types of Delimiters With Any Length");
        Assert.assertEquals(3+2+3,allowMultipleDelimiters("//[*][#]\n3***2##3"));
    }


}
