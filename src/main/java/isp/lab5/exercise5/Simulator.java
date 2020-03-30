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
        System.out.println("The fight begins");
        Random random = new Random();
        int draw=0;
        int drawHerbivore=0;
        int drawCarnivore=0;
        while(this.jungle.carnivore.length>0 && this.jungle.herbivore.length>0 ) {
           int  listOfCarnivore=random.nextInt(jungle.carnivore.length);
           int listOfHerbivore=random.nextInt(jungle.herbivore.length);
                if (jungle.carnivore[listOfCarnivore].getChancesToHuntSuccessfully() > jungle.herbivore[listOfHerbivore].getChancesToRunSuccessfully()) {
                    jungle.carnivore[listOfCarnivore].huntSuccessfully();
                    jungle.herbivore[listOfHerbivore].runFailed();
                    jungle.removeAnimalForHerbivores(listOfHerbivore);

                } else {
                    if (jungle.carnivore[listOfCarnivore].getChancesToHuntSuccessfully() == jungle.herbivore[listOfHerbivore].getChancesToRunSuccessfully()) {
                        System.out.println("Draw");
                        draw=1;
                        jungle.carnivore[listOfCarnivore].huntSuccessfully();
                        jungle.herbivore[listOfHerbivore].runSuccessfully();
                    } else {
                        if(jungle.carnivore[listOfCarnivore].getChancesToHuntSuccessfully() <jungle.herbivore[listOfHerbivore].getChancesToRunSuccessfully())
                        jungle.herbivore[listOfHerbivore].runSuccessfully();
                        jungle.carnivore[listOfCarnivore].huntFailed();
                        jungle.removeAnimalFromCarnivores(listOfCarnivore);
                    }

                }
            }
        if(jungle.herbivore.length!=0&& draw==0){
            System.out.println("Herbivores win!");
            for(int i=0;i<jungle.herbivore.length;i++){
                System.out.println(jungle.herbivore[i].toString());
            }
        }
        if(jungle.carnivore.length!=0&& draw==0){
            System.out.println("Carnivores win!");
            for(int i=0;i<jungle.carnivore.length;i++){
                System.out.println(jungle.carnivore[i].toString());
            }
        }
        if(draw==1){
            System.out.println("Draw");
        }
    }
}
