/**
 * Created by fhani on 7/17/2017.
 */
public class Warrior extends GameCharacter {

    private String weaponType;

    public Warrior(){}

    public Warrior(String name, int strength, int intelligence, String weaponType) {
        super(name, strength, intelligence);
        this.weaponType = weaponType;
    }

/*    @Override
    public String Play() {
        String playerProp;
        playerProp = "name: " + getName() + " strength: " + getStrength() + " intelligence: " +
                getIntelligence() + " weapon type: " + getWeaponType();
        return playerProp;
    }*/

@Override
public void Play() {
    System.out.println(super.toString() + " weapon type: " + getWeaponType());
}

    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

//    @Override
//    public String Play() {
//        String playerProp;
//        playerProp = super.Play() + " weapon type: " + getWeaponType();
//        return playerProp;
//    }
}
