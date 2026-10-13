class MyThread implements Runnable {
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("Thread running: " + i);
        }
    }

    public static void main(String[] args) {
        MyThread obj = new MyThread();
        Thread t1 = new Thread(obj);
        t1.start();
    }
}