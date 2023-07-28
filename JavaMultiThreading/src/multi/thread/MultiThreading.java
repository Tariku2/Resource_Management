package multi.thread;

public class MultiThreading {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {


          MultiThreadThing thing= new MultiThreadThing(i);
          thing.start();
        }
    }

}
