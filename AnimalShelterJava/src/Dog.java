import java.time.LocalDateTime;
import java.util.*;
public class Dog extends Animal{

    public LocalDateTime LastWalk;

    public LocalDateTime getLastWalk() {
        return LastWalk;
    }

    public void setLastWalk(LocalDateTime lastWalk) {
        LastWalk = lastWalk;
    }
}
