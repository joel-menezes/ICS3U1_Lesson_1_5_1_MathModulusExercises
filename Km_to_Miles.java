class Km_to_Miles extends ConsoleProgram {

    /**
    * User inputs how many Km need to convert to Miles
    * That number is converted to miles.
    * @author: J. Menezes
    */
    
    public void run() {
      
      // Variables
      double dblDistaneceKm;
      double dblDistaneceM;

      // Assigning
      dblDistaneceKm = readDouble("How many KM: ");

      // Calculations
      dblDistaneceM = dblDistaneceKm *  0.621371;

      // Outputs
      System.out.println(dblDistaneceKm+" km is "+ dblDistaneceM +" miles");
      
    }
  }