package org.example.task3;

/**
 Задание 3.1
 Создайте класс исключения, который будет выбрасываться при делении на 0.
 Исключение должно отображать понятное для пользователя сообщение об ошибке.
 */
public class DivideByZeroException extends ArithmeticException {
    public DivideByZeroException(){
        super("Делить на ноль нельзя");
    }
}
