
package arraylist;

import java.util.Scanner;

/**
 *
 * @author limeiro
 */
public class ArrayList {
    
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();
   
    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit){
            System.out.println("Enter your choice; ");
            choice = scanner.nextInt();  //read the int input to choice
            scanner.nextLine();  // clear the buffer
            
            switch(choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }
    
    public static void printInstructions(){
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options");
        System.out.println("\t 1 - To print the list of grocery items");
        System.out.println("\t 2 - To add an item to the list");
        System.out.println("\t 3 - To modify an item in the list");
        System.out.println("\t 4 - To temove an item from the list");
        System.out.println("\t 5 - To search for an item in the list");
        System.out.println("\t 6 - To quit th application");   
    }
    
    public static void addItem(){
        System.out.print("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }
    
    public static void modifyItem() {
        System.out.print("Enter item number: ");
        int itemNo = scanner.nextInt();
        System.out.print("Enter the new item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo - 1, newItem);
    }
    
    public static void removeItem() {
        System.out.print("Enter item number: ");
        int itemNo = scanner.nextInt();
        groceryList.removeGroceryItem(itemNo - 1);
    }
    
    public static void searchItem() {
        System.out.println("Item to search");
        String newItem = scanner.nextLine();
        if(groceryList.findItem(newItem) != -1){
            System.out.println("Found " + newItem + " in our grocery list");
        }else {
            System.out.println(newItem + " is not in the shopping list");
        }
    }
    
    
    
}
