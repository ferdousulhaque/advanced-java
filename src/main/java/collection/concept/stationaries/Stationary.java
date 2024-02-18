package collection.concept.stationaries;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Stationary {
    private String name;
    private Integer count;
    public Stationary(String name, Integer count) {
        this.name = name;
        this.count = count;
    }
}
