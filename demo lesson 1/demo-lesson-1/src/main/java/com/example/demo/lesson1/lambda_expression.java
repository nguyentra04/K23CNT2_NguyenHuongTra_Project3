package com.example.demo.lesson1;

@FunctionalInterface
interface Calculator1 {
    int add(int a, int b);
}

@FunctionalInterface
interface Calculator2 {
    void add(int a, int b);
}

public class Lambda_Expression {
    public static void main(String[] args) {
        Calculator1 c1 = (a, b) -> a + b;
        System.out.println(c1.add(3, 5));

        Calculator2 c2 = (a, b) -> System.out.println("Sum: " + (a + b));
        c2.add(10, 15);
    }
}
