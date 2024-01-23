package ru.netology.javaqa.Moneymvn.services;

public class WorkRestService {
    public int calculate(int income, int expenses, int threshold) {
        int months = 0; // счетчик месяцев отдыха
        int money = 0; // количество денег на счету


        for (int i = 0; i < 12; i++) {
            if (money >= threshold) { // можем ли отдыхать?
                months++; // увеличиваем счётчик месяцев отдыха
                money = ((money - expenses) / 3);
            } else {
                money = (money + income) - expenses; // количество денег на счету - ежемес траты
            }
        }
        return months;

    }
}
