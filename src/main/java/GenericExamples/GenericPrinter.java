package GenericExamples;

/**
 * Author: Kamalakannan KUPPUSAMY
 * Date: 14/06/2025
 */


public class GenericPrinter <T> {

    T thingsToPrint;

    public GenericPrinter(T thingsToPrint){
        this.thingsToPrint = thingsToPrint;
    }

    public void print(){
        System.out.println(thingsToPrint);
    }

}
