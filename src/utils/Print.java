package utils;

public class Print {
    String  str;
    int     wait;

    public Print(String str, int wait) {
        this.str = str;
        this.wait = wait;
    }

    public int getWait() {
        return wait;
    }

    public void setWait(int wait) {
        this.wait = wait;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public void PrintStr() {
        try
        {
            Thread.sleep(this.getWait());
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println(this.getStr());
    }
}
