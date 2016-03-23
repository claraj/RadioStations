package com.company;

public class Station implements Comparable<Station> {

    private String name;
    private double frequency;

    public Station(String name, double frequency) {
        this.name = name;
        this.frequency = frequency;

    }

    public String toString() {
        return String.format("Name: %s, frequency %.1f FM", name, frequency);
    }

    /** Provide the ability to sort stations by frequency */
    @Override
    public int compareTo(Station s) {

        // If this object should be considered 'greater than' s,
        // it should be come after s in the list when sorted,
        // then return 1
        if (this.frequency > s.frequency) {
            return 1;
        }

        // But, if this object is 'less than' s,
        // and it should come before it in a list when sorted,
        // then return -1
        else if (this.frequency < s.frequency) {
            return -1;
        }

        // If the two are equal, return 0.
        else {
            return 0;
        }

        /*
        // If frequency was a Double (instead of double) could do this instead
        return this.frequency.compareTo(s.frequency);
         */
    }
}
