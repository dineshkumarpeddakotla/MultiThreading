public class CharacterThread extends Thread{
    @Override
    public void run() {
        for (char i=65; i<=90; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
