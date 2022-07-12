public class Test {
    
    public static void main(String [] args) {

        // Create Fraction objects
        Fraction f1 = new Fraction(2, 3);
        Fraction f2 = new Fraction(1, 5); 

        // lets operator
        Fraction f3 = f1.add(f2);
        Fraction f4 = f1.subtract(f2);
        Fraction f5 = f1.multipy(f2);
        Fraction f6 = f1.divide(f2);

        // lets output
        System.out.printf("%s + %s = %s%n", f1, f2, f3);
        System.out.printf("%s - %s = %s%n", f1, f2, f4);
        System.out.printf("%s * %s = %s%n", f1, f2, f5);
        System.out.printf("%s / %s = %s%n", f1, f2, f6);

    }

}
