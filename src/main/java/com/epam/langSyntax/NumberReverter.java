package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int result = 0;
        while (number > 0) {
            result = result *10;
            result = result + (number % 10);
            number = number /10;
        }
        System.out.println(result);
    }

}
