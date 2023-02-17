package OOP;

public class humanChild extends human {
    boolean hasTail;
    humanChild(String hairColor, int age, boolean hasTail) {
        super(hairColor, age);
        this.hasTail = hasTail;
    }
    
}
