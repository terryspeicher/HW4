/**
 * HW4 Terry Speicher, 3331, id80609111
 */
package HW4PlusBonus;

import java.util.Scanner;

enum RoverStates {Idle, MoveFc, MoveFa, MoveBc, MoveBa, ColorCamera, SixteenMMCamera, DrillOff, DrillOn;}
enum RoverEvents {RPOnce, RP5Sec, RPTwice, LPOnce, LP5Sec, B1, B1_5Sec, B1_10Sec, B1Twice, B2;}

/**
 * The Class RoverStateDiagram.
 */
public class RoverStateDiagram {


    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
    	
    	    //New rover object
        Rover rover = new Rover();
        //scanner for keyboard input
        Scanner scanner = new Scanner(System.in);
        //run/stop trigger
        boolean run = true;

        //Show initial state and options for pedal actions

        while (run) {
        	
        		//show menu
            System.out.println("The Rover is in the following state: " + rover.getCurrentRoverState() + "\n");
            System.out.println("Please choose from the following actions:");
            System.out.println("1. Press Right Pedal Once");
            System.out.println("2. Press Right Pedal for 5 seconds");
            System.out.println("3. Press Right Pedal twice");
            System.out.println("4. Press Left Pedal Once");
            System.out.println("5. Press Left Pedal for 5 seconds");
            System.out.println("6. Press Button #1");
            System.out.println("7. Press Button #1 for 5 seconds");
            System.out.println("8. Press Button #1 for 10 seconds");
            System.out.println("9. Press Button #1 twice");
            System.out.println("10. Press Button #2");

            System.out.println("0. Power Off\n");
            System.out.print("Your Choice (0-10): ");
            //Get Input
            int n = scanner.nextInt();
            scanner.nextLine();
            //check for valid input
            if (n >= 0 && n <= 10) {
                switch (n) {
                    case 0:
                        run = false;  //stop loop
                        break;
                    case 1:
                        rover.updateRover(RoverEvents.RPOnce);
                        break;
                    case 2:
                        rover.updateRover(RoverEvents.RP5Sec);
                        break;
                    case 3:
                        rover.updateRover(RoverEvents.RPTwice);
                        break;
                    case 4:
                        rover.updateRover(RoverEvents.LPOnce);
                        break;
                    case 5:
                        rover.updateRover(RoverEvents.LP5Sec);
                        break;
                    case 6:
                        rover.updateRover(RoverEvents.B1);
                        break;
                    case 7:
                        rover.updateRover(RoverEvents.B1_5Sec);
                        break;
                    case 8:
                        rover.updateRover(RoverEvents.B1_10Sec);
                        break;
                    case 9:
                        rover.updateRover(RoverEvents.B1Twice);
                        break;
                    case 10:
                        rover.updateRover(RoverEvents.B2);
                        break;
                    default:
                        System.out.println("\nPlease enter a valid action (0-5): \n");
                }
            }
        }
        
        scanner.close();
    }

}
