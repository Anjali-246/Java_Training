package SerializationAndDeserialization;

import java.io.Serializable;

public class Serialization1 implements Serializable {

    int id;
    String name;

    public Serialization1(int id, String name){
        this.id=id;
        this.name=name;

    }

    public void display(){
        System.out.println(id);
        System.out.println(name);
    }
}
