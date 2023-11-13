public class CalculatorDriver {
    public static void main(String[] args) {
        BasicCalculator basicCalculator = new BasicCalculator();
        System.out.println("5 + 7 = " + basicCalculator.add(5, 7));
        System.out.println("5 - 7 = " + basicCalculator.subtract(5, 7));
        System.out.println("5 * 7 = " + basicCalculator.multiply(5, 7));
        System.out.println("5 / 7 = " + basicCalculator.divide(5, 7));

        ScientificCalculator scientificCalculator = new ScientificCalculator();
        System.out.println("Exponent of 20 = " + scientificCalculator.exp(20));
        System.out.println("Logarithm of 100 = " + scientificCalculator.log(100));
        scientificCalculator.putValueInMemory(23.5);
        System.out.println("Value of memory = " + scientificCalculator.getValueFromMemory());

        TrigonometricCalculator trigonometricCalculator = new TrigonometricCalculator();
        System.out.println("Sine of 0.5 is = " + trigonometricCalculator.sine(0.5));
        System.out.println("Cosine of 0.5 is = " + trigonometricCalculator.cosine(0.5));
        System.out.println("Tangent of 0.5 is = " + trigonometricCalculator.tangent(0.5));
        System.out.println("Arc-Sine of 0.5 is = " + trigonometricCalculator.arcsine(0.5));
        System.out.println("Arc-cosine of 0.5 is = " + trigonometricCalculator.arccosine(0.5));
        System.out.println("Arc-tangent of 0.5 is = " + trigonometricCalculator.arctangent(0.5));

    }
}
