package com.company;

import java.util.ArrayList;
import java.util.List;

public class FibSave {

    public static List<Integer> fibMass= new ArrayList(); // создаем массив

    // Добавляем 0 и 1 элемент последовательности
    static {
        fibMass.add(0);
        fibMass.add(1);
    }

    public static int fibSave(int n) {
        int i;

        for (i = fibMass.size(); i <= n; i++) {
                fibMass.add(fibMass.get(i - 1) + fibMass.get(i - 2));
            }
        return fibMass.get(n);

    }
}
