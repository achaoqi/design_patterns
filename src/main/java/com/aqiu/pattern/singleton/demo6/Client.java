package com.aqiu.pattern.singleton.demo6;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        writeObjectToFile();
        Singleton singleton = readFileToObject();
        Singleton instance = Singleton.getInstance();
        System.out.println(instance==singleton);
    }

    static void writeObjectToFile() throws IOException {
        Singleton instance = Singleton.getInstance();
        ObjectOutputStream oos=new ObjectOutputStream(Files.newOutputStream(Paths.get("./file.txt")));
        oos.writeObject(instance);
        oos.flush();
        oos.close();
    }

    static Singleton readFileToObject() throws IOException, ClassNotFoundException {
        ObjectInputStream ois=new ObjectInputStream(Files.newInputStream(Paths.get("./file.txt")));
        Object object = ois.readObject();
        return (Singleton) object;
    }
}
