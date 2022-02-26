package com.company;

public class FibSimple {

    public static int fibSimp(int n)
    {
        int next = 1;
        int value = 0;
        int memory;

        if (n == 0)
            return value;
        for (int i = 2; i <= n; i++)
        {
            memory = value + next;
            value = next;
            next = memory;
        }
        return next;
    }
}
