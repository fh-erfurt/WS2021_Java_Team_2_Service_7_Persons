/*package de.fherfurt.persons;
import java.util.HashMap;

public class CDeleting
{
    private int HashMapKey;
    private HashMap<Integer, Integer>PersonsToDelete = new HashMap<>();
    private int PersonID;

    public CDeleting(int HashMapKey, int PersonID) // Konstruktor
    {
        this.PersonID = PersonID;
        this.HashMapKey = HashMapKey;
    }

    // Die ID der zu löschenden Person wird in die Liste gesetzt damit später bekannt ist welche Personen endgültig gelöscht werden sollen
    void setDeletedPerson()
    {
        PersonsToDelete.put(this.HashMapKey, this.PersonID);
    }

    // Sobald die Personen tatsächlich gelöscht wurden können diese aus dieser Liste entfertn werden
    void removePersonFromTableToDelete()
    {
       PersonsToDelete.remove(HashMapKey);
    }
}
*/


package de.fherfurt.persons;

public class Deleting {

    private final DeletedPersonsRepository deletedPersonsRepository = new DeletedPersonsRepository();

    public Deleting() {
    }

    public void delete(int deletedPersonsRepositoryKey, int personNumber) {
        DeletedPerson deletedPerson = DeletedPerson.builder().build();
        deletedPersonsRepository.persist(deletedPerson);
    }
}