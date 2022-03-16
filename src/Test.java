import java.util.Scanner;

public class Test {


    public static void main(String[] args) {
        System.out.println("Donnez le nombre de Threads :");
        Scanner scanner=new Scanner(System.in);
        int nbThreads=scanner.nextInt();
        ListeEntiers liste=new ListeEntiers();

        Thread threads[]= new Thread[nbThreads];
        System.out.println("*** Création des Threads ***");
        for (int i = 0; i < threads.length; i++) {
            threads[i]=new MonThread(liste,i);
        }
        System.out.println("Lancement des threads");
        for (int i = 0; i < threads.length; i++) {
            threads[i].start();
        }
        System.out.println(liste);
        System.out.println("C'est terminé !!!"); }
}
