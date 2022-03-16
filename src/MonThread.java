import java.util.Date;
import java.util.Random;

public class MonThread extends Thread {

    static final int n=1000;
    private ListeEntiers liste;
    private Random generateurAleatoire=new Random(new Date().getTime());
    private int num;

    public MonThread(ListeEntiers liste, int num){
        this.liste=liste;
        this.num=num;
    }
    public void run() {
        System.out.println("Thread numéro :"+num+" commence");
        int tab[]= liste.getValeurs();
        int i1,i2,temp;
        for (int i = 0; i < 1000; i++) {
            i1=generateurAleatoire.nextInt(tab.length);
            i2=generateurAleatoire.nextInt(tab.length);
            liste.echanger(i1,i2);
        }
        System.out.println(liste);
        System.out.println("Thread numéro :"+num+" terminé");
    }
}

