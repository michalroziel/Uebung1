import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class CatTestDrive {
    public static void main(String[] args) {
        // Press Cmd+1 with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        Cat catto = new Cat(9000.0, true, false, "Orange", "Garfield",5,100);


        /*catto.fressen(100.0);
        catto.setAktiv(true);
        catto.runMiau(1000);

        catto.fallAsleep();

        catto.printInformation();*/

        Cat[] cats = new Cat[10];

        Random rand = new Random();


        // generation of random name :



            byte[] array = new byte[7] ;

            rand.nextBytes(array);

            String generetead_string  = new String(array , StandardCharsets.US_ASCII);

            System.out.println(generetead_string);







        for (int i = 0; i < 10; i++) {

            double randweight = rand.nextDouble(0.0, 2000.0);     // generate  cat weight
            int randd = rand.nextInt(1, 100);
            boolean randhunger = rand.nextBoolean();                       // generate  hunger var

            boolean randaktiv = rand.nextBoolean() ;                        // generaste active var





            Cat test = new Cat(randweight,randhunger,randaktiv,"blue","Test" +i,randd,100);

            cats[i] = test;

        }

        double gesamtGEW = 0.0;


        for (int j = 0; j < 10; j++) {


            gesamtGEW += cats[j].getGewicht();

        }




        battle(cats[1],cats[2]);
        System.out.println("\n\n\n");
        battle(cats[1],cats[2]);
        System.out.println("\n\n\n");
        battle(cats[1],cats[2]);



    }
    public static void battle(Cat pCat1, Cat pCat2) {
        if (pCat1.getHealth() > 0 && pCat2.getHealth() > 0) {
            int damage1 = pCat1.getDamage();
            int damage2 = pCat2.getDamage();

            if (pCat1.isSuperSayin()) {
                damage1 *= 2;
            }
            if (pCat2.isSuperSayin()) {
                damage2 *= 2;
            }

            pCat1.setHealth(pCat1.getHealth() - damage2);
            pCat2.setHealth(pCat2.getHealth() - damage1);
            System.out.println("The Battle is over..." + pCat1.getName() + " sits on " + pCat2.getName());
            pCat1.printInformation();
            pCat2.printInformation();
        }else{

            System.out.println("One or both off the catts is/are sleepy");
        }
    }
}