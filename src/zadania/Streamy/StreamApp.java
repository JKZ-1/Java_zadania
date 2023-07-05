package zadania.Streamy;

import zadania.computer.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamApp {
    public static void main(String[] args) {

        List<Computer> computers = new ArrayList<>();
        computers.add(new Laptop("name1", "type1", new Hdd("brand1", 500), new Ram("brand1", 128), 100));
        computers.add(new Laptop("name2", "type2", new Hdd("brand1", 500), new Ram("brand1", 128), 100));
        computers.add(new Laptop("name3", "type3", new Hdd("brand1", 256), new Ram("brand1", 128), 100));
        computers.add(new Laptop("name4", "type4", new Hdd("brand1", 500), new Ram("brand1", 128), 100));
        computers.add(new PC("PCname1", "PCtype1", new Hdd("brand1", 500), new Ram("brand1", 128)));
        computers.add(new PC("PCname2", "PCtype2", new Hdd("brand1", 256), new Ram("brand1", 256)));
        computers.add(new PC("PCname3", "PCtype3", new Hdd("brand1", 500), new Ram("brand1", 128)));
        //1. Zliczyć wszystkie komputery, które mają więcej niż 128 gb ramu
        //2. Wyświetlić na konsolę wszystkie typy komputerów - map
        //3. Wyświetlić komputer, który ma najwięcej ramu
        //4. Utworzyć nową kolekcję z komputerami, które mają dysk twardy mniejszy niż 500 gb
        //5. Posortować komputery po nazwie i typie
        //6. Przećwiczyć Optional (get(), isPresent(), isEmpty(), orElse(), orElseGet(), orElseThrow(), ifPresent(), ifPresentOrElse()

        long count = computers.stream().
                filter(computer -> computer.getRam().getSize() > 128)
                .count();
        System.out.println(count);

        computers.stream()
                .map(Computer::getType)
                .forEach(System.out::println);

        Optional<Ram> max = computers.stream()
                .map(Computer::getRam)
                .max(Comparator.comparingInt(Ram::getSize));
        System.out.println(max);

        List<Computer> Hdd500 = computers.stream()
                .filter(comp -> comp.getHdd().getSize() < 500)
                .collect(Collectors.toList());
        for (Computer comp : Hdd500) {
            System.out.println(comp.getName() + " " + comp.getHdd());
        }

        List<Computer> sorted = computers.stream()
                .sorted(Comparator.comparing(Computer::getName).thenComparing(Computer::getType))
                .collect(Collectors.toList());
        for (Computer computer : sorted) {
            System.out.println(computer.getName() + " " + computer.getType());
        }
    }
}
