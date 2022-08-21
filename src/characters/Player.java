package characters;

public class Player {
    String  name;
    int     power;

    boolean     nextAccept;

    Guest       nextGuest;

    public Player(String name, int power) {
        this.name = name;
        this.power = power;
        this.nextAccept = false;
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

    public boolean getNextAccept() {
        return nextAccept;
    }

    public void setNextAccept(boolean nextAccept) {
        this.nextAccept = nextAccept;
    }

    public Guest getNextGuest() {
        return nextGuest;
    }

    public void setNextGuest(Guest nextGuest) {
        this.nextGuest = nextGuest;
    }
}
