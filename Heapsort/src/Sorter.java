

public class Sorter {

    public void heapSort (int[] numeros) {
     // Transformar o array em max heap
        for (int i = numeros.length / 2; i >= 0; i--){
         heapfyDown(numeros, i, numeros.length);
     }
        //numeros viraram max heap
        for (int i = numeros.length -1; i > 0; i--){
            int tmp    = numeros[0];
            numeros[0] = numeros[i];
            numeros[i] = tmp;
            heapfyDown(numeros,0, i);

        }
 }

    private void heapfyDown(int[] numeros, int index, int length) {
        int leftChild = 2*index + 1;
        int rightChild = 2*index + 2;

        int maxIndex = index;

        if (leftChild < length && numeros[leftChild] > numeros[index]){
            maxChild = leftChild;
        }
        if (rightChild < length && numeros[rightChild] > numeros[maxIndex]) {
            maxChild = rightChild;
        }
        if(maxIndex != index){
            int tmp = numeros [maxIndex];
            numeros[maxIndex] = numeros[index];
            numeros[index]    = tmp;
            heapfyDown(numeros,maxIndex, length);
        }

    }
}
