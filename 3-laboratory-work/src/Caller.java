class Caller implements Runnable {
    final CallMe target;
    double member;

    public Caller(CallMe target, double member) {
        this.target = target;
        this.member = 2 / (1 + member * member) * 0.001;
        new Thread(this).start();
    }

    public void run() {
        synchronized (target) {
            target.calculate(this.member);
        }
    }
}