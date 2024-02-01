import java.util.Random;

public class Fish extends Animal {
    private int sizeInFeet;
    private String name;

    public Fish(String x){
        Random random = new Random();
        sizeInFeet = random.nextInt(8);
        name = x;
        System.out.println("This fish is named " + name + "!");
    }

    private void canEat(){
        if (sizeInFeet > 4){
        System.out.println("This fish can eat yeahhhh");
        }
        else{
            System.out.println("This fish is too small, it gets eaten");
        }
    }

    public void getSize(){
        System.out.println("This fish is " + sizeInFeet + " feet long");
        System.out.println("Whether a fish can eat depends on whether it is over 4 feet long (I'm making this up). Calling private method 'canEat()' now.");
        canEat();
    }
}
