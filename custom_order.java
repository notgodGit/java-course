// Code for Beginning Java's Cake & Cupcake Shop Tutorial

import java.util.Scanner;  // Needed for the Scanner class to read input

public class custom_order {

    // STEP 1 PRINTING HELLO WORLD TO CONSOLE
    public static void main(String[] args) {
        
      // System.out.println("Hello World!"); // print Hello World to console
        
    // TEST CODE
    
    // STEP 2 CREATE A SCANNER OBEJCT, DECLARE VARAIBLES, & PRINT STATEMENTS
	  
    Scanner keyboard = new Scanner(System.in);

    String firstName;
    String itemOrder;
    String frostingType;
    String fillingType;
    String toppings;
    String input;

    double cost = 15.00;
    final double TAX_RATE = 0.08;
    double tax;

    System.out.println("Welcome!"); 
    System.out.println("We make good cakes!");

    // Introduce shop and prompt user to input first name
      

	  
	  
    // TEST CODE
    
    // STEP 3 INPUT YOUR NAME AND PREPARE TO VIEW MENU
   
	 System.out.print("your first Name? ") ;
     firstName = keyboard.nextLine();

     System.out.print(firstName + " choose below: ");
     System.out.print("\n");
    // TEST CODE     
    
    // STEP 4 DISPLAY MENU

    System.out.println("_______________________________________________");      
    System.out.println("        MENU         QUANTITY    BASE COST  ");
    System.out.println("_______________________________________________"); 
    System.out.println("        Cake             1            $15     ");
    System.out.println("   Set of Cupcakes       6            $15     ");
    System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
    System.out.println("Frostings (vanilla, chocolate, strawberry, coco)");
    System.out.println("Fillings (mocha, mint, lemon, caramel, vanilla)");
    System.out.println("Toppings (sprinkles, cinnamon, cocoa, nuts)");
    System.out.println("_______________________________________________");
      

    // TEST CODE     
    
    // STEP 5 PROMPT USER TO ORDER

  
	System.out.print("CUPCAKES or CAKE? ");
    itemOrder = keyboard.nextLine();  
	  
	  
      
    // TEST CODE
      
    // STEP 6 PROMPT USER TO CHOOSE FROSTING

   
	 System.out.print("what FROSTING? ");
     System.out.print("vanilla, chocolate, strawberry or coco " );
     frostingType = keyboard.nextLine();
	 
	 
      
    //TEST CODE
      
    // STEP 7 PROMPT USER TO CHOOSE FILLING


	System.out.print("what FILLING? ");
    System.out.print("mocha, mint, lemon. caramel or raspberry ");
    fillingType = keyboard.nextLine();
	  
      
    // TEST CODE
      
    // STEP 8 PROMPT USER TO CHOOSE TOPPINGS


	System.out.print("what TOPPING? ");
    System.out.print("sprinkles, cinnamon, cocoa, nuts ");
    toppings = keyboard.nextLine();
      
      
    // TEST CODE
      
    // STEP 9 DISPLAY ORDER CONFIRMATION


    System.out.println();
    System.out.println(firstName + " , your order is as follows: ");
    System.out.println("_________________________________________");
    System.out.println("Item Ordered: " + itemOrder);
    System.out.println("Frosting: " + frostingType);
    System.out.println("Filling: " + fillingType);
    System.out.println("Toppings: " + toppings);
    System.out.println("_________________________________________");
	  
	  
	System.out.printf("THe cost of your order is: $%.2f\n", cost) ;
    tax = cost * TAX_RATE;
    System.out.printf("the tax is:  $%.2f\n", tax);
    System.out.printf("The total due is: $%.2f\n",(tax + cost));
    
    // TEST CODE
      
    // STEP 10 DISPLAY COST AND SALES TAX
  
    }   
}