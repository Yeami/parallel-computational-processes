class Main {
    public static void main(String[] args) {
        CallMe target = new CallMe();
        double x = 0;
        for (int j = 1; j <= 100; j++) {
            x = getX(target, x);
            x = getX(target, x);
        }
    }

    private static double getX(CallMe target, double x) {
        new Caller(target, x);
        x = x + 0.001;
        new Caller(target, x);
        x = x + 0.001;
        new Caller(target, x);
        x = x + 0.001;
        new Caller(target, x);
        x = x + 0.001;
        new Caller(target, x);
        x = x + 0.001;
        return x;
    }
}