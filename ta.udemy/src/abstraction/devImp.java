package abstraction;

public class devImp implements develop{
    @Override
    public void display() {
        System.out.println("Wel come to World of developers");
    }

    public static void main(String[] args) {
        devImp di= new devImp();
        di.display();
    }
}
