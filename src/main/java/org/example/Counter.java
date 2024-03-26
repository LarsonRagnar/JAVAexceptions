package org.example;

import java.io.IOException;

/**
 Создайте класс Счетчик, у которого есть метод add(), увеличивающий значение
 внутренней int переменной на 1. Сделайте так, чтобы с объектом такого типа
 можно было работать в блоке try-with-resources. Подумайте, что должно происходить
 при закрытии этого ресурса? Напишите метод для проверки, закрыт ли ресурс.
 При попытке вызвать add() у закрытого ресурса, должен выброситься IOException
 */
public class Counter implements AutoCloseable{
    public int counter=0;
    public  boolean isClosed= false;
    public void add() throws IOException {
        if (isClosed){
            throw new IOException("ресурс уже закоыт");
        }
        this.counter++;
    }


    @Override
    public void close() throws Exception {
        if (!isClosed){
            this.isClosed=true;
        }else {
            throw new IOException("ресурс уже закоыт");
        }
    }
}

class Main1 {
    public static void main(String[] args) throws Exception {
        Counter counter = new Counter();
        try (counter) {
            System.out.println(counter.counter);
            counter.add();
            System.out.println(counter.counter);
        }

    }
}
