/**
 * Created by fhani on 7/17/2017.
 */
public class MagicUsingCharacter extends GameCharacter {

    public MagicUsingCharacter(String name, int strength, int intelligence, int magicalEnergy) {
        super(name, strength, intelligence);
        this.magicalEnergy = magicalEnergy;
    }

    private int magicalEnergy;




/*    @Override
    public String Play() {
        getMagicalEnergy();
        String playerProp;
        playerProp = "name: " + getName() + " strength: " + getStrength() + " intelligence: " +
                getIntelligence() + " magical energy: " + magicalEnergy;
        return playerProp;
    }*/

@Override
public void Play() {
    System.out.println(super.toString() + " magical energy: " + magicalEnergy);
}

    public int getMagicalEnergy() {
        return magicalEnergy;
    }

    public void setMagicalEnergy(int magicalEnergy) {
        this.magicalEnergy = magicalEnergy;
    }
}
