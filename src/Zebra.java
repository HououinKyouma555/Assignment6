import java.util.Random;
public class Zebra extends Animal {
    private boolean wild;
    private String name;
    
    public Zebra(String x){
        Random random = new Random();
        wild = random.nextBoolean();
        name = x;
        System.out.println("This Zebra is named " + name + ".");
    }
    
    public void isWild(){
        if (wild == true) {
            System.out.println("This Zebra is wiiiiild");
        }
        else{
            System.out.println("This Zebra is not nice");
        }
    }

    public void run()
    {
        System.out.print("Zebra now running.");
    }
}
