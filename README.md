# WS2021_Java_Team_2_Service_persons

Mitglieder:
Milena Neumann
Luisa Oswald
Tran Anh Hoang
(Joshua Mainzer)

## Vorstellung unseres Projektes

Unsere Projektgruppe bearbeitet den Service ***Persons*** in der Anwendung für die FH-Erfurt.

Dem Nutzer soll die Möglichkeit geboten werden Nach einer Person suchen zu können, dazu kann dieser verschiedene Attribute in Suchfeldern eingeben beziehungsweite auswählen.
Ihm wird ein Suchverlauf angezeigt und eine Ergebnisliste von zutreffenden Personen.
Aus dieser Liste kann er eine gewünschte Person auswählen und Anschließend wird ihm eine Detailansicht von der Person angezeigt.

Wir haben uns dazu entschieden den Service wiederum in mehrere Klassen aufzuteilen um das ganze Modular und Abgekapselt aufbauen zu können.
Die verschiedenen Klassen haben wir unter den Gruppenmitgliedern wie Folgt aufgeteilt:
 - Milena Neumann: CInputField, CDeleting
 - Luisa Oswald: CPerson, CEditingPersonDataSet, CNewPersonDataSet
 - Tran Anh Hoang: CSearching Result, CSearchingHistory
 - (Joshua Mainzer): CPersonalInformationDetails


### CInputfield

Hier wird die Zuständigkeit für die Benutzereingabe abgebildet, die Eingaben werden auf korrektheit geprüft und anschließend in eine Liste eingetragen welche der nächsten Klasse zur Verfügung gestellt wird. Die Zeichenketten werden auf unerwünschte Sonderzeichen und Länge geprüft, damit nur Sinnvolle eingaben an die nächste Klasse weitergegeben werden.

### CDeleting

Zum löschen eines Datensatzes gibt es eine Liste in die beim Löschvorgang eine Referenz zu der Person hinzugefügt wird. Somit kann später von Administratoren eine Liste aufgerufen werden durch die diese wissen welche Personen aus der Datenbank zu löschen sind.
Bei der Anzeige der Suchergebnisse von Personen werden nach einem Abgleichen der Löschliste die jeweiligen gelöschten Personen und deren Daten nicht angezeigt, beziehungsweite wird eine Meldung angezeigt, welche besagt, dass der gesuchte Datensatz zu der Person nicht mehr existiert.

### CPerson

Die Daten einer Person werden als Objekt der Klasse CPerson erzeugt, in einer Hashmap werden alle Attribute die für unseren Service von bedeutung sind gespeichert, auf diese Daten können von anderen Klassen aus über Setter und Getter zugegriffen werden.
Desweiteren sind die Personen in Subklassen unterteilt, da die verschiedenen Personen unterschiedliche Attribute haben 

### CEditingPersonDataSet

Hier können alle Personenbezogenen Daten bearbeitet werden, die Eingabedaten werden durch Setter aus der Klasse CPerson berichtigt

### CNewPersonDataSet

Es kann eine neue Person erstellt werden, hierzu wird ein neues Objekt der Klasse CPerson erstellt und die Attribute werden gesetzt

### CSearchHistory

Der Nutzer der App kann bei der Suche einer Person auch seinen vorherigen Suchverlauf einsehen, dies kann gegebenenfalls den Suchaufwand für den Nutzer erleichtern, falls dieser regelmäßg auf die Daten einer bestimmten Person zugreifen muss.
Dies Wird ebenfalls über eine Hashmap und Container realisiert.

### CSearchingResult

Die Eingaben werden nach einer Prüfung und Weitergabe duch CInputField mit den bereits existierenden Datensätzen zu Personen Verglichen, wenn es übereinstimmende Datensätze gibt werden die passenden Personen als Ergebnisliste angezeigt.

### CPersonalInformationDetails

Der Nutzer kann nun aus der Liste der übereinstimmenden Personen eine gewünschte auswählen und anschließend werden Ihm die vorgesehenen Daten zu dieser Person angezeigt.
Dieser kann nun Telefonnummer, Raum, Adresse und Foto zusätzlich zu Vor- und Nachnamen sehen.



## In der Bearbeitung der Funktionalitäten gibt es mehrere wichtige Meilensteine

### 1. Meilenstein

Die Vorgehensweise für unseren Sevice wurde gemeinsam gesprochen, die bisherige App wurde analysiert und Schwachstellen wurden ausfindig gemacht, es wurden erste Ideen gesammtelt, wie diese Schwachstellen zukünftig vermieden werden könnten und welche Notwendigen und wünschenswerden Funktionalitäten Implementiert werden sollten.
In weiteren Gruppentreffen wurden Diagramme erstellt um die Ideen und Funktuinalitäten zu visualisieren und verständlich zu machen.
Der Service wurde in verschiedene Klassen unterteilt und diese wiederum unseren Gruppenmitgliedern zugeteilt.

### 2. Meilenstein

Die verschiedenen Klassen wurden in Klassendiagrammen genauer definiert. Es wurde festgelegt welche Attribute und Methoden in den jeweiligen Klassen gebraucht werden und welche Schnittstellen es zwischen den Klassen geben muss.
Ebenfalls wurden Schnittstellen von anderen Projektgruppen berücksichttigt und im Klassendiagramm hinterlegt
Erste Ansätze zum Programmieren einiger Klassen wurden getätigt und bei Gruppentreffen überarbeitet und besprochen.

### 3. Meilenstein

Hier wurde der Großteil der Klassen und Methoden fertig Programmiert und besprochen.
