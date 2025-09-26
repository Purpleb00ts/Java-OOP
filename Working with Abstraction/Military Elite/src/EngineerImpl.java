import java.util.ArrayList;
import java.util.List;

public class EngineerImpl extends SpecialisedSoldierImpl implements Engineer{
    private List<Repair> repairsList;

    public EngineerImpl(int id, String firstName, String lastName, double salary, String corpType) {
        super(id, firstName, lastName, salary, corpType);
        this.repairsList = new ArrayList<>();
    }

    public void addRepair (Repair repair){
        repairsList.add(repair);
    }

    @Override
    public List<Repair> getRepairs() {
        return this.repairsList;
    }

    @Override
    public String getCorp() {
        return getCorpsType();
    }

    @Override
    public String toString() {
        return String.format("Name: %s %s Id: %s Salary: %.2f%nCorps: %s%nRepairs:", this.getFirstName(), this.getLastName(), this.getId(), this.getSalary(), this.getCorp());
    }
}
