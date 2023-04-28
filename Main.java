import java.util.Scanner;
class Main {
   
   public static void main(String[] args) 
   {  
      final int QUARTS_IN_GALLON = 4;
      int quartsNeeded = 18;
      int gallonsNeeded;
      int extraQuartsNeeded;
      Scanner input = new Scanner(System.in);
      
      for(int x=0; x<1;)
        {
         try
          {
            System.out.println("Enter quarts needed >> ");
            quartsNeeded = input.nextInt();
            gallonsNeeded = quartsNeeded / QUARTS_IN_GALLON;
            extraQuartsNeeded = quartsNeeded % QUARTS_IN_GALLON;
            System.out.println("A job that needs " + quartsNeeded +
              " quarts requires " + gallonsNeeded + " gallons plus " +
              extraQuartsNeeded + " quarts.");
            
          }
          catch(Exception mistake)
            {
              System.out.println("Please snter a valid number >> ");
            }
          x = 2;
          //loop is broken ran out of time'
        }
      
   }
}
