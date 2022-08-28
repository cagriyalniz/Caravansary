package main;

import characters.Merchant;
import characters.Player;
import characters.Thief;
import utils.DailyRoutine;
import utils.Print;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Player plyr = new Player("", 50);
        Caravansary crvn = new Caravansary(5, 85, 5);
        Scanner scn = new Scanner(System.in);
        Random r=new Random();


        Print prn = new Print("welcome to Game of Caravansary", 1400);

        prn.PrintStr();
        prn.setStr("17. yüzyılda anadolunun kervan geçen kuş uçan bir köyünde, uluslararası üne sahip aşkar dinlenme" +
                "tesisleri ile bir franchise sözleşmesi yapmış bulunmaktasın.");
        prn.PrintStr();
        prn.setWait(5000);
        prn.setStr("Bu sözleşmenin yükümlülükleri gereğince kervansarayın itibarını korumalı, " +
                "müşterilerini memnun etmeli, ve yasalara uymak zorundasın.");
        prn.setStr("kervansarayında şu an 5 yatak odası, 1 mutfak bulunmakta.");
        prn.PrintStr();
        prn.setWait(4000);
        prn.setStr("itibar puanın 85/100. sakın 25'in altına düşürme!");
        prn.PrintStr();
        prn.setWait(1000);
        prn.setStr("By the way, adın neydi ?");
        prn.PrintStr();
        plyr.setName(scn.nextLine());


        while(crvn.reputation > 25){
            int GuestId =r.nextInt(2);
            switch (GuestId){
                case 0:
                    Merchant mrc = new Merchant("Hassan", 100, 20, 2, 'm');
                    prn.setStr("çin'in ipeğini konstantini'ye taşıyan bir tüccarım" +
                            "bir gece konaklamak istiyorum");
                    prn.PrintStr();
                    prn.setStr("misafir geldi." + plyr.getName() + " kapıyı açacak mısın ? (Y/N)");
                    prn.PrintStr();
                    plyr.setNextAccept(scn.nextLine().charAt(0));
                    plyr.setNextGuest(mrc);
                    if(plyr.getNextAccept() == 'Y')
                        mrc.setAccept(plyr.getNextAccept());
                        DailyRoutine dr = new DailyRoutine(plyr, crvn, mrc, null, 2);
                        dr.Action();
                        dr.Info();
                case 1:
                    int tMoney = r.nextInt(45);
                    Thief thf = new Thief("hood robin", tMoney, 25, -15, 't');
                    prn.setStr("bir gecelik odaya ihityacım var!");
                    prn.PrintStr();
                    prn.setStr("misafir geldi." + plyr.getName() + " kapıyı açacak mısın ? (Y/N)");
                    prn.PrintStr();
                    plyr.setNextAccept(scn.nextLine().charAt(0));
                    plyr.setNextGuest(thf);
                    if(plyr.getNextAccept() == 'Y')
                        thf.setAccept(plyr.getNextAccept());
                        // dr = new DailyRoutine(plyr, crvn, null, thf);
                        dr = new DailyRoutine(plyr, crvn, null, thf, 2);
                        dr.Action();

            }



//            DailyRoutine dr = new DailyRoutine(plyr, crvn, mrc, thf);
//            dr.Action();
//            dr.Info();
        }
        prn.setWait(7000);
        prn.setStr("Kent konseyi: " + plyr.getName() + " bu diyarlarda butik kervansaray işleri sana göre değil." +
                "şansını başka sektörlerde denemeni tavsiye ederiz. kasabadan ayrılmadan önce" +
                "işletme ruhsatını, esnaf ve zanaatkarlar odası iş yeri açma belgesini" +
                "teslim etmeyi unutma. var git yoluna!");
        prn.PrintStr();



    }
}
