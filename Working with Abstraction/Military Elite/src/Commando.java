import java.util.List;

public interface Commando {
    List<Mission> getMissionList();
    void addMission(Mission mission);
    String getCorp();
    String toString();
}
