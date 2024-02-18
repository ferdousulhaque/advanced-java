package collection.concept;

import collection.concept.stationaries.Stationary;

import java.util.ArrayList;
import java.util.Collection;

public class LambdaExpression {
    public static void main(String[] args) {
        Collection<Stationary> pencilBox = new ArrayList<>();
        pencilBox.add(new Stationary("pencil", 3));
        pencilBox.add(new Stationary("pen", 5));
        pencilBox.add(new Stationary("eraser", 10));
        pencilBox.add(new Stationary("pencil", 12));

        pencilBox.stream().filter(
                item -> item.getName().equals("pencil")
        ).forEach(
                v -> System.out.printf("%s has value: %d\n", v.getName(), v.getCount())
        );
    }
}
