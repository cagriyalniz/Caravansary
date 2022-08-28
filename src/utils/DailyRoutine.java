package utils;

import characters.Player;
import main.Caravansary;

import javax.lang.model.type.NullType;

public class DailyRoutine <T1, T2>{
    Player      ply;
    Caravansary crvn;
    int         guestRequest;
    T1          merchant;
    T2          thief;

    public DailyRoutine(Player ply, Caravansary crvn, T1 merchant, T2 thief, int guestRequest) {
        this.ply = ply;
        this.crvn = crvn;
        if(merchant != null)
            this.merchant = merchant;
        if(thief != null)
            this.thief = thief;
        this.guestRequest = guestRequest;

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

    public T1 getMerchant() {
        return merchant;
    }

    public void setMerchant(T1 merchant) {
        this.merchant = merchant;
    }

    public T2 getThief() {
        return thief;
    }

    public void setThief(T2 thief) {
        this.thief = thief;
    }

    public int getGuestRequest() {
        return guestRequest;
    }

    public void setGuestRequest(int guestRequest) {
        this.guestRequest = guestRequest;
    }

    public void Action(){
        if(crvn.getRoom() <= 0){
            System.out.println("Oda kalmamıştı ve sen birisini içeri aldın. " +
                    "Huzursuzluk çıktı!");
            System.out.println("Reputation puanın 20 azaldı!");
            crvn.setReputation(crvn.getReputation() - 20);
        }
        crvn.setRoom(crvn.getRoom() - 1);
        this.setGuestRequest(this.getGuestRequest() - 1);
        crvn.setRoom(crvn.getRoom() - 1);
        if(ply.getNextGuest().getType() == 't')
                crvn.setReputation(crvn.getReputation() - 15);
        if(ply.getNextGuest().getType() == 'm')
            crvn.setReputation(crvn.getReputation() + 5);
//        if(this.thief != null)
//            neden fonksiyonlarına çağıramıyorum???
//            this.thief.
//            thief.
        if(this.getGuestRequest() <= 0) {
            EndofDay();
        }

    }

    public void EndofDay(){
        System.out.println("Bugün'ü de böyle atlattın. yarına kadar iyice dinlen!");
        System.out.println("tüm konuklar ayrıldı. odalar boşaltıldı.");
        crvn.setRoom(5);//dışarıdan aldığımızı başka bir değişkene atmadan nasıl kullanabiliriz. manuel de yazmak istemiyorum
        this.setGuestRequest(2);//dışarıdan aldığımızı başka bir değişkene atmadan nasıl kullanabiliriz. manuel de yazmak istemiyorum

        Info();
    }
    public void Info(){
        System.out.println("guest: " +  ply.getNextGuest());
        System.out.println("reput: " +  crvn.getReputation());
        System.out.println("room: " +   crvn.getRoom());
    }


}
