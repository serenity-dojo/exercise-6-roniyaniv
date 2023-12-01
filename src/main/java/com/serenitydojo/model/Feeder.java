package com.serenitydojo.model;

import java.util.Objects;

public class Feeder {
    public String feeds(String animal, boolean isPremium) {
        if (animal.equals("Cat")) {
            return (isPremium) ? "Salmon" : "Tuna";
        } else if (animal.equals("Dog")) {
            return (isPremium) ? "Deluxe Dog Food" : "Dog Food";
        } else if (animal.equals("Hamster")) {
            return (isPremium) ? "Lettuce" : "Cabbage";
        } else {
            return "Food";
        }

    }
}
