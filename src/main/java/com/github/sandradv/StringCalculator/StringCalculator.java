package com.github.sandradv.StringCalculator;

public class StringCalculator {

    // logical operators > < >= <= || && ==
    public int calc(String numbers){
        if (numbers == "") {
            return 0;
        } else if (numbers.split(",").length >= 2) {
            String[] stringArray = numbers.split(",");
            int total = 0;

            for (String string : stringArray) {
                total += Integer.parseInt(string);
            }

            return total;

        } else {
            return Integer.parseInt(numbers);
        }
    }
}
