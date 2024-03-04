import java.util.ArrayList;

/*
 * Represents a roster of players.
 */
public class Roster {
    ArrayList<Player> roster;

    public Roster(){
        roster = new ArrayList<Player>();
    }
    
    /*
     * adds a player to the roster
     */
    public void addPlayer(String name, String position, int number){
        Player player = new Player(name, position, number);
        roster.add(player);
    }

    /*
     * removes a player from the roster
     */
    public void removePlayer(Player player){
        roster.remove(player);
    }

    /*
     * returns the roster
     */
    public void getRoster(){

        }
    }


