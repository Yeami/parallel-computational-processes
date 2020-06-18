class ExpCalculator implements Runnable {
    private final double a, b;
    private final char operation;
    private boolean isFinished = false;
    private double result;

    public ExpCalculator(ExpCalculator a, char operation, double b) {
        this.a = a.getResult();
        this.b = b;
        this.operation = operation;
        new Thread(this).start();
    }

    public ExpCalculator(double a, char operation, ExpCalculator b) {
        this.a = a;
        this.b = b.getResult();
        this.operation = operation;
        new Thread(this).start();
    }

    public ExpCalculator(double a, char operation, double b) {
        this.a = a;
        this.b = b;
        this.operation = operation;
        new Thread(this).start();
    }

    public ExpCalculator(ExpCalculator a, char operation, ExpCalculator b) {
        this.a = a.getResult();
        this.b = b.getResult();
        this.operation = operation;
        new Thread(this).start();
    }

    public synchronized void run() {
        switch (operation) {
            case '+' -> result = a + b;
            case '-' -> result = a - b;
            case '*' -> result = a * b;
            case '/' -> result = a / b;
        }
        isFinished = true;
        notifyAll();
    }

    public synchronized double getResult() {
        while (!isFinished) {
            try {
                wait(1);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException was caught");
            }
        }
        return result;
    }
}