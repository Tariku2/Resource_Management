package encapsulation;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        player.name="Tariku";
        player.health=40;
        player.weapon="Gun";
        int damage=50;
        player.loseHealth(damage);
        System.out.println("Ramaining health is "+player.healthRemaining());
    }
}
