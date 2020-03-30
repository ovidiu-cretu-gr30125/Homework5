package isp.lab5.exercise5;

import java.util.Random;

public class Elk extends Animal implements Herbivorous {

    Random chance = new Random();
    private int chanceToRuntSuccessfully=chance.nextInt(100);

    public Elk(String species, int age){
        this.species=species;
        this.age=age;
    }

    @Override
    void eat() {
        System.out.println("Elk{grass}");
    }

    @Override
    public void runSuccessfully() {
        System.out.println("${Elk} ${"+species+"} run successfully at age ${"+age+"} with a chance of ${"+chanceToRuntSuccessfully+"}%");
    }

    @Override
    public void runFailed() {
        System.out.println("${Elk} ${"+species+"} run failed at age ${"+age+"} with a chance of ${"+chanceToRuntSuccessfully+"}%");
    }

    @Override
    public int getChancesToRunSuccessfully() {
        return chanceToRuntSuccessfully;
    }
}
