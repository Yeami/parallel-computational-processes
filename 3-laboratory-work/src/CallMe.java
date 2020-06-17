class CallMe {
    double sum = 0;

    public void calculate(double member) {
        sum = sum + member;
        System.out.println("Member: " + member + " value: " + sum);
    }
}