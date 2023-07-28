package ArrayList.demo;

public class DefaultCon {
   public boolean DefaultCon(){
        System.out.println("Default Constructor has no parameters");
       return false;
   }

    public static void main(String[] args) {
        DefaultCon dc=new DefaultCon();
       System.out.println(dc.DefaultCon());
    }
}
