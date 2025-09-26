import java.util.ArrayList;
import java.util.List;

public class LieutenantGeneralImpl extends PrivateImpl implements LieutenantGeneral{
    private List<Private> privateList;

    public LieutenantGeneralImpl(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName, salary);
        this.privateList = new ArrayList<>();
    }


    public void addPrivate(Private priv){
        privateList.add(priv);
    }

    @Override
    public List<Private> getPrivateList() {
        return privateList;
    }
    @Override
    public String toString() {
        return String.format("Name: %s %s Id: %s Salary: %.2f%nPrivates:", this.getFirstName(), this.getLastName(), this.getId(), this.getSalary());
    }

}
