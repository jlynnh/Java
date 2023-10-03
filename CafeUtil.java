import java.util.ArrayList;

/* WORK IN PROGRESS 
*/
public class CafeUtil {
	public int getStreakGoal() {
		int sum = 0;
		for (int i = 0; i <= 10; i++) {
			sum += i;
		}
		return(sum);
	}
	
	public double getOrderTotal(double[] lineItems) {
		double sum = 0;
		for (double total: lineItems) {
            sum+= total;
		}
		return(sum);
	}
	
	public static void displayMenu(ArrayList<String> menuItems) {
		String name = menuItems.get(0);
		System.out.println(name);
		String name1 = menuItems.get(1);
		System.out.println(name1);
		String name2 = menuItems.get(2);
		System.out.println(name2);
		String name3 = menuItems.get(3);
		System.out.println(name3);
	}
	
	public static void addCustomer(ArrayList<String> customers) {
		
		String enterName = "Please enter your name";
		System.out.println(enterName);
		
		//String username = System.console().readLine();
		customers.add("Jennifer");
		customers.add("Bobby");
		customers.add("Matt");
		customers.add("Carol");
		
		System.out.println("Hello" + customers);
		String waitTime = "There are people in front of you.";
		System.out.println(waitTime);
		System.out.println(customers);
		
		}
	}
		
