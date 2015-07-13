package com.itstep.patukhov;

/**
 * Created by lotrik on 13.07.15.
 */
public class Mas {

    public static String getMas(int[] mas) throws MyException {
        for (int i = 0; i < mas.length; i++) {
            if (mas[i]<0) throw new MyException("Отрицательный элемент: " + mas[i] + " на позиции: " + i);
        }
        return "Нет отрицательных чисел";
    }
}
