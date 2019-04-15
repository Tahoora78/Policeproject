import java.util.Random;

public class Thief {
    private int x;
    private int y;
    private String get;
    private int xGround;
    private int yGround;

    Random rands = new Random();
    public void setxGround(int xp){
        xGround = xp;
    }
    public void setyGround(int yp){
        yGround = yp;
    }

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

    public void movePolice(int rand){
        int xp=0;
        int yp=0;
        switch (rand) {
            case (1):
                if((x-1)>0 && (y+1) <= yGround){
                    x = x-1;
                    y = y+1;
                }else{
                    rand = rands.nextInt(9);
                    movePolice(rand);
                }
                break;
            case (2):
                if((y+1)<=yGround){
                    y = y+1;}
                else{
                    rand = rands.nextInt(9);
                    movePolice(rand);
                }
                break;
            case (3):
                if((x+1)<=xGround && (y+1)<=yGround){
                    x = x+1;
                    y = y+1;}
                else{
                    rand = rands.nextInt(9);
                    movePolice(rand);
                }
                break;
            case (4):
                if((x-1)>=0){
                    x = x-1;}
                else{
                    rand = rands.nextInt(9);
                    movePolice(rand);
                }
                break;
            case (5):
                if((x+1)<=xGround){
                    x = x+1;}
                else{
                    rand = rands.nextInt(9);
                    movePolice(rand);
                }
                break;
            case (6):
                if((x-1)>=0 && (y-1)>=0){
                    x = x-1;
                    y = y-1;}
                else{
                    rand = rands.nextInt(9);
                    movePolice(rand);
                }
                break;
            case (7):
                if((y-1)>=0){
                    y = y-1;}
                else{
                    rand = rands.nextInt(9);
                    movePolice(rand);
                }
                break;
            case (8):
                if((x+1)<=xGround && (y-1)>=0){
                    x = x+1;
                    y = y-1;
                }
                else{
                    rand = rands.nextInt(9);
                    movePolice(rand);
                }
                break;
        }
    }

}
