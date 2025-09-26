import java.util.List;

public interface Engineer {
    List<Repair> getRepairs();
    String getCorp();
    void addRepair (Repair repair);
    String toString();
}
