class Main {
    public static void main(String[] args) {
        final double A = 1, B = 2, C = 3;
        final String output = "Waiting for the completion of the ";

        System.out.println("--- Initial data ---\nA: " + A + "\nB: " + B + "\nC: " + C + "\n--------------------\n");
        System.out.println("Start the calculation...\n");

        TreeCalculator firstPair = new TreeCalculator(A, C, '+');
        while (!firstPair.isFinished) System.out.println(output + "first pair");

        TreeCalculator secondPair = new TreeCalculator(firstPair.result, B, '-');
        while (!secondPair.isFinished) System.out.println(output + "second pair");

        TreeCalculator thirdPair = new TreeCalculator(A, C, '-');
        while (!thirdPair.isFinished) System.out.println(output + "third pair");

        TreeCalculator fourthPair = new TreeCalculator(thirdPair.result, B, '*');
        while (!fourthPair.isFinished) System.out.println(output + "fourth pair");

        TreeCalculator fifthPair = new TreeCalculator(secondPair.result, fourthPair.result, '/');
        while (!fifthPair.isFinished) System.out.println(output + "fifth pair");

        System.out.println("\nResult:\n(A+C-B) / (B*(A-C)) = " + fifthPair.result);
    }
}