package SteppingStones;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.util.ArrayList;


public class SteppingStone4_Loops {
    
    public static void main(String[] args) {
       Scanner scnr = new Scanner(System.in);
       String recipeName = "";
       ArrayList<String> ingredientList = new ArrayList();
       String newIngredient = "";
       boolean addMoreIngredients = true;
       
       System.out.println("Please enter the recipe name: ");
       recipeName = scnr.nextLine();
       
       
        
       do {           
           System.out.println("Would you like to enter an ingredient: (y or n)");
           String reply = scnr.next().toLowerCase();
           
           /**
            * Add your code here (branches work well!).  The code should check the
            * reply:
            *   "y" --> prompt for the ingredient and add it to the ingredient list;
            *   "n" --> break out of the loop;  
            *       (Hint: what is the 'while' condition? What could you change to 
            *               stop the loop from starting over?)
            *   anything else --> prompt for a "y" or "n"
            * 
            */
            // This line checks to see if the user would like to an another ingredient.
            if (reply.equals("y")) {
                
                /*
                
                * Gets the name of the ingredient.
                * Add ingredient name to the ingredientList array.
                
                System.out.println("Enter the next ingredients name: ");
                String addIngredient = scnr.next();
                ingredientList.add(addIngredient);
                
                // Checks if there are no more ingredients to be added and ends loops.
            } else if (reply.equals("n")) {
                addMoreIngredients = false;
                break;
            }
       } while (addMoreIngredients);
       
       // Prints all the igredients from the ingridient list array.
       for (int i = 0; i < ingredientList.size(); i++) {
           /** 
		   * Get the item i from the ingredient list
		   *	and assigning it to the String ingredient
		   *
		   */
		   String ingredient = ingredientList.get(i);
           System.out.println(ingredient);
       }
    }
}
