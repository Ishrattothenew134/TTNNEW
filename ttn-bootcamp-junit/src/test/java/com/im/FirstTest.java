package com.im;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class FirstTest {
    First first = new First();
    @ParameterizedTest(name="main_string={0},sub_string={1},replace_string{2}")
    @CsvFileSource(resources = "/testcases.csv")
    void return_updatedstring_iffoundthesubtring(String str,String s, String s1 ) {

        //given
        String main_string = str;
        String sub_string = s;
        String replace_string = s1;
        String required_string = str.replace(s,s1);
        //String required_string =  first.replaceSubString(main_string, sub_string, replace_string);

        //when
        String new_string =  first.replaceSubString(main_string, sub_string, replace_string);
        boolean a = required_string.equals(new_string);
        //then
        assertTrue(a);
    }


    @Test
    void returntrueIfOnlyevenElementsarefiltered(){
        List <Integer> full_array  = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        ArrayList<Integer> filtered_array = new ArrayList<>();
        ArrayList<Integer> required_array = new ArrayList<>();

        filtered_array = (ArrayList<Integer>) first.filterEvenElements(full_array);
        required_array = (ArrayList<Integer>) full_array.stream().filter(e->e%2!=0).collect(Collectors.toList());

        assertEquals(required_array,filtered_array);

    }
    @Test
    void shouldThrow_RuntimeException_WhenInvalidInput_isGiven()
    {
        //given
        First first = new First();
        List<BigDecimal> bd = new ArrayList<>();

        //when
        Executable executable = () -> first.calculateAverage(bd);

        //then
        assertThrows(RuntimeException.class, executable);
    }

    @Test
    void shouldReturnTheAverage() {
        First first = new First();
        Random r = new Random();

        //given
        List<BigDecimal> bd = new ArrayList<>();
        for(int i=0; i<10; i++)
        {
            double d = r.nextDouble();
            bd.add(BigDecimal.valueOf(d));
        }
        BigDecimal sum = bd.stream().reduce(BigDecimal.ZERO, BigDecimal::add);
        BigDecimal result = sum.divide(new BigDecimal(bd.size()));

        //when
        BigDecimal actual = first.calculateAverage(bd);
        boolean flag = actual.equals(result);

        //then
        assertTrue(flag);
    }

    @ParameterizedTest(name="original_string={0},reversed_string={1}")
    @CsvFileSource(resources = "/testcases_for_pallindrome.csv",numLinesToSkip = 0)
    void return_True_IfPallindrome(String s1,String s2){
        String original_string = s1;
        String reversed_string = s2;
        boolean output = first.isPallindrome(s1);
        assertTrue(output);
    }

    @ParameterizedTest(name="original_string={0},reversed_string={1}")
    @CsvFileSource(resources = "/testcases_for_notpallindrome.csv",numLinesToSkip = 0)
    void return_False_If_NotPallindrome(String s1,String s2){
        String original_string = s1;
        String reversed_string = s2;
        boolean output = first.isPallindrome(s1);
        assertFalse(output);
    }



}

