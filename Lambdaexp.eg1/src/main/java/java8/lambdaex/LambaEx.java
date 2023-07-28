package java8.lambdaex;

public class LambaEx {
    public static void main(String[]args){
        Runnable r1=new Runnable() {

            public void run() {
               System.out.println("Thread1 is running");
            }
        };
        Thread t1=new Thread(r1);
        t1.start();
        Runnable r2=()->{
            System.out.println("Thread 2 is running");


        };
Thread t2=new Thread();
t2.start();
    }
}
