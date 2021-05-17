public class Main {
    public static void main(String[] args) {
        CharacterThread characterThread = new CharacterThread();
        //characterThread.setPriority(1);
        characterThread.start();
        NumberThread numberThread = new NumberThread();
        Thread numThread = new Thread(numberThread);
        numThread.setDaemon(true);
        numThread.start();
        //numThread.setPriority(10);
    }
}
