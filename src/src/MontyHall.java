import java.util.Random;

public class MontyHall {
    public static void main(String[] args) {

        int switchWIns = 0;
        int stayWins = 0;
        //File file = new File(args[0]);
        for(int i = 0;i<20000;i++) {
            int [] hats = new int[3];
            Random rand = new Random();
            int prize = rand.nextInt(3);
            int mypick = rand.nextInt(3);

            int opendoor = rand.nextInt(3);
            while(opendoor==mypick || opendoor== prize) {
                opendoor = rand.nextInt(3);
            }

            if(prize == mypick) {
                stayWins+=1;
            }

            hats[prize] = 1;
            switchWIns+= hats[3-mypick-opendoor];

        }

        System.out.println(stayWins);
        System.out.println(switchWIns);



    }



}
