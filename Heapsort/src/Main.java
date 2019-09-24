
import java.util.Random;

public class Main {

    public static void main (String[] args){
       int [] numeros = new int[20];
       Random random = new random();

       for (int i = 0; i < numeros.length; i++){
           numeros[i] = Math.abs(random.nextInt()) % 100;
       }

       Sorter sorter = new Sorter();
       sort.heapSort(numeros);

       for (int i = 0; i < numeros.length; i++){
           System.out.println();

       }
   }
}
