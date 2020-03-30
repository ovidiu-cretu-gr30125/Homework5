package isp.lab5.exercise5;

import java.util.Random;

public class Dear extends Animal implements  Herbivorous{

    Random chance = new Random();
    private int chanceToRunSuccessfully=chance.nextInt(100);

    public Dear(String species, int age){
        this.species=species;
        this.age=age;
    }

    @Override
    void eat() {
        System.out.println("Dear{grass}");
    }

    @Override
    public void runSuccessfully() {
        System.out.println("${Dear} ${"+species+"} run successfully at age ${"+age+"} with a chance of ${"+chanceToRunSuccessfully+"}%");
    }

    @Override
    public void runFailed() {
        System.out.println("${Dear} ${"+species+"} run failed at age ${"+age+"} with a chance of ${"+chanceToRunSuccessfully+"}%");
    }

    @Override
    public int getChancesToRunSuccessfully() {
        return chanceToRunSuccessfully;
    }
}
