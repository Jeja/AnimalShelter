import java.util.*;
public class Cat extends Animal{

    public String BadHabits;

    public String getBadHabits() {
        return BadHabits;
    }

    public void setBadHabits(String badHabits) {
        BadHabits = badHabits;
    }

    public Cat(String name, Gender gender, String badHabits){
        this.BadHabits = badHabits;
    }

}
