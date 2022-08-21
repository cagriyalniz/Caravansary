package main;

public class Caravansary {
    int     room;
    int     reputation;

    int     guest;

    public Caravansary(int room, int reputation) {
        this.room = room;
        this.reputation = reputation;
        this.guest = 0;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public int getReputation() {
        return reputation;
    }

    public void setReputation(int reputation) {
        this.reputation = reputation;
    }

    public int getGuest() {
        return guest;
    }

    public void setGuest(int guest) {
        this.guest = guest;
    }


}
