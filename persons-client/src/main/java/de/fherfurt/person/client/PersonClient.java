package de.fherfurt.person.client;
import de.fherfurt.person.Person;
import java.io.IOException;

public interface PersonClient
{
    Person getPersonDataBy(int PersonID);
    byte[] findPersonAvatarBy(int PersonID);
    void convertByteArrayIntoAvatarImage(int PersonID) throws IOException;
}
