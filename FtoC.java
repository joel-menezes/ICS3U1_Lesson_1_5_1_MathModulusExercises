class FtoC extends ConsoleProgram {

  /**
  * Converts Ferinheight to Celcius
  * @author: J. Menezes
  */
  
  public void run() {
    
    // Variables
    double dblTempF; 
    double dblTempC;

    // Assigning
    dblTempF = readDouble("How hot is it: ");

    // Calculations
    dblTempC = 5.0/9.0 * (dblTempF - 32);

    // Outputs
    System.out.println("Tempreature in Celcius is: " +dblTempC);
    
  }
}