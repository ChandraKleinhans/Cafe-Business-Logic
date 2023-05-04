import java.util.ArrayList;
public class CafeUtil {


    // Get the streak goal
    public int getStreakGoal() {
        int sum = 0;
        for(int week = 1; week <= 10; week++) {
            sum+= week;
        }
        return sum;
    }

    //
    //    Given an array of prices for products purchased, lineItems,
    //    sum the amounts to return the order total
    //
    public double getOrderTotal(double[] lineItems) {
        double sum = 0;
        
        for (double price: lineItems) {
            sum+= price;
        }
        return sum;

    }

    // addCustomer
    public void addCustomer(ArrayList<String> customerList) {
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.printf("Hello, %s! ", userName);
        System.out.printf("There are %s people ahead of you.\n", customerList.size());
        customerList.add(userName);
        System.out.println(customerList);
    }


    
    // Display Coffee Menu
    // Source: https://docs.oracle.com/javase/tutorial/java/data/numberformat.html
    public boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> priceIndex) {
        if(menuItems.size() != priceIndex.size()) {
            return false;
        }
        for (int id = 0; id < menuItems.size(); id++) {
            System.out.printf("%s %s -- $%.2f \n", id, menuItems.get(id), priceIndex.get(id));
        }
        return true;
    }

}
