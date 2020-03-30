package isp.lab5.exercise5;

import java.util.Random;

public class Lion extends  Animal implements Carnivorous{

    Random chance = new Random();
    private int chanceToHuntSuccessfully=chance.nextInt(100);

    public Lion(String species, int age){
        this.species=species;
        this.age=age;
    }

    @Override
    void eat() {
        System.out.println("Lion{meat}");
    }

    @Override
    public void huntSuccessfully() {
        System.out.println("${Lion} ${"+species+"} hunt successfully at age ${"+age+"} with a chance of ${"+chanceToHuntSuccessfully+"}%");
    }

    @Override
    public void huntFailed() {
        System.out.println("${Lion} ${"+species+"} hunt failed at age ${"+age+"} with a chance of ${"+chanceToHuntSuccessfully+"}%");
    }

    @Override
    public int getChancesToHuntSuccessfully() {
        return chanceToHuntSuccessfully;
    }
}
