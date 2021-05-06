package edu.handong.csee.java.hw2.converters;
/**
 * This class is a calculating program both mile and meter, and ton to kilogram and gram together.
 * 
 * @date 2021.04.11
 * @author HYUNMUK KANG 
*/
public class AllConverter {

    private String originalMeasure;

    private double kilometer;
    private double meter;
    private double mile;

    private double ton;
    private double kilogram;
    private double gram;

    /**
     * @param this method is used as a first method chain.
     * set value to kilometer and ton both. 
    */
    public AllConverter setFromValue(double fromValue) {
        
        kilometer = fromValue;
        ton = fromValue;
        
        return this;
    }

    /**
     * @param this method is used as a second method chain. 
     * read what type of calculation should be done.
    */
    public AllConverter setOriginalMeasure(String originalMeasure) {
        this.originalMeasure = originalMeasure;
        return this;
    }

    /**
     * @param this method is used as a third method chain.
     * using a conditional statement, run TON or KM calculator. Else error.  
    */
    public AllConverter convertAndPrintOut() {

        meter = kilometer * 1000;
        mile = kilometer / 1.6;
        
        kilogram = ton * 1000;
        gram = kilogram * 1000;

        if(originalMeasure == "Ton") {
            System.out.println(ton + " " +originalMeasure + " to " + kilogram + " KG");
            System.out.println(ton + " " +originalMeasure + " to " + gram + " G");
        }
        else if(originalMeasure == "KM") {
            System.out.println(kilometer + " " +originalMeasure + " to " + meter + " M");
            System.out.println(kilometer + " " +originalMeasure + " to " + mile + " MILE");
        }
        //else{
            //System.out.println("AllConverter cannot support the measure!");
        //}
        return this;
    }

}