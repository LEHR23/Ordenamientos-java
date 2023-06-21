package ordenamientos;

import java.util.Random;

public class Main {
    
    public static void main(String[] args) {
        Random r = new Random();
        int []arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = (int)(r.nextDouble()*100);
        }
        Ordenamientos o = new Ordenamientos();
        for (int i = 0; i < 10; i++) {
            System.out.print("["+arr[i]+"]");
        }
        System.out.println("");
//        o.burbuja(arr);
//        o.shell(arr);
//        o.quicksort(arr);
        o.heapsort(arr);
        for (int i = 0; i < 10; i++) {
            System.out.print("["+arr[i]+"]");
        }
        System.out.println("");
        Busquedas b = new Busquedas();
        int res;
//        res = b.busquedaSecuencial(23, arr);
        res = b.busquedaBinaria(55, arr);
        System.out.println(res);
    }
    
}
