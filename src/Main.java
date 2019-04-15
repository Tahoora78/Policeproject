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

        Ground ground  = new Ground(x,y);
        ground.setPoliceNumber(policeNumber);
        ground.thief();
        ground.police();
        ground.display();
        ground.start();
        ground.display();
    }
}
