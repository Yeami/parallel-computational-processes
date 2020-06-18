class Main {
    public static void main(String[] args) {
        final double A = 1, B = 2, C = 3;

        System.out.println("--- Initial data ---\nA: " + A + "\nB: " + B + "\nC: " + C + "\n--------------------\n");

        ExpCalculator firstPair = new ExpCalculator(A, '+', C);
        ExpCalculator secondPair = new ExpCalculator(firstPair, '-', B);
        ExpCalculator thirdPair = new ExpCalculator(A, '-', C);
        ExpCalculator fourthPair = new ExpCalculator(thirdPair, '*', B);
        ExpCalculator fifthPair = new ExpCalculator(secondPair, '/', fourthPair);

        System.out.println("Result:\n(A+C-B) / (B*(A-C)) = " + fifthPair.getResult());
    }
}