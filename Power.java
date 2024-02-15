class Power extends ConsoleProgram {

  /**
  * Takes in 2 numbers
  * One is the base 
  * Other is exponent
  * does the calculations
  * @author:
  */
  
  public void run() {
    
    // Variables
    double dblBase;
    double dblExponent;
    double dblResult;

    // Assigning
    dblBase = readDouble("What is the Base: ");
    dblExponent = readDouble("What is the Exponent: ");

    // Calculations 
    dblResult = Math.pow(dblBase,dblExponent);

    // Outputs
    System.out.println("The result is: "+ dblResult);
    
  }
}