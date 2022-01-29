package de.fherfurt.persons;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;

enum Faculty
{
    AI, GE
}

public class cInputSearch {
    /*
        String Str = new String("Welcome to Tutorialspoint.com");
        System.out.print("Return Value :");
        System.out.println(Str.toLowerCase());
        inFirstName = inFirstName.toLowerCase();  // damit soll groß- oder Kleinschreibung der eingabe ignoriert werden
        inLastName = inLastName.toLowerCase();
    */
    private String inFirstName;
    private String inLastName;
    private String inModul;
    private Faculty inFaculty;  //enum

    ArrayList PersonInputData = new ArrayList();

    public cInputSearch() // Konstruktor//String inFirstName, String inLastName, String inModul, de.fherfurt.persons.Faculty inFaculty
    {
        this.inFirstName    = inFirstName;
        this.inLastName     = inLastName;
        this.inModul        = inModul;
        //this.inFaculty      = inFaculty;
    }

    boolean setInputFaculty(String inFaculty)
    {
        //Methode --> prüft inFaculty == zu einem Enum Wert dazugehört
        this.inFaculty = checkEnumValue();
    }

    void setListSearchInput()
    {
        PersonInputData.add(this.inFirstName);
        PersonInputData.add(this.inLastName);
        PersonInputData.add(this.inModul);
        PersonInputData.add(this.inFaculty);
    }

    ArrayList getListSearchInput()
    {
        return PersonInputData;
    }


    public boolean checkStringValid(String inStringToCheck)
    {

        String StringToCheck = inStringToCheck;
        char FirstCharacterOfTheString = StringToCheck.charAt(0);

        if (StringToCheck.length() > 30) {
            System.out.println("Der eingegebene Name ist zu lang!");
            return false;
        }

        if (FirstCharacterOfTheString == ' ') {
            System.out.println("Das erste Zeichen darf kein Leerzeichen sein, bitte prüfen");
            return false;
        }

        if (StringToCheck == null || StringToCheck.trim().isEmpty())
        {
            System.out.println("Die Zeichenkette hat ein falsches Format");
            return false;
        }
        Pattern p = Pattern.compile("[^A-Za-z0-9]");
        Matcher m = p.matcher(StringToCheck);
        // boolean b = m.matches();
        boolean b = m.find();
        if (b)
        {
            System.out.println("Es ist ein nicht erlaubtes Zeichen in der Eingabe");
            return false;
        }
        return true;

        // inspiriert von folgender Quelle https://qastack.com.de/programming/1795402/check-if-a-string-contains-a-special-character
    }


    boolean checkFieldInputValid()
    {

        // && ( checkStringValid(this.inFaculty) == true) => hier muss ein Enum vergleichen werden
        if ((checkStringValid(this.inFirstName))  && ( checkStringValid(this.inLastName))  && ( checkStringValid(this.inModul)))
        {
            setListSearchInput();  //Wenn ja sollen dann Parameter in Liste getzt werden
            return true;
        }
        //Bei return Angaben einer Methode auch bitte einen return zurück geben
        return false;
    }




    public static void main(String[] args) {
        cInputSearch SearchPerson = new cInputSearch();
        SearchPerson.setInputFaculty("AI");
    }

}
