class Circumference extends ConsoleProgram {

  /**
  * User inputs radius
  * Program Returns circumference
  * @author: J. Menezes
  */
  
  public void run() {
    
    // Variables
    double dblRadius = readDouble("What is the radius: ");

    // Calculations
    double dblCircumference = dblRadius * 2 * Math.PI;
    
    // Output
    System.out.println("Circumfernce: "+dblCircumference);
  }
}