public class CafeJava {
    public static void main(String[] args) {
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";


        double mochaPrice = 3.5;
        double dripPrice = 2.5;
        double lattePrice = 4.5;
        double cappuccinoPrice = 5;


        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;

        System.out.println(generalGreeting + customer1);
        System.out.println(customer1 + readyMessage);

        System.out.println(generalGreeting + customer4);
        if(isReadyOrder4 = false){
            System.out.println(customer4 + pendingMessage);
        }else if(isReadyOrder4 = true){
            System.out.println(customer4 + readyMessage);
            System.out.println(displayTotalMessage + cappuccinoPrice);
        }
    }
    
}
