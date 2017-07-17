/**
 * Created by fhani on 7/17/2017.
 */
public abstract class GameCharacter {

    private String name;
    private int strength;
    private int intelligence;

    public GameCharacter(){}

    public GameCharacter(String name, int strength, int intelligence) {
        this.name = name;
        this.strength = strength;
        this.intelligence = intelligence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }


    public abstract void Play ();

    @Override
    public String toString() {
        return "name: " + getName() + " strength: " + getStrength() + " intelligence: " + getIntelligence();
    }

//    public String Play () {
//        String playerProp;
//        getName();
//        getStrength();
//        getIntelligence();
//        playerProp = "name: " + name + " strength: " + strength + " intelligence: " + intelligence;
//        return playerProp;
    }

