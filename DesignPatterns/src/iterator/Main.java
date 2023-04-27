package org.example.iterator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String names[] = {"Robert", "Mihai", "Andrei", "Ioana", "Georgiana"};

        NameRepository repository = new NameRepository(names);
        Iterator iterator = repository.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
