/**
 * Created by fhani on 7/17/2017.
 */
public class Main {
    public static void main(String[] args) {


        GameCharacter Warrior1 = new Warrior("Hercules", 8, 3,"spear");
        GameCharacter Warrior2 = new Warrior("Samwell Tarly", 2, 10, "gun");
        GameCharacter Wizard1 = new Wizard ("Harry Potter", 5, 8, 2, 4);
        GameCharacter Wizard2 = new Wizard ("Hermione Granger", 4,3,4, 4);
        GameCharacter Wizard3 = new Wizard ("Ron Weasly", 6, 3,3,2);
        GameCharacter[] gameCharacters = {Warrior1, Warrior2, Wizard1, Wizard2, Wizard3};


        for (GameCharacter characters: gameCharacters) {
            characters.Play();
        }
    }
}
