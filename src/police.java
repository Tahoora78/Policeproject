import java.util.*;
public class police {
    private int x;
    private int y;
    private int xGround;
    private int yGround;
    private String seen;
    Random rands = new Random();
    public void setGroundPosition(int x,int y){
        xGround = x;
        yGround = y;
    }

    public void setxPolicePosition(int xs,int ys){
        x = xs;

    }
    public int getXPolicePosition(){
        return x;
    }

    public int getYPoliceposition(){
        return y;
    }

    public String getSeen(){
        return seen;
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


