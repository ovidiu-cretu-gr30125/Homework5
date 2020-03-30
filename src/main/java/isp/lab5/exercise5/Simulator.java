package isp.lab5.exercise5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class Simulator {
    private Jungle jungle;
    /**
     * The Simulator() will create the Jungle which contains 20 herbivores(random nr of Elk/Dear) and 20 carnivores(random nr of Lion/Tiger)
     */
    public Simulator(){
        Herbivorous[] herbivorous = new Herbivorous[20];
        Carnivorous[] carnivorous = new Carnivorous[20];
        this.jungle = new Jungle(herbivorous, carnivorous);

    }
    /**
     * The simulate() method will take random a herbivore and a carnivore from the jungle and will simulate a "fight" until there are only herbivores or only carnivores or is a draw.
     * Draw - happens only when chances to run for a herbivore are equal to the chances to hunt for a carnivore
     * When an animal fails to hunt/run he will be deleted from the array of animals
     * This method continues as long as there are still at least 1 animal of each type herbivore/carnivore
     * After the simulation comes to an end, This method displays the remaining animals
     */
    public void simulate(){
        for(int i=0;i<20;i++) {
            System.out.println("jungle.getCarnivore(i)" + i + "");
            System.out.println(jungle.carnivore[i]);
        }
        ArrayList<Integer> listOfHerbivore = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            listOfHerbivore.add(i);
        }
        Collections.shuffle(listOfHerbivore);
            ArrayList<Integer> listOfCarnivore = new ArrayList<Integer>();
            for (int i = 0; i < 20; i++) {
                listOfCarnivore.add(i);
            }
                Collections.shuffle(listOfCarnivore);
        System.out.println("The fight begins");
        while(this.jungle.carnivore.length>0 && this.jungle.herbivore.length>0 ) {
            for (int i = 0; i < 20; i++) {
                if (jungle.carnivore[listOfCarnivore.get(i)].getChancesToHuntSuccessfully() > jungle.herbivore[listOfHerbivore.get(i)].getChancesToRunSuccessfully()) {
                    jungle.carnivore[listOfCarnivore.get(i)].huntSuccessfully();
                    jungle.herbivore[listOfHerbivore.get(i)].runFailed();
                    ///System.out.println(jungle.carnivore[listOfHerbivore.get(i)]);
                    jungle.removeAnimalForHerbivores(listOfHerbivore.get(i));

                } else {
                    if (jungle.carnivore[listOfCarnivore.get(i)].getChancesToHuntSuccessfully() == jungle.herbivore[listOfHerbivore.get(i)].getChancesToRunSuccessfully()) {
                        System.out.println("Draw");
                    } else {
                        if(jungle.carnivore[listOfCarnivore.get(i)].getChancesToHuntSuccessfully() <jungle.herbivore[listOfHerbivore.get(i)].getChancesToRunSuccessfully())
                        jungle.herbivore[listOfHerbivore.get(i)].runSuccessfully();
                        jungle.carnivore[listOfCarnivore.get(i)].huntFailed();
                        jungle.removeAnimalFromCarnivores(listOfCarnivore.get(i));
                    }

                }

            }
        }
    }
}
