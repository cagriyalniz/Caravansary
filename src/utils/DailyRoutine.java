package utils;

import characters.Player;
import main.Caravansary;

public class DailyRoutine {
    Player ply;
    Caravansary crvn;

    public DailyRoutine(Player ply, Caravansary crvn) {
        this.ply = ply;
        this.crvn = crvn;
    }

    public Player getPly() {
        return ply;
    }

    public void setPly(Player ply) {
        this.ply = ply;
    }

    public Caravansary getCrvn() {
        return crvn;
    }

    public void setCrvn(Caravansary crvn) {
        this.crvn = crvn;
    }

    public void Action(){
        if(ply.getNextGuest().getType() == 't')
                crvn.setReputation(crvn.getReputation() - 15);
        if(ply.getNextGuest().getType() == 'm')
            crvn.setReputation(crvn.getReputation() + 5);
    }

    public void Info(){
        System.out.println("guest: " + ply.getNextGuest());
        System.out.println("reput: " + crvn.getReputation());
    }
}
