package de.fherfurt.persons;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;

enum Faculty
{
    GEAI,LAGAF,WLV,BKR,ASP,AS
}

/**
 * The InputField Class is the place where the Input from the searching user gets
 * checked and put into a list for the Following service
 *
 * @ author Milena Neumann
 */
public class InputField
{

    private String inFirstName;
    private String inLastName;
    private String inModul;
    private Faculty inFaculty;
    ArrayList<String> PersonInputData = new ArrayList<>();

    public InputField(String inFirstName, String inLastName, String inModul, Faculty inFaculty ) // Konstruktor String inFirstName, String inLastName, String inModul, Faculty inFaculty
    {
        this.inFirstName    = inFirstName;
        this.inLastName     = inLastName;
        this.inModul        = inModul;
        this.inFaculty      = inFaculty;
    }

    /**
     * getter for comparing
     * @return the data-list of person information
     */
    public ArrayList<String> getListSearchInput()
    {
        return PersonInputData;
    }

    /**
     * changes the Faculty shortcut to an out written string
     *
     * @param inFaculty the Faculty from the Input
     * @return the changed faculty-name
     */
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
                System.out.println("Die eingegebene Fakultät existiert nicht oder ist falsch geschrieben");
                result = " ";
            break;

        }
        return result;
    }


    /**
     * the checked and edit input from the user is added into the PersonInputDate-List
     */
    public void setListSearchInput()
    {
        if    ((checkStringValid(this.inFirstName))
                && (checkStringValid(this.inLastName))
                && (checkStringValid(this.inModul)))
        {
            PersonInputData.add(this.inFirstName);
            PersonInputData.add(this.inLastName);
            PersonInputData.add(this.inModul);
            PersonInputData.add(checkFacultyValid(inFaculty)); // Enum wurde geprüft und passender String wird in die Liste eingetragen
        }
        else
        {
            System.out.println("Bei der Eingabe ist etwas schiefgelaufen, bitte versuchen Sie es erneut");
        }
    }

    /**
     * The function checks if there are some mistakes like not allowed special characters
     *
     * @param StringToCheck the input string which will be checked for different mistakes
     * @return if the string is appropriate returns true, if there is a problem it returns false
     *
     * src https://qastack.com.de/programming/1795402/check-if-a-string-contains-a-special-character
     */
    public static boolean checkStringValid(String StringToCheck)   // public damit auch andere auf die Checkfunktion zugreifen können
    {
        char FirstCharacterOfTheString = StringToCheck.charAt(0);

        if (StringToCheck.length() > 30)
        {
            System.out.println("Der eingegebene Name ist zu lang!\nErlaubte Anzahl an Zeichen: 30");
            return false;
        }

        if (FirstCharacterOfTheString == ' ')
        {
            System.out.println("Das erste Zeichen darf kein Leerzeichen sein, bitte prüfen");
            return false;
        }

        if (StringToCheck.trim().isEmpty())
        {
            System.out.println("Die Zeichenkette hat ein falsches Format");
            return false;
        }

        Pattern p = Pattern.compile("[^A-Za-z -]");
        Matcher m = p.matcher(StringToCheck);
        boolean b = m.find();

        if (b)
        {
            System.out.println("Es ist ein nicht erlaubtes Zeichen in der Eingabe\n Erlaubte Zeichen sind: Großbuchstaben, Kleinbuchstaben, Leerzeichen und Bindestrich");
            return false;
        }
        return true;
    }
 }

