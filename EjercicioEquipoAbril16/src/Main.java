import Classes.Player;
import Classes.Team;

public class Main {
    public static void main(String[] args) {
        Team t1=new Team(4);
        Player p1=new Player("Cristiano","Delantero",18);
        Player p2=new Player("Messi","Delantero",10);
        Player p3=new Player("Armani","Poetero",1);
        t1.addPlayer(p1);
        t1.addPlayer(p2);
        t1.addPlayer(p3);
        t1.addPlayer(new Player("Benzema","Defensa",5));
        System.out.println("Jugadores");
        for (Player player:t1){
            System.out.println(player);
        }
    }
}