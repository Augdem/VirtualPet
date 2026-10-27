import java.util.Scanner;

public class VirtualPet {

   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
      Scanner nameInput =  new Scanner(System.in);

      int happiness = 5;
      int hunger = 5;
      int energy = 5;
      String petName = "";
      int choice = 0;
       
      System.out.println("Welcome to Virtual Pet Simulator!");
      System.out.println("Pet name? Cannot be blank, must have one or more characters.");
      
      while (petName == "") {
      petName = nameInput.next();
      }
     
      System.out.println("Your pet's name is " + petName + ".");

      // TODO 1:
      // Create a while loop that continues while:
      // happiness < 15
      // hunger < 10
      // energy > 0
      // choice != 5
      while (happiness < 15 && hunger < 10 && energy > 0 && choice != 5) {
          System.out.println("");
          System.out.println("Happiness = " + happiness);
          System.out.println("Hunger = " + hunger);
          System.out.println("Energy = " + energy);
          System.out.println("");
          
     

         // TODO 2:
         // Display happiness, hunger, and energy.
         
         
         System.out.println("What would you like to do?");
         System.out.println("1. Feed");
         System.out.println("2. Play");
         System.out.println("3. Sleep");
         System.out.println("4. Bath");
         System.out.println("5. Quit");
         System.out.println("");
         
         choice = input.nextInt();
        
        if (choice == 1) {
        System.out.println("");
        System.out.println("Feeding " + petName + "."); 
        happiness += 1;
        hunger -= 3;
        } else if (choice == 2) {
        System.out.println("");
        System.out.println("Playing with " + petName + "."); 
        happiness += 3;
        hunger += 2;
        energy -= 2;
        } else if (choice == 3) { 
        System.out.println("");
        System.out.println("Letting " + petName + " rest.");
        happiness -= 1;
        hunger += 1;
        energy += 3;
        } else if (choice == 4) {
        System.out.println("");
        System.out.println("Bathing " + petName + "."); 
        happiness += 2;
        hunger += 1;
        energy -= 1;
        } else {
        System.out.println("");
        System.out.println("INVALID INPUT!");
      
      }
      
      
       
   }
      if (choice == 5) { 
      System.out.println("");
      System.out.println("You left " + petName + ".");
      }
      else if (hunger >= 10) {
      System.out.println("");
      System.out.println(petName + " got too hungry and left");
      } else if (energy < 1) {
      System.out.println("");
      System.out.println(petName + " is at the farm"); 
      } else if (happiness >= 15) {
      System.out.println("");
      System.out.println(petName + " is so happy! You win!"); 

      }
         
         // TODO 3:
         // Create an if / else if / else statement
         
         // to handle the player's choice.
         //
         // Update the three statistics according
         // to the table in the instructions.
         //
         // Print a funny message for each action.


      // TODO 4:
      // After the loop, determine WHY the game ended.
      //
      // Did the pet become happy enough?
      // Did it get too hungry?
      // Did it run out of energy?
      // Did the player quit?
      //
      // Print the appropriate ending message.
      input.close();
   }
}