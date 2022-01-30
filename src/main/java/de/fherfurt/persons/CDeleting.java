package de.fherfurt.persons;
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
