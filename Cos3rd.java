class Cos3rd extends ConsoleProgram {

  /**
  * Write a program that lets the user input 2 sides and an angle.
  * Compute that and return the last side of the triangle.
  * @author: J. Menezes
  */
  
  public void run() {
    
    // Variables
    double dblSideA;
    double dblSideB;
    double dblAngleC;
    double dblSideC;

    // Asigning 
    dblSideA = readDouble("What is side A: ");
    dblSideB = readDouble("What is side B: ");
    dblAngleC = readDouble("What is Angle in degrees C: ");

    // Calculations
    dblSideC = Math.sqrt(Math.pow(dblSideA, 2) + Math.pow(dblSideB, 2)  - (2 * dblSideA * dblSideB * Math.cos(Math.toRadians(dblAngleC))));

    // Outputs
    System.out.println("Side C is: " + dblSideC);
  }
}