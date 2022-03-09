package de.fherfurt.repository;

import de.fherfurt.person.Person;

import java.util.ArrayList;
import java.util.List;
public class PersonRepository
{
    private final List<Person> storage = new ArrayList<>();

    public void persist(Person person) {
        storage.add(person);
    }

    public List<Person> getPersonList()
    {
        return storage;
    }

    public void printArrayList()
    {
        System.out.println(storage);
    }
}
