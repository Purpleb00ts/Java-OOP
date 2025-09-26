public class Player {
    private String name;
    private int endurance;
    private int sprint;
    private int dribble;
    private int passing;
    private int shooting;

    public Player(String name, int endurance, int sprint, int dribble, int passing, int shooting){
        setName(name);
        setEndurance(endurance);
        setSprint(sprint);
        setDribble(dribble);
        setPassing(passing);
        setShooting(shooting);
    }

    public void setName(String name) {
        if(name == null || name.isBlank()){
            throw new IllegalArgumentException("A name should not be empty.");
        } else {
            this.name = name;
        }
    }

    public void setEndurance(int endurance) {
        if(checkStat(endurance)){
            throw new IllegalArgumentException("Endurance should be between 0 and 100.");
        } else {
            this.endurance = endurance;
        }
    }

    public void setSprint(int sprint) {
        if(checkStat(sprint)){
            throw new IllegalArgumentException("Sprint should be between 0 and 100.");
        } else {
            this.sprint = sprint;
        }
    }

    public void setDribble(int dribble) {
        if(checkStat(dribble)){
            throw new IllegalArgumentException("Dribble should be between 0 and 100.");
        } else {
            this.dribble = dribble;
        }
    }

    public void setPassing(int passing) {
        if(checkStat(passing)){
            throw new IllegalArgumentException("Passing should be between 0 and 100.");
        } else {
            this.passing = passing;
        }
    }

    public void setShooting(int shooting) {
        if(checkStat(shooting)){
            throw new IllegalArgumentException("Shooting should be between 0 and 100.");
        } else {
            this.shooting = shooting;
        }
    }

    private boolean checkStat (int stat){
        if(stat < 0 || stat > 100){
            return true;
        }
        return false;
    }

    public String getName(){
        return name;
    }

    public double overallSkillLevel(){
        return (endurance + sprint + dribble + passing + shooting) / 5.00;
    }
}
