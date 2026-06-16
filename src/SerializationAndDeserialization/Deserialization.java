package SerializationAndDeserialization;

import java.io.*;

public class Deserialization {
    public static void main(String[] args) throws IOException,ClassNotFoundException {


        String path="C:\\Users\\hp\\IdeaProjects\\Day 1\\src\\SerializationAndDeserialization\\f1.txt";

        FileInputStream fis=new FileInputStream(path);
        ObjectInputStream ois=new ObjectInputStream(fis);

        Serialization1 s=(Serialization1) ois.readObject();

        s.display();
        ois.close();
        fis.close();


    }
}
