class Circumference extends ConsoleProgram {

  /**
  * User inputs radius
  * Program Returns circumference
  * @author: J. Menezes
  */
  
  public void run() {
    
    // Variables
    double dblRadius = readDouble("What is the radius: "); // Try not to define variables in same line, though not an issue 

    // Calculations
    double dblCircumference = dblRadius * 2 * Math.PI;
    
    // Output
    System.out.println("Circumfernce: " + dblCircumference);
  }
}