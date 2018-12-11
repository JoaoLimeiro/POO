package arraylist;
import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();
    
    public void addGroceryItem(String item){
        groceryList.add(item);
    }
    
    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for(int i = 0; i < groceryList.size(); i++){
            System.out.println((i+1) + ". "+ groceryList.get(i));
        }
    }
    
    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has beed modified");
    }
    
    public void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }
    
    public int findItem(String searchItem) {
//      boolean exists = groceryList.contains(searchItem);  Se houver o searchItem na lista faz return true
        int position = groceryList.indexOf(searchItem);
        if(position >= 0){
            return position;
        }
        
        return position; //-1
    }
}
