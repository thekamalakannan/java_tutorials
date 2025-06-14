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

    public static void main(String[] args) {

        print("BANNARI AMMAN THUNAI");
        print(23);
        print(0.001);

    }

}
