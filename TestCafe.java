import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestCafe {
    public static void main(String[] args) {

        // You will need to create an instance of the CafeUtil class in order to use the methods. 
        // It will need to correspond 
        // with the variable name used below
      
        CafeUtil appTest = new CafeUtil();

        // App Test Cases
        System.out.println("\n----- Streak Goal Test -----");
        System.out.printf("Purchases needed by week 10: %s \n\n", appTest.getStreakGoal());


        System.out.println("----- Order Total Test-----");
        double[] lineItems = {3.5, 1.5, 4.0, 4.5};
        System.out.printf("Order total: %s \n\n",appTest.getOrderTotal(lineItems));
        
        
        System.out.println("\n----- Add Customer Test-----");
        ArrayList<String> customers = new ArrayList<String>();

        // to test 4 times
        for (int i = 0; i < 3; i++) {
            appTest.addCustomer(customers);
            System.out.println("\n");
        }


        System.out.println("----- Display Menu Test-----");
        
        List<String> loadMenu = Arrays.asList(
            "drip coffee",
            "cappucino",
            "latte",
            "mocha"
        );
        ArrayList<String> menu = new ArrayList<String>();
        menu.addAll(loadMenu);
        appTest.displayMenu(menu);


        System.out.println("\n----- Barista Adding Test-----");
        ArrayList<String> newCustomers = new ArrayList<String>();

    }
}