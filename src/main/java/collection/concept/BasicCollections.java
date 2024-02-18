package collection.concept;

import collection.concept.stationaries.Stationary;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class BasicCollections {
    public static void main(String[] args) {
        Collection<Stationary> pencilBox = new ArrayList<>();
        pencilBox.add(new Stationary("pencil", 3));
        pencilBox.add(new Stationary("pen", 5));
        pencilBox.add(new Stationary("eraser", 10));
        pencilBox.add(new Stationary("pencil", 12));

        // Using while loop
        for (Stationary v : pencilBox) {
            if(v.getName().equals("pencil")){
                System.out.printf("%s has value: %d\n", v.getName(), v.getCount());
            }
        }

        // Up to JDK 5 we needed to use
        Iterator<Stationary> iterator = pencilBox.iterator();
        // Using while loop
        while(iterator.hasNext()){
            Stationary v = iterator.next();
            if(v.getName().equals("pencil")){
                System.out.printf("%s has value: %d\n", v.getName(), v.getCount());
            }
        }

    }
}
