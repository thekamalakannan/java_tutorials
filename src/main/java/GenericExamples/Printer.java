package GenericExamples;

import javax.xml.crypto.Data;

/**
 * Author: Kamalakannan KUPPUSAMY
 * Date: 14/06/2025
 * Generic used to reduce boilerplate codes
 * Here we have a class called StringPrinter and IntegerPrinter which will print only the specific data type
 * So we introduce generic class called GenericPrinter which will print any data type
 */

public class Printer {

    public static void main(String[] args) {

        // String printer
        StringPrinter stringPrinter = new StringPrinter("Bannari Amman thunai");
        stringPrinter.print();

        // Integer printer
        IntegerPrinter integerPrinter = new IntegerPrinter(123);
        integerPrinter.print();

        // Generic Printer
        GenericPrinter<Double> printer = new GenericPrinter<>(0.001);
        printer.print();
        GenericPrinter<String> stringGenPrinter = new GenericPrinter<>("hello there...");
        stringGenPrinter.print();
        GenericPrinter<StringPrinter> strinPrint = new GenericPrinter<>(new StringPrinter("Hi there "));
        strinPrint.print();

    }

}
