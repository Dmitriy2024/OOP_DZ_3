
public class Worker extends Employee {


    public Worker(String surName, String name, double salary, int age) {
        super(surName, name, salary, age);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public double calculateAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Рабочий;Возраст %s Среднемесячная заработная плата (фиксированная): %.2f (руб.)",
                surName, name, age, calculateSalary());
    }
}