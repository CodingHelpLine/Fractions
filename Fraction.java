public class Fraction {
    
    // Instance fields
    private int numerator;
    private int denominator;

    // Constructors

    public Fraction() {
        this.numerator = 0; 
        this.denominator = 1; // we must keep this value non-zero
    }

    public Fraction(int numerator, int denominator) {

        this.numerator = numerator;

        // make sure denominator is not zero
        if(denominator == 0) {
            denominator = 1; 
        } else {
            this.denominator = denominator;
        }
    }

    // Getter and setter functions

    public int getNumerator() { return this.numerator; }
    public int getDenominator() { return this.denominator; }

    public void setNumerator(int numerator) { this.numerator = numerator; }
    public void setDenominator(int denominator) {
        // not zero
        if(denominator == 0) {
            this.denominator = 1; 
        } else {
            this.denominator = denominator;
        }
    }

    // Logic Functions. 

    // add
    public Fraction add(Fraction right) {
        int a = this.getNumerator(); 
        int b = this.getDenominator();
        int c = right.getNumerator();
        int d = right.getDenominator();

        // now formula 
        // if both have same denominator, we add numerators
        // and keep the denominator

        // declare Fraction result
        Fraction result = null;

        if(b == d) { // same denominator
            result = new Fraction(a + c, b);
        } else {
            // if they are different, we use standard formula ad+bc / bd
            result = new Fraction(a * d + b * c, b * d);
        }

        return result;
    }

    // subtract
    public Fraction subtract(Fraction right) {

        int a = this.getNumerator(); 
        int b = this.getDenominator();
        int c = right.getNumerator();
        int d = right.getDenominator();

        // now formula 
        // if both have same denominator, we add numerators
        // and keep the denominator

        // declare Fraction result
        Fraction result = null;

        if(b == d) { // same denominator a-c / b
            result = new Fraction(a - c, b);
        } else {
            // if they are different, we use standard formula ad - bc / bd
            result = new Fraction(a * d - b * c, b * d);
        }

        return result;
    }

    // multiply
    public Fraction multipy(Fraction right) {

        // get the varlues
        int a = this.getNumerator(); 
        int b = this.getDenominator();
        int c = right.getNumerator();
        int d = right.getDenominator();

        // formula
        // result = a * c / b * d
        Fraction result = new Fraction(a * c, b * d);

        return result;
    }

    // divide
    public Fraction divide(Fraction right) {

        // get numerator and denominator
        int a = this.getNumerator(); 
        int b = this.getDenominator();
        int c = right.getNumerator();
        int d = right.getDenominator();

        // formula
        // 1. inverse or reciprocate right operand
        // 2. multiply
        // a * d / b * c
        Fraction result = new Fraction(a * d, b * c);

        return result;
    }


    // Utility Functions

    public double toDouble() {
        return (double) numerator / denominator;
    }

    // GCD function to find Greatest Common Divisor
    private int gcd(int p, int q) {
        if(q == 0) {
            return p;
        }

        return gcd(q, p%q); 
    }

    private void reduce() {
        // get the gcd
        int divisor = gcd(Math.abs(numerator), Math.abs(denominator));

        numerator /= divisor;
        denominator /= divisor;
    }

    // Tostring function
    public String toString() {

        int x = numerator; 

        // handle negative denominator, change the sign
        if(denominator < 0) {
            denominator *= -1; 
            numerator *= -1; 
        }

        int y = denominator; 

        return String.format("%d / %d", x, y);
    }
}
