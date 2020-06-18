class TreeCalculator implements Runnable {
    double a, b, result;
    boolean isFinished = false;
    char operation;

    public TreeCalculator(double a, double b, char operation) {
        this.a = a;
        this.b = b;
        this.operation = operation;
        new Thread(this).start();
    }

    public void run() {
        switch (operation) {
            case '+' -> result = this.a + this.b;
            case '-' -> result = this.a - this.b;
            case '*' -> result = this.a * this.b;
            case '/' -> result = this.a / this.b;
        }
        isFinished = true;
    }
}