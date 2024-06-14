package com.aqiu.pattern.prototype.test;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CitationTest {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        Citation c1=new Citation();
        Student student=new Student("张三");
        c1.setStudent(student);

        //创建对象输出流对象
        Path path = Paths.get("D:\\mm\\b.txt");
        ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path));
        //将c1对象写出到文件中
        oos.writeObject(c1);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path));
        //读取对象
        Citation c2 = (Citation) ois.readObject();
        //获取c2奖状所属学生对象
        Student stu1 = c2.getStudent();
        stu1.setName("李四");

        c1.show();
        c2.show();
    }
}
