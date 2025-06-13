package GenericExamples;

public class GenericPrinter <T> {

    T thingsToPrint;

    public GenericPrinter(T thingsToPrint){
        this.thingsToPrint = thingsToPrint;
    }

    public void print(){
        System.out.println(thingsToPrint);
    }

}
