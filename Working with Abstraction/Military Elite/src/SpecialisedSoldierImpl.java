import java.util.List;

public class SpecialisedSoldierImpl extends PrivateImpl implements SpecialisedSoldier{
    private String corpType;

    public SpecialisedSoldierImpl(int id, String firstName, String lastName, double salary, String corp) {
        super(id, firstName, lastName, salary);
        setCorpType(corp);
    }

    public void setCorpType(String corpType){
        CorpType[] corpTypes = CorpType.values();
        boolean flag = false;
        for (CorpType type : corpTypes) {
            if(corpType.equals("Airforces") || corpType.equals("Marines")){
                this.corpType = corpType;
                flag = true;
            }
        }
        if(!flag){
            throw new IllegalArgumentException();
        }
    }

    @Override
    public String getCorpsType() {
        return corpType;
    }
}
