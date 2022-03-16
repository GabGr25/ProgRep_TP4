import java.util.Arrays;

public class ListeEntiers {


    private int valeurs[];

    public ListeEntiers(){
        this.valeurs=new int[20];
        for (int i = 0; i < valeurs.length; i++) {
            valeurs[i]=i;
        }
    }

    public int[] getValeurs(){
        return valeurs;
    }

    @Override
    public String toString() {
        return  Arrays.toString(valeurs) ;

    }

    synchronized public void echanger(int i1, int i2){
        int temp=valeurs[i1];
        valeurs[i1]=valeurs[i2];
        valeurs[i2]=temp;
    }

    public static void main(String[] args) {
        ListeEntiers liste=new ListeEntiers();
        System.out.println(liste);
    }
}
