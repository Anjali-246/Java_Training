package SerializationAndDeserialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws IOException {

        Serialization1 s=new Serialization1(1,"Anjali");
        s.display();

        String path="C:\\Users\\hp\\IdeaProjects\\Day 1\\src\\SerializationAndDeserialization\\f1.txt";

        FileOutputStream fos=new FileOutputStream(path);
        ObjectOutputStream oos=new ObjectOutputStream(fos);

        oos.writeObject(s);
        oos.close();
        fos.close();



    }
}
