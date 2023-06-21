package ordenamientos;

public class Ordenamientos {

    public Ordenamientos() {

    }

    public int[] burbuja(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int aux = arr[i];
                    arr[i] = arr[j];
                    arr[j] = aux;
                }
            }
        }
        return arr;
    }

    public int[] shell(int[] arr) {
        int movimiento;
        int salto = arr.length;
        int aux;
        while (salto > 1) {
            movimiento = 1;
            salto = salto / 2;
            while (movimiento != 0) {
                movimiento = 0;
                for (int i = 0; i + salto < arr.length; i++) {
                    if (arr[i] > arr[i + salto]) {
                        aux = arr[i];
                        arr[i] = arr[i + salto];
                        arr[i + salto] = aux;
                        movimiento++;
                    }
                }
            }
        }
        return arr;
    }

    public int[] quicksort(int[] arr) {
        return quicksort(arr, 0, arr.length - 1);
    }

    private int[] quicksort(int[] arr, int inicio, int fin) {
        int pivote = arr[(fin - inicio) / 2 + inicio];
        int auxfin = fin;
        int auxinicio = inicio;
        while (auxinicio < auxfin) {
            while (arr[auxinicio] < pivote) {
                auxinicio++;
            }
            while (arr[auxfin] > pivote) {
                auxfin--;
            }
            if (auxinicio <= auxfin) {
                int aux = arr[auxinicio];
                arr[auxinicio] = arr[auxfin];
                arr[auxfin] = aux;
                auxfin--;
                auxinicio++;
            }
        }
        if (inicio < auxfin) {
            quicksort(arr, inicio, auxfin);
        }
        if (auxinicio < fin) {
            quicksort(arr, auxinicio, fin);
        }
        return arr;
    }

    public int[] heapsort(int[] arr) {  //orddenamientoHeapsort(int[] listaDesordenada )
        int size = arr.length-1;
        int pospadre;
        int posizq, posder;
        int aux;
        while(size > 0){
            size--;
            pospadre = size/2;
            while(pospadre > -1){
            posizq = pospadre*2+1;
            posder = pospadre*2+2;
                if(posder <= size+1){
                    if(arr[posder]<arr[posizq]){
                        if(arr[posizq]> arr[pospadre]){
                            aux = arr[posizq];
                            arr[posizq] = arr[pospadre];
                            arr[pospadre] = aux;
                        }
                    }else{
                        if(arr[posder]> arr[pospadre]){
                            aux = arr[posder];
                            arr[posder] = arr[pospadre];
                            arr[pospadre] = aux;
                        }
                    }
                }else{
                    if(arr[posizq]> arr[pospadre]){
                            aux = arr[posizq];
                            arr[posizq] = arr[pospadre];
                            arr[pospadre] = aux;
                        }
                }
                pospadre--;
            }
            aux = arr[0];
            arr[0] = arr[size+1];
            arr[size+1] = aux;
        }
        return arr;
    }
}
