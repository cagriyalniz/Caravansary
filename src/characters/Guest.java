package characters;

import utils.Print;

public class Guest {
    String  name;
    int     money;
    int     power;
    int     reputation;
    int     makeFuss;

    String  str;

    char accept;

    char type;

    public Guest(String name, int money, int power, int reputation, char type) {
        this.name = name;
        this.money = money;
        this.power = power;
        this.reputation = reputation;
        if(reputation < 50)
            this.makeFuss = 10;
        else
            this.makeFuss = 0;
        this.accept = 0;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getReputation() {
        return reputation;
    }

    public void setReputation(int reputation) {
        this.reputation = reputation;
    }

    public int getMakeFuss() {
        return makeFuss;
    }

    public void setMakeFuss(int makeFuss) {
        this.makeFuss = makeFuss;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public char isAccept() {
        return accept;
    }

    public void setAccept(char accept) {
        this.accept = accept;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }
}


