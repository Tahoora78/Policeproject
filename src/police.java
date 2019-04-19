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
        //System.out.println("movepolice2");
        int xp=0;
        int yp=0;
        switch (rand) {
            case (0):
                if((x-1)>=0 && (y+1) < yGround){
                    x = x-1;
                    y = y+1;
                }else{
                    rand = rands.nextInt(8);
                    movepolice2(rand);
                }
                System.out.println("1x::"+x+"y::"+y);
                break;
            case (1):
                if((y+1)<yGround){
                    y = y+1;}
                else{
                    rand = rands.nextInt(8);
                   // System.out.println("rand"+rand);
                   // System.out.println("y"+y);
                 //   System.out.println("yground"+yGround);
                    movepolice2(rand);
                }
               // System.out.println("2x::"+x+"y::"+y);
                break;
            case (2):
                if((x+1)<xGround && (y+1)<yGround){
                    x = x+1;
                    y = y+1;}
                else{
                    rand = rands.nextInt(8);
                    movepolice2(rand);
                }
               // System.out.println("3x::"+x+"y::"+y);
                break;
            case (3):
                if((x-1)>=0){
                    x = x-1;}
                else{
                    rand = rands.nextInt(8);
                    movepolice2(rand);
                }
              //  System.out.println("4x::"+x+"y::"+y);
                break;
            case (4):
                if((x+1)<xGround){
                    x = x+1;}
                else{
                    rand = rands.nextInt(8);
                    movepolice2(rand);
                }
              //  System.out.println("5x::"+x+"y::"+y);
                break;
            case (5):
                if((x-1)>=0 && (y-1)>=0){
                    x = x-1;
                    y = y-1;}
                else{
                    rand = rands.nextInt(8);
                    movepolice2(rand);
                }
              //  System.out.println("6x::"+x+"y::"+y);
                break;
            case (6):
                if((y-1)>=0){
                    y = y-1;}
                else{
                    rand = rands.nextInt(8);
                    movepolice2(rand);
                }
               // System.out.println("7x::"+x+"y::"+y);
                break;
            case (7):
                if((x+1)<xGround && (y-1)>=0){
                    x = x+1;
                    y = y-1;
                }
                else{
                    rand = rands.nextInt(8);
                    movepolice2(rand);
                }
               // System.out.println("8x::"+x+"y::"+y);
                break;
    }
    }
    public void movePolice1(int rand){
        int xp=0;
        int yp=0;
        int distance = Math.abs(x-thiefInPolice.getXThiefPosition())+ Math.abs(y-thiefInPolice.getYThiefposition());
        switch (rand) {
            case (0):
                if((x-1)>0 && (y+1) < yGround){
                x = x-1;
                y = y+1;
                if(Math.abs(x-thiefInPolice.getXThiefPosition())+ Math.abs(y-thiefInPolice.getYThiefposition())>distance){
                    x = x+1;
                    y = y-1;
                    rand = rands.nextInt(8);
                    movePolice1(rand);
                }
                }
                else{
                    rand = rands.nextInt(8);
                    movepolice2(rand);
                }
               // System.out.println("11x::"+x+"y::"+y);
                break;
            case (1):
                if((y+1)<yGround){
                y = y+1;
                    if(Math.abs(x-thiefInPolice.getXThiefPosition())+ Math.abs(y-thiefInPolice.getYThiefposition())>distance){
                        y=y-1;
                        rand = rands.nextInt(8);
                        movepolice2(rand);
                    }
                }
                else{
                    rand = rands.nextInt(8);
                    movepolice2(rand);
                }
              //  System.out.println("12x::"+x+"y::"+y);
                break;
            case (2):
                if((x+1)<xGround && (y+1)<yGround){
                x = x+1;
                y = y+1;
                    if(Math.abs(x-thiefInPolice.getXThiefPosition())+ Math.abs(y-thiefInPolice.getYThiefposition())>distance){
                        x=x-1;
                        y = y-1;
                        rand = rands.nextInt(8);
                        movepolice2(rand);
                    }
                }
                else{
                    rand = rands.nextInt(8);
                    movepolice2(rand);
                }
              //  System.out.println("13x::"+x+"y::"+y);
                break;
            case (3):
                if((x-1)>=0){
                x = x-1;
                    if(Math.abs(x-thiefInPolice.getXThiefPosition())+ Math.abs(y-thiefInPolice.getYThiefposition())>distance){
                        x=x+1;
                        rand = rands.nextInt(8);
                        movepolice2(rand);
                    }
                }
                else{
                    rand = rands.nextInt(8);
                    movepolice2(rand);
                }
                //System.out.println("14x::"+x+"y::"+y);
                break;
            case (4):
                if((x+1)<xGround){
                x = x+1;
                    if(Math.abs(x-thiefInPolice.getXThiefPosition())+ Math.abs(y-thiefInPolice.getYThiefposition())>distance){
                        x = x-1;
                        rand = rands.nextInt(8);
                        movepolice2(rand);
                    }
                }
                else{
                    rand = rands.nextInt(8);
                    movepolice2(rand);
                }
               // System.out.println("15x::"+x+"y::"+y);
                break;
            case (5):
                if((x-1)>=0 && (y-1)>=0){
                x = x-1;
                y = y-1;
                    if(Math.abs(x-thiefInPolice.getXThiefPosition())+ Math.abs(y-thiefInPolice.getYThiefposition())>distance){
                        x = x+1;
                        y = y+1;
                        rand = rands.nextInt(8);
                        movepolice2(rand);
                    }
                }
                else{
                    rand = rands.nextInt(8);
                    movepolice2(rand);
                }
                //System.out.println("16x::"+x+"y::"+y);
                break;
            case (6):
                if((y-1)>=0){
                y = y-1;
                    if(Math.abs(x-thiefInPolice.getXThiefPosition())+ Math.abs(y-thiefInPolice.getYThiefposition())>distance){
                        y=y+1;
                        rand = rands.nextInt(8);
                        movepolice2(rand);
                    }
                }
                else{
                    rand = rands.nextInt(8);
                    movepolice2(rand);
                }
               // System.out.println("17x::"+x+"y::"+y);
                break;
            case (7):
                if((x+1)<xGround && (y-1)>=0){
                x = x+1;
                y = y-1;
                    if(Math.abs(x-thiefInPolice.getXThiefPosition())+ Math.abs(y-thiefInPolice.getYThiefposition())>distance){
                        x = x-1;
                        y = y+1;
                        rand = rands.nextInt(8);
                        movepolice2(rand);
                    }
                }
                else{
                    rand = rands.nextInt(8);
                    movePolice1(rand);
                }
                //System.out.println("18x::"+x+"y::"+y);
                break;
        }
    }

    }


