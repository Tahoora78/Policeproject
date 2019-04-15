public class Thief {
    private int x;
    private int y;
    private String get;

    public Thief(int xr,int yr){
        x = xr;
        y = yr;
    }
    public void setThiefPosition(int xs,int ys){
        x = xs;
        y = ys;
    }
    public int getXThiefPosition(){
        return x;
    }

    public int getYThiefposition(){
        return y;
    }

    public void setGet(String f){
        get = f;
    }
    public String getGet(){
        return get;
    }

    public void moveThief(int rand){
        int xp=0;
        int yp=0;
        switch (rand) {
            case (1):
                x = x-1;
                y = y+1;
                break;
            case (2):
                y = y+1;
                break;
            case (3):
                x = x+1;
                y = y+1;
                break;
            case (4):
                x = x-1;
                break;
            case (5):
                x = x+1;
                break;
            case (6):
                x = x-1;
                y = y-1;
                break;
            case (7):
                y = y-1;
                break;
            case (8):
                x = x+1;
                y = y-1;
                break;
        }
    }

}
