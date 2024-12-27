
package fraction;


public class Fraction
{
    
    private int numerator;
    private int denominator;

    // Default constructor initializing to 1/1
    public Fraction() {
        this.numerator = 1;
        this.denominator = 1;
    }

    // Overloaded constructor to initialize with given numerator and denominator
    public Fraction(int n, int d) {
        if (d == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        this.numerator = n;
        this.denominator = d;
    }

    // toString() method to return fraction as a string
    public String toString() {
        return numerator + "/" + denominator;
    }

    // getDecimal() method to return the decimal equivalent
    public double getDecimal() {
        return (double) numerator / denominator;
    }

    // reduce() method to reduce the fraction to its lowest terms
    public void reduce() {
        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
    }

    // Helper method to calculate the greatest common divisor (GCD)
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // toMixed() method to return the fraction as a mixed number
    public String toMixed() {
        int wholeNumber = numerator / denominator;
        int remainder = Math.abs(numerator % denominator);
        
        // If there is no whole number, just return the fraction
        if (wholeNumber == 0) {
            return remainder + "/" + denominator;
        }
        
        // If there is a whole number, return "wholeNumber remainder/denominator"
        if (remainder == 0) {
            return String.valueOf(wholeNumber);
        }
        
        return wholeNumber + " " + remainder + "/" + denominator;
    }
    
}
   

