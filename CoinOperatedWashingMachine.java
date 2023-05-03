import java.util.Scanner;
//Main class for the program
public class CoinOperatedWashingMachine {
 public static void main(String[] args) {
     WashingMachine washingMachine = new WashingMachine();
     Scanner scanner = new Scanner(System.in);
     int choice;

     while (true) {
         // Display the menu
         System.out.println("Coin-Operated Washing Machine");
         System.out.println("1. Insert Coins");
         System.out.println("2. Select Wash Cycle");
         System.out.println("3. Select Water Temperature");
         System.out.println("4. Start Washing Cycle");
         System.out.println("5. Cancel Washing Cycle");
         System.out.println("6. Quit");

         // Get the user's choice
         System.out.print("Enter your choice: ");
         choice = scanner.nextInt();

         switch (choice) {
             case 1:
                 // Insert coins
                 System.out.print("Enter the amount of coins to insert: ");
                 int amount = scanner.nextInt();
                 washingMachine.insertCoins(amount);
                 System.out.println("Total amount inserted: " + washingMachine.getMoney() + " cents.");
                 break;
             case 2:
                 // Select wash cycle
                 System.out.println("Select a wash cycle:");
                 System.out.println("1. Normal");
                 System.out.println("2. Delicate");
                 System.out.println("3. Heavy Duty");
                 int washCycleChoice = scanner.nextInt();
                 switch (washCycleChoice) {
                     case 1:
                         washingMachine.selectWashCycle(WashCycle.NORMAL);
                         System.out.println("Selected wash cycle: Normal");
                         break;
                     case 2:
                         washingMachine.selectWashCycle(WashCycle.DELICATE);
                         System.out.println("Selected wash cycle: Delicate");
                         break;
                     case 3:
                         washingMachine.selectWashCycle(WashCycle.HEAVY_DUTY);
                         System.out.println("Selected wash cycle: Heavy Duty");
                         break;
                     default:
                         System.out.println("Invalid choice.");
                 }
                 break;
             case 3:
                 // Select water temperature
                 System.out.print("Enter the water temperature (in degrees Celsius): ");
                 int waterTemperature = scanner.nextInt();
                 washingMachine.selectWaterTemperature(waterTemperature);
                 System.out.println("Selected water temperature: " + waterTemperature + " degrees Celsius.");
                 break;
             case 4:
                 // Start washing cycle
                 washingMachine.start();
                 break;
             case 5:
                 // Cancel washing cycle
                 washingMachine.cancel();
                 break;
             case 6:
                 // Quit
                 System.out.println("Goodbye!");
                 System.exit(0);
                 break;
             default:
                 System.out.println("Invalid choice.");
         }
     }
 }
}
