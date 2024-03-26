package org.example.task3;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Task3 {
    public static void main(String[] args) {
        divide(34,0);
    }
    public static double divide(int a,int b){
       if (b==0){
           throw new DivideByZeroException();
       }
        return a/b;
    }
    public  static void fileNotFound(String pathFile) throws NonExistedFileException {

        try {
            FileReader fr =new FileReader(pathFile);
        } catch (FileNotFoundException e) {
            throw new NonExistedFileException();
        }
    }
}
