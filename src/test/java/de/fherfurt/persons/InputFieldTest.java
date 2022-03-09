package de.fherfurt.persons;

import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class InputFieldTest
{

    @Test
    void getListSearchInput()
    {
        //given
        InputField TestInputField = new InputField("Frank", "Schneider", "Mathematik", Faculty.AS);  //warum muss ich faculty davor schreiben wenn im construktor der Typ ist`?
        ArrayList<String> ListToCompare = new ArrayList<>();
        ListToCompare.add("Frank");
        ListToCompare.add("Schneider");
        ListToCompare.add("Mathematik");
        ListToCompare.add("Angewandte Sozialwissenschaften");
        //when
        TestInputField.setListSearchInput();
        //then
        System.out.println(TestInputField.getListSearchInput());
        Assertions.assertThat(TestInputField.getListSearchInput())
                .isEqualTo(ListToCompare)
                .isNotNull()
                .isNotEqualTo("3");
    }

    @Test
    void checkStringValid()
    {
        //given
        String testStringA = "HelloIAmAVeryLongStringAndIAmVerySorryForThat";
        String testStringB = " FirstLetterIsASpace";
        String testStringC = "!?!";
        String testStringD = "Anna-Maria Elisabeth";
        //when

        //then
        Assertions.assertThat(InputField.checkStringValid(testStringA))
                .isFalse();
        Assertions.assertThat(InputField.checkStringValid(testStringB))
                .isFalse();
        Assertions.assertThat(InputField.checkStringValid(testStringC))
                .isFalse();

        Assertions.assertThat(InputField.checkStringValid(testStringD))
                .isTrue();
    }
}