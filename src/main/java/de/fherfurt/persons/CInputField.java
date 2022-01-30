package de.fherfurt.persons;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;

enum Faculty //schnittstelle
{
    GEAI,LAGAF,WLV,BKR,ASP,AS   //Abkürzungen der Fakultäten, diese sollen im Anschluss wieder aufgeschlüsselt werden
}

public class CInputField {
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
    ArrayList<String> PersonInputData = new ArrayList<>();

    public CInputField(String inFirstName, String inLastName, String inModul, Faculty inFaculty ) // Konstruktor String inFirstName, String inLastName, String inModul, Faculty inFaculty
    {
        this.inFirstName    = inFirstName;
        this.inLastName     = inLastName;
        this.inModul        = inModul;
        this.inFaculty      = inFaculty;
    }

    // get-Methode um Zugriff auf die Liste zu gestatten
    ArrayList<String> getListSearchInput()
    {
        return PersonInputData;
    }

    // Hier wird die Methode zum checken der Strings auf die Attribute angewendet und beim erfolgreichen
    // Check wird die Funktion zum Setzen der Daten in die Übergabeliste aufgerufen.
    private boolean checkFieldInputValid()
    {
        if    ((checkStringValid(this.inFirstName))
            && (checkStringValid(this.inLastName))
            && (checkStringValid(this.inModul)))
        {
            setListSearchInput();  //Parameter werden in die Liste gesetzt
            return true;
        }
        return false;
    }


    // Das Atteibut Faculty wird als Enum übergeben
    // und dann über Switch-Case quasi in einen ausgeschrieben String umgewandelt und zurückgegeben
    private String checkFacultyValid(Faculty inFaculty)
    {
        String result;
        switch(inFaculty)
        {
            case GEAI:
                result = "Gebäudetechnik und Informatik";
            break;
            case LAGAF:
                result = "Landschaftsarchitektur, Gartenbau und Forst";
            break;
            case WLV:
                result = "Wirtschaft-Logistik-Verkehr";
            break;
            case BKR:
                result = "Bauingenieurwesen und Konservierung/Restaurierung";
            break;
            case ASP:
                result = "Architektur und Stadtplanung";
            break;
            case AS:
                result = "Angewandte Sozialwissenschaften";
                break;

            default:
                System.out.println("Die eingegebene Fakultät existiert nicht oder ist falsch geschreiben");
                result = " ";
            break;

        }
        return result;
    }



    // Diese Funktion wird aufgerufen um die engültig geprüften Attribute in die Liste einzufügen
    private void setListSearchInput()
    {
        PersonInputData.add(this.inFirstName);
        PersonInputData.add(this.inLastName);
        PersonInputData.add(this.inModul);
        PersonInputData.add(checkFacultyValid(inFaculty)); // Enum wurde geprüft und passender String wird in die Liste eingetragen
    }



    // Strings werden auf Fehler wie Sonderzeichen oder Länge überprüft
    public boolean checkStringValid(String StringToCheck)   // public damit auch andere auf die Checkfunktion zugreifen können
    {
        char FirstCharacterOfTheString = StringToCheck.charAt(0);

        if (StringToCheck.length() > 30) {
            System.out.println("Der eingegebene Name ist zu lang!");
            return false;
        }

        if (FirstCharacterOfTheString == ' ') {
            System.out.println("Das erste Zeichen darf kein Leerzeichen sein, bitte prüfen");
            return false;
        }

        if (StringToCheck.trim().isEmpty())
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
 }

