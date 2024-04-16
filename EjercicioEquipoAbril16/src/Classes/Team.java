package Classes;

import java.util.Iterator;


public class Team implements Iterable<Player>{
    private Player[] players;
    private int size;

    public Team(int maxCapacity){
        this.players=new Player[maxCapacity];
        this.size=0;
    }
    public void addPlayer(Player player){
        if (size<players.length){
            players[size++]=player;

            }else{
            System.out.println("El equipo esta lleno");
        }
    }

    @Override
    public Iterator<Player> iterator() {
        return new TeamIterator();
    }
    private class TeamIterator implements Iterator<Player> {
        private int num;

        public TeamIterator() {
            this.num = 0;
        }

        @Override
        public boolean hasNext() {
            return num<size;
        }

        @Override
        public Player next() {
            if (hasNext()){
                return players[num++];
            }else{
                throw new RuntimeException("No hay mas elementos");
            }
        }
    }
    }

