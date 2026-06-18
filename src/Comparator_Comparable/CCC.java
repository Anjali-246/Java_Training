package Comparator_Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Students {
    int roll;
    String name;

    Students(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    @Override
    public String toString() {
        return roll + " " + name;
    }
}

public class CCC {
    public static void main(String[] args) {

        ArrayList<Students> list = new ArrayList<>();

        list.add(new Students(10, "A"));
        list.add(new Students(50, "E"));
        list.add(new Students(20, "B"));
        list.add(new Students(40, "D"));
        list.add(new Students(30, "C"));

        Comparator<Students> com = new Comparator<Students>() {
            public int compare(Students a, Students b) {
                if (a.roll > b.roll) {
                    return 1;
                } else if (a.roll < b.roll) {
                    return -1;
                }
                return 0;
            }
        };

        Collections.sort(list, com);

        System.out.println(list);
    }
}