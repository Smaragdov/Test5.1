
package ru.netology.services;

public class Main {
    public static void main(String[] args) {
        Calc service = new Calc();
        int hollyday = service.calculate(10_000, 3_000, 20_000);
        System.out.println();
        System.out.println("В этом году отдыхать " + hollyday + " месяца");
    }
}
