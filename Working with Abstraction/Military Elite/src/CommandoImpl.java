import java.util.ArrayList;
import java.util.List;

public class CommandoImpl extends SpecialisedSoldierImpl implements Commando{
    private List<Mission> missionList;

    public CommandoImpl(int id, String firstName, String lastName, double salary, String corpType) {
        super(id, firstName, lastName, salary, corpType);
        missionList = new ArrayList<>();
    }

    public void addMission(Mission mission){
        missionList.add(mission);
    }

    @Override
    public List<Mission> getMissionList() {
        return missionList;
    }

    @Override
    public String getCorp() {
        return getCorpsType();
    }

    @Override
    public String toString() {
        return String.format("Name: %s %s Id: %s Salary: %.2f%nCorps: %s%nMissions:", this.getFirstName(), this.getLastName(), this.getId(), this.getSalary(), this.getCorp());
    }
}
