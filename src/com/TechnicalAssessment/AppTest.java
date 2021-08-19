package com.TechnicalAssessment;
import org.junit.Assert;
import org.junit.Test;

import static com.TechnicalAssessment.Main.Add;
import static com.TechnicalAssessment.Main.UnknownNumbers;
import static com.TechnicalAssessment.Main.NewLineHandler;

public class AppTest {

    @Test
    public void shouldAnswerWithTrue()  {

        String uptoTwo = "10,20";

        String emptyStr = "";
        String unknownNums = "10,20,30,41,25,36";
        String newLineHandler ="1|n2,3";
        String newLineHandler1 ="2,|n8";


        Assert.assertTrue(Add(uptoTwo));

        Assert.assertTrue(Add(emptyStr));

        //Handle Unknown Amount of Numbers
        Assert.assertTrue(UnknownNumbers(unknownNums));
          //Assert.assertTrue(UnknownNumbers(EmptyStr));

        //Handle newline Between  numbers
        Assert.assertTrue(NewLineHandler(newLineHandler));
        Assert.assertTrue(NewLineHandler(newLineHandler1));



    }
}
