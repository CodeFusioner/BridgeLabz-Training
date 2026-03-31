import java.util.*;
public class CafeteriaMenu {
    static String[] menu = {
            "Pizza", "Burger", "Sandwich", "Pasta", "Idli",
            "Dosa", "Coffee", "Tea", "Juice", "Ice Cream"
    };
    public static void displayMenu() {
        System.out.println("Cafeteria Menu:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + " -> " + menu[i]);
        }
    }
    public static String getItemByIndex(int index) {
        if (index >= 0 && index < menu.length) {
            return menu[index];
        }
        return "Invalid choice";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        displayMenu();
        System.out.print("\nEnter item index to order: ");
        int choice = sc.nextInt();
        String selectedItem = getItemByIndex(choice);
        System.out.println("You selected: " + selectedItem);
    }
}
