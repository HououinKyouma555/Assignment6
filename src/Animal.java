import java.util.Scanner;

public class Animal {
    
    public static void main(String[] args) throws Exception {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Let's make a Zebra! What's his/her name?");
        String zebraName = scnr.nextLine();
        Zebra Alister = new Zebra(zebraName);
        Alister.mate();
        Alister.isWild();
        System.out.println("Let's make a fish now. What's his/her name?");
        String fishName = scnr.nextLine();
        Fish Steven = new Fish(fishName);
        Steven.getSize();
        Steven.mate();
        Animal animal1 = new Animal();
        System.out.println("And now for just an animal. What animal is this?");
        animal1.animalType = scnr.nextLine();
        System.out.println("And now what's it's name?");
        animal1.name = scnr.nextLine();
        System.out.println("And gender?");
        animal1.gender = scnr.nextLine();
        animal1.printInfo();
        scnr.close();
        Animal Jackie = new Animal();
        Jackie.isMammal();
        Alister.isMammal();
    }

    public int age;
    public String gender;
    public String animalType;
    public String name;

    public void isMammal(){
        System.out.println("this is a mammal");
    }

    public void mate(){
        System.out.println("This animal is doing the devil's tango");
    }

    public void printInfo(){
        System.out.println("Animal type: " + animalType);
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
    }
}