import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Team> teams = new ArrayList<>();

        String input = scanner.nextLine();

        while(!input.equals("END")){
            String[] commands = input.split(";");
            String command = commands[0];
            String teamName = commands[1];

            switch(command){
                case "Team":
                    addTeam(teams, teamName);
                    break;
                case "Add":
                    addPlayer(teams, commands, teamName);
                    break;
                case "Remove":
                    removePlayer(teams, commands, teamName);
                    break;
                case "Rating":
                    getRating(teams, teamName);
                    break;
            }
            input = scanner.nextLine();
        }
    }

    private static void addTeam(List<Team> teams, String teamName) {
        try {
            Team team = new Team(teamName);
            teams.add(team);
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    private static void getRating(List<Team> teams, String teamName) {
        if(teamExist(teams, teamName)) {
            for (Team team1 : teams) {
                if (team1.getName().equals(teamName)) {
                    System.out.printf("%s - %d%n", teamName, Math.round(team1.getRating()));
                    break;
                }
            }
        }
    }

    private static void removePlayer(List<Team> teams, String[] commands, String teamName) {
        String playerName = commands[2];
        for (Team team1 : teams) {
            if(team1.getName().equals(teamName)){
                try {
                    team1.removePlayer(playerName);
                }
                catch (IllegalArgumentException e){
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    private static void addPlayer(List<Team> teams, String[] commands, String teamName) {
        if(teamExist(teams, teamName)) {

            for (Team team1 : teams) {
                if (team1.getName().equals(teamName)) {
                    String playerName = commands[2];
                    int endurance = Integer.parseInt(commands[3]);
                    int sprint = Integer.parseInt(commands[4]);
                    int dribble = Integer.parseInt(commands[5]);
                    int passing = Integer.parseInt(commands[6]);
                    int shooting = Integer.parseInt(commands[7]);
                    try {
                        Player player = new Player(playerName, endurance, sprint, dribble, passing, shooting);
                        team1.addPlayer(player);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                }
            }
        }
    }

    public static boolean teamExist(List<Team> teamList, String teamName){
        for (Team team : teamList) {
            if(team.getName().equals(teamName)){
                return true;
            }
        }
        System.out.printf("Team %s does not exist.%n", teamName);
        return false;
    }
}
