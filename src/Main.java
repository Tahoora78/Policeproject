import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System .in);
        Random rand = new Random();

        int finish=0;
        int randomX=0;
        int randomY=0;
        int x = input.nextInt();
        int y = input.nextInt();
        int policeNumber = input.nextInt();
        police[] polices = new police[policeNumber+1];
//ground
        Ground ground  = new Ground();
        ground.setGroundx(x);
        ground.setGroundY(y);
//thief
        randomX = rand.nextInt(x+1);
        randomY = rand.nextInt(y+1);
        Thief thief = new Thief(randomX,randomY);
//police
        for(int i=0;i<policeNumber;i++){
            randomX = rand.nextInt(x+1);
       //     System.out.println("randomx"+randomX);
            randomY = rand.nextInt(y+1);
           // System.out.println("randomy"+randomY);
            polices[i] = new police();
            polices[i].setxPolicePosition(randomX,randomY);
        }

        int randomChoose=0;
        int xp;
        int yp;
        while(finish!=1){
            for(police g:polices) {
                randomChoose = rand.nextInt(9);
                switch (randomChoose) {
                    case (1):
                        xp = g.getXPolicePosition();
                        yp = g.getYPoliceposition();
                        g.setxPolicePosition(xp-1,yp+1);
                        break;
                    case (2):
                        xp = g.getXPolicePosition();
                        yp = g.getYPoliceposition();
                        g.setxPolicePosition(xp,yp+1);
                        break;
                    case (3):
                        xp = g.getXPolicePosition();
                        yp = g.getYPoliceposition();
                        g.setxPolicePosition(xp+1,yp+1);
                        break;
                    case (4):
                        xp = g.getXPolicePosition();
                        yp = g.getYPoliceposition();
                        g.setxPolicePosition(xp-1,yp);
                        break;
                    case (5):

                        break;
                    case (6):
                        break;
                    case (7):
                        break;
                    case (8):
                        break;
                }
            }
        }

    }
}
