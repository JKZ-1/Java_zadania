package zadania.Collections;

import zadania.Interface.Bug;
import zadania.Interface.BugReporter;

import java.util.*;

//1. Utwórz listę bugów
//2. Z listy bugów wyciągnij tylko unikalne wartości
//3. Posortuj unikalne bugi po polu bug description
public class CollectionsApp {
    public static void main(String[] args) {

        List<Bug> bugs = new ArrayList<>();
        bugs.add(new Bug("bug1", new BugReporter("Tomek", "N1", "mail@1"), 10));
        bugs.add(new Bug("bug2", new BugReporter("Aneta", "N2", "mail@2"), 20));
        bugs.add(new Bug("bug3", new BugReporter("Romek", "N3", "mail@3"), 30));
        bugs.add(new Bug("bug4", new BugReporter("Marek", "N4", "mail@4"), 40));
        bugs.add(new Bug("bug4", new BugReporter("Marek", "N4", "mail@4"), 40));

        Set<Bug> bugsSet = new HashSet<>(bugs);
        Set<Bug> sortedBugs = new TreeSet<>(bugsSet);
        for (Bug bug : sortedBugs) {
            System.out.println(bug.getDescription());
        }
    }
}

