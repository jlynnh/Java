public class FirstJava {
    public static void main (String[] args) {
        System.out.println("My name is Coding Dojo");
        System.out.println("I am 100 years old");
        System.out.println("My hometown is Burbank, CA");

    int currentTemp = 70;
    System.out.println("Testing If Statements");
        if(currentTemp > 90) {
            System.out.println("Its too hot!");
        }else if(currentTemp >=80) {
            System.out.println("Its getting warm...");
        }else if(currentTemp >= 65 && currentTemp <80){
            System.out.println("Just right!");
        }else if(currentTemp >=0 && currentTemp <65) {
            System.out.println("Its too cold");
        }

    System.out.println("Countdown!");
        int myInt;
            for(myInt=10; myInt>0; myInt--);
            System.out.println(myInt);
            System.out.println("Liftoff!");
    }
    
    }
