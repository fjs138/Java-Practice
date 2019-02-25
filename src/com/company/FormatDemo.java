package com.company;

public class FormatDemo {
    public static void main(String[] args) {
        double amount = 12618.98;
        double interestRate = 0.0013;
        double interest = amount * interestRate;
        // Interest is $16.404674
        System.out.println("Interest is $" + interest);

        amount = 12618.98;
        interestRate = 0.0013;
        interest = amount * interestRate;
        // Interest is $16.4
        System.out.println("Interest is $" + (int)(interest * 100) / 100.0);

        amount = 12618.98;
        interestRate = 0.0013;
        interest = amount * interestRate;
        // Interest is $16.40
        System.out.printf("Interest is $%4.2f", interest);

        // The f in the printf stands for formatted, implying that the method
        // prints an item in some format. The syntax to invoke this method is:
        // System.out.printf(format, item1, item2, ..., itemk);

        int count = 5;
        double amount2 = 45.56;
        boolean stringTest = false;
        System.out.printf("\ncount is %d and amount is %f. Also, %s!", count, amount, stringTest);

        System.out.printf("\n%3d#%2s#%4.2f\n", 1234, "Java", 51.6653);
        // displays 1234#Java#51.67

        System.out.printf("%,8d %,10.1f\n", 12345678, 12345678.263);
        // displays 12,345,678 12,345,678.3


        // You can pad a number with leading zeros rather than spaces by adding a 0 in front of a
        // number specifier. For example, the following code
        System.out.printf("%08d %08.1f\n", 1234, 5.63);
        // displays 00001234 000005.6

        /**By default, the output is right justified. You can put the minus sign ( − ) in the format speci-
         fier to specify that the item is left justified in the output within the specified field. For example,
         the following statements**/
        System.out.printf("%8d%8s%8.1f\n", 1234, "Java", 5.63);
        System.out.printf("%-8d%-8s%-8.1f \n", 1234, "Java", 5.63);
        // Results in:
        //     1234    Java     5.6
        // 1234    Java    5.6



    }
}
