package com.company;

public class FibRecursion {

    public static int fibRec(int n) {  // n - номер числа в последовательности фиббоначи
        if (n <= 1)
            return n;
        return fibRec(n-1) + fibRec(n-2);
    }
}
