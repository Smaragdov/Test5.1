package ru.netology.services;
public class Calc {


    public int calculate(int income, int expenses, int threshold) {
        int count = 0;
        int money = 0;
        for (int i = 1; i <= 12; i++) {
            if (money >= threshold) {
                count++;
                //System.out.printf("Месяц %d. Денег %d. Буду отдыхать. Потратил -%d, ", i, money, expenses);
                money -= expenses;
                double doubleSpending = money / 3.0 * 2;
                int spending = (int) Math.ceil(doubleSpending);
                //System.out.printf("потом еще -%d.\n", spending);
                money -= spending;
            } else {
                //System.out.printf("Месяц %d. Денег %d. Придется работать. Заработал %d, потратил -%d\n", i, money, income, expenses);
                money += income;
                money -= expenses;
            }
        }

        return count;
    }

}
