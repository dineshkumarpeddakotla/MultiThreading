public class NumberThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i<100; i++) {
            System.out.println(i +1);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
