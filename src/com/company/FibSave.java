package com.company;

import java.util.ArrayList;
import java.util.List;

public class FibSave {

    public static List<Integer> fibMass= new ArrayList(); // создаем массив

    public static int fibSave(int n) {

        int i;

        if( fibMass.size()==0 ) {   // Добавляем 0 и 1 элемент последовательности
            fibMass.add(0);
            fibMass.add(1);
        }
        for (i = fibMass.size(); i <= n; i++) {
            fibMass.add(fibMass.get(i - 1) + fibMass.get(i - 2));
        }

        return fibMass.get(n);

    }
}
