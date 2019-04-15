import java.util.ArrayList;
import java.util.Random;

public class Ground {

    private int xGround;
    private int yGround;
    public int policeNumber = 0;

    ArrayList<police> polices ;
    //police[] polices = new police[policeNumber + 1];
    Thief thief = new Thief(0,0);

    public void setPoliceNumber(int number) {
        policeNumber = number;
    }

    public Ground(int xd, int yd) {
        xGround = xd;
        yGround = yd;
    }

    public int getX() {
        return xGround;
    }

    public int getY() {
        return yGround;
    }

    Random rand = new Random();

    public void thief(){
    int randomX = rand.nextInt(xGround );
    int randomY = rand.nextInt(yGround);
        System.out.println("x:"+randomX+"y:"+randomY);
     thief.setxGround(randomX);
     thief.setyGround(randomY);
    }

    public void police() {
        int y = policeNumber;
        System.out.println("y"+y);
        polices = new ArrayList<police>();
        for (int i = 0; i < y; i++) {
            int randomX = rand.nextInt(xGround);
            System.out.println("randomx"+randomX);
            int randomY = rand.nextInt(y);
            System.out.println("randomy"+randomY);
            System.out.println("i"+i);
            police g = new police(randomX,randomY);
            polices.add(g);
        }
    }

    public void display(){
        int print =0;
        for(police g:polices){
            g.setPrint("no");
        }

        for(int j=0;j<yGround;j++){
            for(int i=0;i<xGround;i++){
                for(police o:polices){
                    if(o.getXPolicePosition()==i && o.getYPoliceposition()==j && o.getPrint().equals("no")){
                        System.out.print("P");
                        print++;
                        o.setPrint("yes");
                        break;
                    }
                }
                if(thief.getXThiefPosition()==i && thief.getYThiefposition()==j){
                    System.out.print("D");
                    print++;
                }
                if(print==0){
                    System.out.print("-");
                }
                print = 0;
            }
            System.out.println();
        }
    }

    public void start(){
    int randomChoose = 0;
    int xp;
    int yp;
    int finish=0;
        while(finish!=1) {
            randomChoose = rand.nextInt(9);
            System.out.println("randomchoose"+randomChoose);
            thief.moveThief(randomChoose);
            for (police g : polices) {
                randomChoose = rand.nextInt(9);
                if (g.getXPolicePosition() - thief.getXThiefPosition() <= 2) {

                }
                g.movePolice(randomChoose);
            }
            finish = 1;
        }

    }



}
