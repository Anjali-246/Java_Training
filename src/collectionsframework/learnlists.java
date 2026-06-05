package collectionsframework;

import java.util.*;

public class learnlists {

    public static void main(String[] args){

        List<String> list=new ArrayList<>(2);
        System.out.println(list.size());
        list.add("10");
        list.add("20");
        list.add("30");
        list.add("Anjali");
        //System.out.println(list);
        //System.out.println(list.size());
        //list.remove(2);
        System.out.println(list);
        //list.removeFirst();
        //System.out.println(list.contains(20));
        //System.out.println(list.get(3));
        //System.out.println(list.getFirst());
        //list.removeLast();
        //System.out.println(list.isEmpty());
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for(String x : list) {
            System.out.println(x);
        }









    }


}
