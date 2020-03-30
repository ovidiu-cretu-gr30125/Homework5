package isp.lab5.exercise5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Jungle {
     Herbivorous[] herbivore;

    Carnivorous[] carnivore;

    /**
     * This method generates 20 herbivores animals
     * It takes a random number between 1-19 that represents the number of deers and
     * generates random deers
     * After it cycles through the empty left spaces in the array and fills them with elks following the same principle described above
     * generates random elks
     */
    private void generateRandomHerbivorous(Herbivorous[]herbivorous){
        Random x = new Random();
        int numberOfDears=x.nextInt(20);
        for (int i=0;i<numberOfDears;i++){
            Dear dear = new Dear("00",10);
            herbivorous[i]=dear;
        }
        for (int i=numberOfDears;i<20;i++){
            Elk elk = new Elk("01",20);
            herbivorous[i]=elk;
        }
    }
    /**
     * This method generates 20 carnivores animals
     * It takes a random number between 1-19 that represents the number of lions and
     * generates random lions
     * After it cycles through the empty left spaces in the array and fills them with tigers following the same principle described above
     * generates random tigers
     */
    private void generateRandomCarnivorous(Carnivorous[]carnivorous){
        Random y = new Random();
        int numberOfTigers=y.nextInt(20);
        for(int i=0;i<numberOfTigers;i++){
            Lion lion = new Lion("02",22);
            carnivorous[i]=lion;
        }
        for(int i=numberOfTigers;i<20;i++){
            Tiger tiger = new Tiger("04",30);
            carnivorous[i]=tiger;
        }
    }
    public Jungle(Herbivorous[] herbivore, Carnivorous[] carnivore){
        generateRandomCarnivorous(carnivore);
        generateRandomHerbivorous(herbivore);
        this.herbivore = herbivore;
        this.carnivore = carnivore;
    }
    /**
     * This method will remove the carnivore animal positioned in array on <param>index</param>
     *
     * @param index position where is the animal to be removed
     */
    public void removeAnimalForHerbivores(int index){
        if (herbivore.length == 0) return;
        int i = 0;
        int j = 0;
        Herbivorous[] newHerbivores = new Herbivorous[herbivore.length - 1];
        while (i < herbivore.length) {
            if (i != index) {
                newHerbivores[j] = herbivore[i];
                j++;
            }
            i++;
        }
        herbivore = newHerbivores;
    }
    /**
     * This method will remove the carnivore animal positioned in array on <param>index</param>
     *
     * @param index position where is the animal to be removed
     */
    public void removeAnimalFromCarnivores(int index){
        if (carnivore.length == 0) return;
        int i = 0;
        int j = 0;
        Carnivorous[] newCarnivores = new Carnivorous[carnivore.length - 1];
        while (i < carnivore.length) {
            if (i != index) {
                newCarnivores[j] = carnivore[i];
                j++;
            }
            i++;
        }
        carnivore = newCarnivores;
    }
}

