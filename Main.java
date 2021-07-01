import java.security.SecureRandom;

// Author @ogeday

public class Main {

    private static final int RunLimit = 10000;

    public static void main(String[] args) {
	// write your code here
        SecureRandom rand = new SecureRandom();
        int i;
        double x,y, distance;
        double pi = 0;
        int hitCount = 0;
        int throwCount = 0;

        for (i = 0; i < (RunLimit * RunLimit); i++) {

            x = (rand.nextDouble());
            y = (rand.nextDouble());

            System.out.println("x ="+ x);
            System.out.println("y ="+ y);

            distance = Math.sqrt(x * x + y * y);

            System.out.println("distance ="+ distance);

            if (distance <= 1){
                hitCount++;
            }

            throwCount++;
            System.out.println("Hits:" + hitCount);
            System.out.println("Total throws:" + throwCount);


            pi = (4.0 * hitCount) / throwCount;

            //Estimated Value
            System.out.println("Pi =" + pi); ;
        }

        System.out.println("Final Estimated Value of Pi =" + pi); ;

    }
}
