package tdd.EU;

import PersonalPractice.Eu.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {
    @Test
    public void shouldReturnNumberOfPersons(){
        Person person  = new Person();
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        assertEquals(4, Person.numberOfPersons());
    }





}