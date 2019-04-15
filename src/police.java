import java.util.*;
public class police {
    private int x;
    private int y;
    private int xGround;
    private int yGround;
    private String seen;
    private String print;
    Thief thiefInPolice = new Thief(0,0);
    public void setThiefInPolice(int xt,int yt){
        thiefInPolice.setxGround(xt);
        thiefInPolice.setyGround(yt);
    }

    public void setPrint(String j){
        print = j;
    }

    public String getPrint(){
        return print;
    }
    Random rands = new Random();

    public police(int xp,int yp){
        x = xp;
        y = yp;
    }
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

    public void movepolice2(int rand){
        int xp=0;
        int yp=0;
        switch (rand) {
            case (1):
                if((x-1)>0 && (y+1) < yGround){
                    x = x-1;
                    y = y+1;
                }else{
                    rand = rands.nextInt(9);
                    movepolice2(rand);
                }
                break;
            case (2):
                if((y+1)<=yGround){
                    y = y+1;}
                else{
                    rand = rands.nextInt(9);
                    movepolice2(rand);
                }
                break;
            case (3):
                if((x+1)<xGround && (y+1)<yGround){
                    x = x+1;
                    y = y+1;}
                else{
                    rand = rands.nextInt(9);
                    movepolice2(rand);
                }
                break;
            case (4):
                if((x-1)>=0){
                    x = x-1;}
                else{
                    rand = rands.nextInt(9);
                    movepolice2(rand);
                }
                break;
            case (5):
                if((x+1)<xGround){
                    x = x+1;}
                else{
                    rand = rands.nextInt(9);
                    movepolice2(rand);
                }
                break;
            case (6):
                if((x-1)>=0 && (y-1)>=0){
                    x = x-1;
                    y = y-1;}
                else{
                    rand = rands.nextInt(9);
                    movepolice2(rand);
                }
                break;
            case (7):
                if((y-1)>=0){
                    y = y-1;}
                else{
                    rand = rands.nextInt(9);
                    movepolice2(rand);
                }
                break;
            case (8):
                if((x+1)<xGround && (y-1)>=0){
                    x = x+1;
                    y = y-1;
                }
                else{
                    rand = rands.nextInt(9);
                    movepolice2(rand);
                }
                break;
    }
    }
    public void movePolice1(int rand){
        int xp=0;
        int yp=0;
        int distance = Math.abs(x-thiefInPolice.getXThiefPosition())+ Math.abs(y-thiefInPolice.getYThiefposition());
        switch (rand) {
            case (1):
                if((x-1)>0 && (y+1) < yGround){
                x = x-1;
                y = y+1;
                if(Math.abs(x-thiefInPolice.getXThiefPosition())+ Math.abs(y-thiefInPolice.getYThiefposition())>distance){
                    x = x+1;
                    y = y-1;
                    rand = rands.nextInt(9);
                    movePolice1(rand);
                }
                }
                else{
                    rand = rands.nextInt(9);
                    movepolice2(rand);
                }
                break;
            case (2):
                if((y+1)<=yGround){
                y = y+1;
                    if(Math.abs(x-thiefInPolice.getXThiefPosition())+ Math.abs(y-thiefInPolice.getYThiefposition())>distance){
                        y=y-1;
                        rand = rands.nextInt(9);
                        movepolice2(rand);
                    }
                }
                else{
                    rand = rands.nextInt(9);
                    movepolice2(rand);
                }
                break;
            case (3):
                if((x+1)<xGround && (y+1)<yGround){
                x = x+1;
                y = y+1;
                    if(Math.abs(x-thiefInPolice.getXThiefPosition())+ Math.abs(y-thiefInPolice.getYThiefposition())>distance){
                        x=x-1;
                        y = y-1;
                        rand = rands.nextInt(9);
                        movepolice2(rand);
                    }
                }
                else{
                    rand = rands.nextInt(9);
                    movepolice2(rand);
                }
                break;
            case (4):
                if((x-1)>=0){
                x = x-1;
                    if(Math.abs(x-thiefInPolice.getXThiefPosition())+ Math.abs(y-thiefInPolice.getYThiefposition())>distance){
                        x=x+1;
                        rand = rands.nextInt(9);
                        movepolice2(rand);
                    }
                }
                else{
                    rand = rands.nextInt(9);
                    movepolice2(rand);
                }
                break;
            case (5):
                if((x+1)<xGround){
                x = x+1;
                    if(Math.abs(x-thiefInPolice.getXThiefPosition())+ Math.abs(y-thiefInPolice.getYThiefposition())>distance){
                        x = x-1;
                        rand = rands.nextInt(9);
                        movepolice2(rand);
                    }
                }
                else{
                    rand = rands.nextInt(9);
                    movepolice2(rand);
                }
                break;
            case (6):
                if((x-1)>=0 && (y-1)>=0){
                x = x-1;
                y = y-1;
                    if(Math.abs(x-thiefInPolice.getXThiefPosition())+ Math.abs(y-thiefInPolice.getYThiefposition())>distance){
                        x = x+1;
                        y = y+1;
                        rand = rands.nextInt(9);
                        movepolice2(rand);
                    }
                }
                else{
                    rand = rands.nextInt(9);
                    movepolice2(rand);
                }
                break;
            case (7):
                if((y-1)>=0){
                y = y-1;
                    if(Math.abs(x-thiefInPolice.getXThiefPosition())+ Math.abs(y-thiefInPolice.getYThiefposition())>distance){
                        y=y+1;
                        rand = rands.nextInt(9);
                        movepolice2(rand);
                    }
                }
                else{
                    rand = rands.nextInt(9);
                    movepolice2(rand);
                }
                break;
            case (8):
                if((x+1)<xGround && (y-1)>=0){
                x = x+1;
                y = y-1;
                    if(Math.abs(x-thiefInPolice.getXThiefPosition())+ Math.abs(y-thiefInPolice.getYThiefposition())>distance){
                        x = x-1;
                        y = y+1;
                        rand = rands.nextInt(9);
                        movepolice2(rand);
                    }
                }
                else{
                    rand = rands.nextInt(9);
                    movePolice1(rand);
                }
                break;
        }
    }

    }


