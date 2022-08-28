package characters;

public class Player {
    String      name;
    int         power;

    char     nextAccept;
    Guest       nextGuest;

    public Player(String name, int power) {
        this.name = name;
        this.power = power;
        this.nextAccept = 'N';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public char getNextAccept() {
        return nextAccept;
    }

    public void setNextAccept(char nextAccept) {
        this.nextAccept = nextAccept;
    }

    public Guest getNextGuest() {
        return nextGuest;
    }

    public void setNextGuest(Guest nextGuest) {
        this.nextGuest = nextGuest;
    }
}
