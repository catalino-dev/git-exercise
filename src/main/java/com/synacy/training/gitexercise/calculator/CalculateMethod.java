package com.synacy.training.gitexercise.calculator;

import java.util.Arrays;

public enum CalculateMethod {
    ADD {
        @Override
        public String calculate(String[] args) {
            double a = Double.valueOf(args[0]);
            double b = Double.valueOf(args[1]);
            return String.valueOf(a + b);
        }
    };

    public abstract String calculate(String[] args);

    public static CalculateMethod of(String name) {
        return Arrays.stream(values())
                .filter(method -> method.name().equals(name.toUpperCase()))
                .findFirst()
                .orElse(null);
    }
}
