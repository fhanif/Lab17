/**
 * Created by fhani on 7/17/2017.
 */
public class Wizard extends MagicUsingCharacter {


    private int spellNumber;

    public Wizard(String name, int strength, int intelligence, int magicalEnergy, int spellNumber) {
        super(name, strength, intelligence, magicalEnergy);
        this.spellNumber = spellNumber;
    }


    public int getSpellNumber() {
        return spellNumber;
    }

    public void setSpellNumber(int spellNumber) {
        this.spellNumber = spellNumber;
    }

    @Override
    public void Play() {
        System.out.println(super.toString() + " magical number: " + getMagicalEnergy() + " spell number: " + spellNumber);
    }



}
