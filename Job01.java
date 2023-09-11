import java.util.TimerTask;
import java.util.Date;
public class Job01 {
    public static void main(String args[])
    {
        System.out.println("Salut du thread!");
        for (int i = 0; i <4; i++)

        try {
            Thread.sleep(1000);
            System.out.println("Salut du thread!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }


}
