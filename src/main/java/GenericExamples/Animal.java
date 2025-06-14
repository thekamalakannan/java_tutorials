package GenericExamples;

/**
 * Author: Kamalakannan KUPPUSAMY
 * Date: 15/06/2025
 * In this example shows how generic method works
 */


public class Animal {

    private static <T> void print(T thingsToShout) {
        System.out.println(thingsToShout + " !!!!!!");
    }

    // Multiple Generic parameter example
    private static <T, V> void print(T thingsToShout, V otherThingsToPrint) {
        System.out.println("thingsToShout: " + thingsToShout + " - otherThingsToPrint: " + otherThingsToPrint);
    }

    public static void main(String[] args) {

        print("BANNARI AMMAN THUNAI");
        print(23);
        print(0.001);

        print("-------------------------------------------------");

        print("BANNARI AMMAN THUNAI", 124);
        print(23, 121);
        print(0.001, 'A');


    }

}
