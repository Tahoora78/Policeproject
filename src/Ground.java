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
     //   System.out.println("x+"+randomX+"+y:"+randomY);
       // System.out.println("1x:"+thief.getXThiefPosition()+"y:"+thief.getYThiefposition());
     thief.setxGround(xGround);
     thief.setyGround(yGround);
     thief.setThiefPosition(randomX,randomY);
     for(police t: polices){
         while(randomX == t.getXPolicePosition() && randomY == t.getYPoliceposition()){
           //  System.out.println("xx:"+t.getXPolicePosition()+"yy:"+t.getYPoliceposition());
             randomX = rand.nextInt(xGround );
             randomY = rand.nextInt(yGround);
             thief.setThiefPosition(randomX,randomY);
         //    System.out.println("************************");
         }
     }
       // System.out.println("2x:"+thief.getXThiefPosition()+"y:"+thief.getYThiefposition());
     //thief.setThiefPosition(randomX,randomY);
     for(police h:polices){
         h.thiefInPolice.setThiefPosition(thief.getXThiefPosition(),thief.getYThiefposition());
     }

    }

    public void police() {
        int y = policeNumber;
       // System.out.println("number of police"+y);
        polices = new ArrayList<police>();
        police g=null;
        for (int i = 0; i < y; i++) {
            int randomX = rand.nextInt(xGround);
           // System.out.println("randomx"+randomX);
            int randomY = rand.nextInt(y);
            //System.out.println("randomy"+randomY);
            System.out.println("i"+i);
             g = new police(randomX,randomY);
            polices.add(g);
        }
    }

    public void display(){
        int print =0;
        int time=0;
        for(police g:polices){
            g.setPrint("no");
        }
        for(police g:polices){
          //  System.out.println("$x:"+g.getXPolicePosition()+"y:"+g.getYPoliceposition());
        }
        //System.out.println("dx:"+thief.getXThiefPosition()+"dy:"+thief.getYThiefposition());
        for(int j=0;j<yGround;j++){
            for(int i=0;i<xGround;i++){
                for(police o:polices){
                    if(o.getXPolicePosition()==i && o.getYPoliceposition()==j && o.getPrint().equals("no")){
              //          if(time==0){
                    System.out.print("P");
                            print++;
        //                }
                //        time++;
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
            time=0;
            System.out.println();
        }
        System.out.println("_________________________________________");
    }

    public void start(){
    int randomChoose = 0;
    int xp;
    int yp;
    int whichMove=0;
    int finish=0;
        while(finish!=1) {
            randomChoose = rand.nextInt(8);
            //System.out.println("randomchoose"+randomChoose);
            thief.moveThief(randomChoose);
            for(police f:polices){
                f.setGroundPosition(xGround,yGround);
                f.thiefInPolice.setThiefPosition(thief.getXThiefPosition(),thief.getYThiefposition());
            }

            for(police h:polices){
                if(h.getXPolicePosition()==thief.getXThiefPosition() && h.getYPoliceposition()==thief.getYThiefposition()){
             //       System.out.println("finish");
                    finish = 1;
                    break;
                }
            }
            if(finish==1){
                break;
            }
            for (police g : polices) {
                randomChoose = rand.nextInt(8);
                if (g.getXPolicePosition() - thief.getXThiefPosition() <= 2 ){
                    whichMove ++;
               //     System.out.println("lLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL");
                }

                if(whichMove!=0){
                 //   System.out.println("2222222222222222222222222");
                    g.movepolice2(randomChoose);
                }
                if(whichMove==0){
                   // System.out.println("1111111111111111111111");
                    g.movePolice1(randomChoose);
                }
                //display();
              //  System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
            if(g.getXPolicePosition()==thief.getXThiefPosition() && g.getYPoliceposition()==thief.getYThiefposition() || (thief.getXThiefPosition()== g.getXPolicePosition() && thief.getYThiefposition()==g.getYPoliceposition())){
            finish = 1;
            break;
            }
            }
            if(finish==1){
                break;
            }
            display();

            //finish = 1;
        }

    }



}
