package de.fherfurt.persons;
import java.util.HashMap;

public class DeletedPersonsRepository
{


    private int deletedPersonsPointer = 0;
    protected final HashMap<Integer, Integer> deletedPersonStorage = new HashMap<>();  // Liste die gelöschte Personen enthält

    public void persist(int personID)  //Funktion um Person in Liste zu setzen
    {
        if(!isPersonDeleted(personID))
        {
            deletedPersonStorage.put(personID, deletedPersonsPointer);
            deletedPersonsPointer = deletedPersonsPointer + 1;
        }
        else
        {
            System.out.println("die Person wurde bereits gelöscht");
        }
    }

    public boolean isPersonDeleted(int personID)  // Funktion um zu sehen ob bestimmte Person in der Liste steht
    {
        return deletedPersonStorage.get(personID) != null; //wenn bei get was drin ist wird True zurück gegeben also die Person ist in der gelöschtliste
    }

    public boolean removeDeletedPerson(int personID)
    {
        if (isPersonDeleted(personID))
        {
            deletedPersonStorage.remove(personID);
            return true;
        }
        else
        {
            System.out.println("die Person befindet sich nicht in der Gelöschtliste");
            return false;
        }
    }

    public String showDeletedPersons()
    {
        String printList = "";
        for (int i : deletedPersonStorage.keySet())
        {
            printList = printList + i + "\n" ;
        }
        System.out.println(printList);
        return printList;
    }

}