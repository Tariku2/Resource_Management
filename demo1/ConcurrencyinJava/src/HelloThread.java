public class HelloThread extends Thread {
    public void run(){
        System.out.println("Welcome back");
    }
    public static void main(String[] args) {
        (new HelloThread()).start();
    }
}
