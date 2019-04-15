import java.util.*;
public class police {
    private int x;
    private int y;
    private String seen;
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

}
