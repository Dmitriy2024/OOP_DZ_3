
public class Freelancer extends Employee {


    public Freelancer(String surName, String name, double salary, int age) {
        super(surName, name, salary, age);
    }


    public  double calculateAge(){
        return age;
    }

    @Override
    public double calculateSalary() {
        return salary;
    }



    @Override
    public String toString() {
        return String.format("%s %s; Фрилансер ;Возраст %s; Среднемесячная заработная плата (среднемесячная заработная плата): %.2f (руб.)",
                surName, name, age, calculateSalary());
    }
}