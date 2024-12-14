public class TimeConversion {

    /**
     * Constructor
     */
    TimeConversion(){

    }


    /**
     * TO DO: showDecaseconds method
     * Given a number of seconds calculates 
     * and display decaseconds
    */
    // 
    public void showDecaseconds(int numSeconds){

        int decaSeconds = (numSeconds * 10);
        System.out.println("The number of decaseconds in " + numSeconds + " seconds is: " + decaSeconds);
    }
    
   


    /**
     * TO DO: showJiffies method
     * Given a number of seconds calculates 
     * and display jiffies
    */
    // add your code here
    public void showJiffies(int numSeconds){

        int jiffies = (numSeconds / 100);
        System.out.println("The number of jiffies in " + numSeconds + " seconds is: " + jiffies);
    }


    /** 
     * TO DO: showNewYorkMinutes method
     * Given a number of seconds calculates 
     * and display New York minutes
    */
    // add your code here

    public void showNewYorkMinutes(int numSeconds){

    int newYorkMinute = (numSeconds /20);
    System.out.println("The number of New York minutes in " + numSeconds + " seconds is: " + newYorkMinute);
}
    /**
     * TO DO: showNanoCenturies method
     * Given a number of seconds calculates 
     * and display Nanocenturies
    */ 
    // add your code here



public void showNanoCenturies(int numSeconds){

    double nanoCenturies = (numSeconds * 3.156);
    nanoCenturies = nanoCenturies *100;
 int tempNanoCenturies = (int) nanoCenturies;
    nanoCenturies = tempNanoCenturies / 100.0;
    System.out.println("The number of nanocenturies in " + numSeconds + " seconds is: " + nanoCenturies);
}
     /**
     * TO DO: showScaramuccis method
     * Given a number of seconds calculates 
     * and display Scaramuccis
    */ 
    // add your code here

    
    public void showScaramuccis(int numSeconds){

        int Scaramuccis = (numSeconds * 10);
        System.out.println("The number of Scaramuccis in " + numSeconds + " seconds is: " + Scaramuccis);
    }

}

    
//end class