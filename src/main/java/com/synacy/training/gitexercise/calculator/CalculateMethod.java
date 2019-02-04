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
    },
    SUBTRACT {
        @Override
        public String calculate(String[] args) {
            double a = Double.valueOf(args[0]);
            double b = Double.valueOf(args[1]);
            return String.valueOf(a - b);
        }
    },
    MULTIPLY {
        @Override
        public String calculate(String[] args) {
            double a = Double.valueOf(args[0]);
            double b = Double.valueOf(args[1]);
            return String.valueOf(a * b);
        }
    },
    DIVIDE {
        @Override
        public String calculate(String[] args) {
            double a = Double.valueOf(args[0]);
            double b = Double.valueOf(args[1]);
            return String.valueOf(a / b);
        }
    },
    SINE {
        @Override
        public  String calculate(String[] args) {
            double a = Double.valueOf(args[0] + args[1]);
            double b = Double.valueOf(Math.toRadians(a));
            return String.valueOf(Math.sin(b));
        }
    },
    COSINE {
        @Override
        public  String calculate(String[] args) {
            double a = Double.valueOf(args[0] + args[1]);
            double b = Double.valueOf(Math.toRadians(a));
            return String.valueOf(Math.cos(b));
        }
    },
    TAN {
        @Override
        public  String calculate(String[] args) {
            double a = Double.valueOf(args[0] + args[1]);
            double b = Double.valueOf(Math.toRadians(a));
            return String.valueOf(Math.tan(b));
        }
    },
    COTAN {
        @Override
        public  String calculate(String[] args) {
            double a = Double.valueOf(args[0] + args[1]);
            double b = Double.valueOf(Math.toRadians(a));
            return String.valueOf(1.0 / Math.tan(b));
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
