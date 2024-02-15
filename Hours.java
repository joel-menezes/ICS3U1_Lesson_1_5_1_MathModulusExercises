class Hours extends ConsoleProgram {

  /**
  * User gives a number of hours.
  * Program turns that into number of days
  * @author: J. Menezes
  */
  
  public void run() {
    
    // Variables
    int intHours;
    int intDays;
    int intRemainingHours;

    // Assigning
    intHours = readInt("How many hours: ");

    // Calculations
    intDays = intHours/24;
    intRemainingHours = intHours %24;

    // Outputs
    System.out.println("That is "+intDays+" Days and "+ intRemainingHours+" Hours");
    
  }
}