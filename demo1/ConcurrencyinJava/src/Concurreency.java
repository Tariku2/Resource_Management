class Concurrent implements Runnable{

    @Override
    public void run() {
        System.out.println("Hello Man");

    }

    public static void main(String[] args) {
        new Thread(new Concurrent()).start();
    }
}