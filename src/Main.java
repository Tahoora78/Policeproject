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

        int randomChoose = 0;
        int xp;
        int yp;
        while(finish!=1){
            randomChoose = rand.nextInt(9);
            thief.moveThief(randomChoose);
            for(police g:polices) {
                randomChoose = rand.nextInt(9);
                g.movePolice(randomChoose);
                if(g.getXPolicePosition()-thief.getXThiefPosition()<=2){

                }
            }


        }


}}
