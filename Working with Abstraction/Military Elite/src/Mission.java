public class Mission {
    private String codeName;
    private String missionState;

    public Mission(String codeName, String state) {
        this.codeName = codeName;
        setMissionState(state);
    }

    public void setMissionState(String missionState) {
        MissionState[] missionStates = MissionState.values();
        boolean flag = false;
        for (MissionState state : missionStates) {
            if(missionState.equals("inProgress") || missionState.equals("finished")){
                this.missionState = missionState;
                flag = true;
            }
        }
        if(!flag){
            throw new IllegalArgumentException();
        }
    }

    @Override
    public String toString() {
        return String.format("  Code Name: %s State: %s", this.codeName, this.missionState);
    }
}
