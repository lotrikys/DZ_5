package com.itstep.patukhov;

/**
 * Создать метод, который  перебирает элементы массива
 (int[]), если встречается отрицательное число — создавать
 проверяемое исключение. Метод getMessage()
 должен выдавать на какой позиции находиться отрицательное
 число и само число.На консоль должно быть выдано только первое отрицательное
 число из массива(наименьший индекс)
 * Created by lotrik on 12.07.15.
 */
public class Main {
    static int[] mas = {1,-2,3,4,5,-6,7,8,9,10};

    public static void main(String[] args) {
        try {
            String result = Mas.getMas(mas);
            System.out.println(result);
        } catch (MyException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
