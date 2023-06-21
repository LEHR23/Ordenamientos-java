package ordenamientos;

public class Busquedas {
    
    public Busquedas(){
        
    }
    
    public int busquedaSecuencial(int valor, int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == valor){
                return i;
            }
        }
        return -1;
    }
    
    public int busquedaBinaria(int valor, int[] arr){
        int inicio = 0;
        int fin = arr.length-1;
        int pos;
        while(inicio<fin){
            pos = (fin-inicio)/2+inicio;
            if(arr[pos] == valor){
                return pos;
            }
            if(pos == inicio || pos == fin){
                break;
            }
            if(arr[pos]<valor){
                inicio = pos;
            }else{
                fin = pos;
            }
        }
        return -1;
    }
    
}
