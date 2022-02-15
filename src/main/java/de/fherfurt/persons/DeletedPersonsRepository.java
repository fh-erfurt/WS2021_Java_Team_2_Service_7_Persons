package de.fherfurt.persons;

import java.util.ArrayList;
import java.util.List;

public class DeletedPersonsRepository {
    private final List<DeletedPerson> storage = new ArrayList<>();

    public void persist(DeletedPerson person) {
        storage.add(person);
    }


    public boolean isPersonDeleted(int personNumber)
    {
        if (storage.contains(personNumber))
        {
            return true;
        }
        return true;
    }
}
