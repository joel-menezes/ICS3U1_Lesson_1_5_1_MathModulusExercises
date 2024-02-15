class AreaSin extends ConsoleProgram {

  /**
  * Takes 2 sides and an angle to find the area of the triangle
  * @author: J. Menezes
  */
  
  public void run() {
    
    // Variables
    double dblSideA;
    double dblSideB;
    double dblAngleC;
    double dblArea;

    // Asigning 
    dblSideA = readDouble("What is side A: ");
    dblSideB = readDouble("What is side B: ");
    dblAngleC = readDouble("What is Angle in degrees C: ");

    // Calculations
    dblArea = (dblSideA *  dblSideB * Math.sin(Math.toRadians(dblAngleC)))/2;

    // Outputs 
    System.out.println("Area is: " + dblArea);
  }
}