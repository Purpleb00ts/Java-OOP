import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Team {
    private String name;
    private List<Player> players;

    public Team(String name){
        setName(name);
        players = new ArrayList<>();
    }

    private void setName(String name){
        if(name == null || name.isBlank()){
            throw new IllegalArgumentException("A name should not be empty.");
        } else {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public void addPlayer(Player player){
        players.add(player);
    }

    public void removePlayer(String playerName){
        boolean isRemoved = players.removeIf(e -> e.getName().equals(playerName));
        if(!isRemoved){
            throw new IllegalArgumentException("Player " + playerName + " is not in " + this.name + " team.");
        }
    }

    public double getRating(){
        return players.stream()
                .mapToDouble(Player::overallSkillLevel)
                .average()
                .orElse(0.00);
    }
}
