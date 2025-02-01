package org.example;


import java.math.BigInteger;

public class Factorial {
    public String factorial(String n) {
        try {
            BigInteger num = new BigInteger(n);
            if (num.compareTo(BigInteger.ZERO) < 0)
                throw new IllegalArgumentException();

            return String.valueOf(findFactorial(num));
        } catch (NumberFormatException | NullPointerException e) {
            throw new IllegalArgumentException();
        }
    }

    private BigInteger findFactorial(BigInteger num) {
        if (num.equals(BigInteger.valueOf(0)))
            return BigInteger.ONE;

        return num.multiply(findFactorial(num.subtract(BigInteger.ONE)));
    }

}
