import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.*;
public class Animal {

    public String Name;
    public Gender gender;
    public Reservor ReservedBy;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Reservor getReservedBy() {
        return ReservedBy;
    }

    public void setReservedBy(Reservor reservedBy) {
        ReservedBy = reservedBy;
    }

    static Scanner userInput = new Scanner(System.in);

    public Animal() {
    }

    public Animal(String name, Gender gender) {
        Name = name;
        this.gender = gender;
    }

    public boolean Reserve(String reservedBy){
        if(this.ReservedBy == null){
            this.ReservedBy = new Reservor(reservedBy, LocalDateTime.now());
            return true;
        }
        return false;
    }

    public String ToString(){
        String reserved = "not reserve";
        if(this.ReservedBy != null){
            reserved = "reserved by " + this.ReservedBy.Name;
        }
        return "" + this.Name + this.gender + reserved;
    }


}
