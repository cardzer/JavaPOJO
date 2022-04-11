package catsAndOwners.models;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Cat {
    private String name;
    private String colour;
    private Integer age;
    private boolean microchip;

    public Cat(String name, String colour, Integer age, boolean microchip) {
        this.name = name;
        this.colour = colour;
        this.age = age;
        this.microchip = microchip;
    }

    public Cat() {
    // null constructor
    }

    public List<Cat> generateCats() {
        return Stream.of(
                        new Cat("Rex", "Black", 1, true),
                        new Cat("Dino", "White", 2, false),
                        new Cat("Katsu", "Ginger", 10, false),
                        new Cat("Mik", "White", 5, false))
                .collect(Collectors.toList());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public boolean isMicrochip() {
        return microchip;
    }

    public void setMicrochip(boolean microchip) {
        this.microchip = microchip;
    }
}
