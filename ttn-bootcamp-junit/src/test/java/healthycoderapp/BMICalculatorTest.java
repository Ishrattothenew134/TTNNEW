package healthycoderapp;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BMICalculatorTest {

    @Test
    void should_Returntrue_WhenDietRecommended(){
        //given
        double weight = 70.5;
        double height = 1.65;

        //when
        boolean recommended = BMICalculator.isDietRecommended(weight,height);

        //then
        assertTrue(recommended);

    }

    @Test
    void should_ReturnFalse_WhenDietNotRecommended(){
        //given
        double weight = 100.0;
        double height = 2.5;

        //when
        boolean recommended = BMICalculator.isDietRecommended(weight,height);

        //then
        assertFalse(recommended);
    }

    @Test
    void should_Throw_ArithmeticExpression_when_heightZero(){
        //given
        double weight = 76.0;
        double height = 0.0;

        //when
        Executable executable = ()->BMICalculator.isDietRecommended(weight,height);

        //then
        assertThrows(ArithmeticException.class,executable);

    }

    @Test
    void should_Return_CoderwithworstBMI_whenlistNotEmpty(){
        List<Coder> coder = new ArrayList<>();
        //Given
        coder.add(new Coder(1.70,58));
        coder.add(new Coder(1.65,70));
        coder.add(new Coder(1.8,100));
        //when
        Coder coder_with_worstBMI = BMICalculator.findCoderWithWorstBMI(coder);
        //then
        assertAll(
                ()->  assertEquals(1.8,coder_with_worstBMI.getHeight()),
                ()->assertEquals(100,coder_with_worstBMI.getWeight())
        );

    }
    @Test
    void should_return_null_whenlistEmpty(){
        //given
        List<Coder> coder = new ArrayList<>();
        //when
        Coder coder_with_worstBMI = BMICalculator.findCoderWithWorstBMI(coder);
        //then
        assertNull(coder_with_worstBMI);
    }
    @Test
    void should_getBMIscores_whencoderlistnotempty()
    {
        //given
        List<Coder> coder = new ArrayList<>();
        coder.add(new Coder(1.8,98));
        coder.add(new Coder(1.75,80));
        double[] actual_BMI = new double[]{30.25,26.12};

        //when
        double[] list_coders = BMICalculator.getBMIScores(coder);


        //then
        assertArrayEquals(actual_BMI,list_coders);

    }

}




