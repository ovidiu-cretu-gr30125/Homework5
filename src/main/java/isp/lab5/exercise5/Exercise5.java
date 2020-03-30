package isp.lab5.exercise5;

public class Exercise5 {
    public static void main(String [] args){
        Tiger tiger1= new Tiger("1",20);
        tiger1.eat();
        Lion lion1 = new Lion("2",22);
        lion1.eat();
        Elk elk1 = new Elk("3",25);
        elk1.eat();
        Dear dear1 = new Dear("4",26);
        dear1.eat();
        Simulator simulator1 = new Simulator();
        simulator1.simulate();
    }
}
