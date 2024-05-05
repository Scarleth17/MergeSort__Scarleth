public class App {

    private static final int left = 0;
    public static void mergesort(int[] arr, int left, int right){
       
        if (left < right){
            //Encuentra el punto medio del arreglo
            int mid = (left + right) / 2;
            //Ordena recursivamente la mitad izquierda
            mergesort(arr, left, mid);
            //Ordena recursivamente la mitad derecha
            mergesort(arr, mid + 1, right);

            //Combina las dos mitades ordenadas
            merge(arr, left, mid, right);
        }
     }

     private static void merge(int[] arr, int left, int mid, int right){
        //Tamaños de los subarreglos a fusionar
        int sizeleft = mid - left + 1;
        int sizeright = right - mid;

        //Arreglos temporales para almacenar los subarreglos
        int[] tempLeft = new int[sizeleft];
        int[] tempright = new int[sizeright];

        //Copia datos a los arreglos temporales
        for(int i = 0; i < sizeleft; i++){
            tempLeft[i] = arr[left + i];
        }
        for(int j = 0; j < sizeright; j++){
            tempright[j] = arr[mid + 1 + j];
        }

        //fusiona los subarreglos temporales en el arreglo original
        int i = 0; 
        int j = 0;
        int k = left; //indice inicial para el arreglo fucionado

        while (i < sizeleft && j < sizeright) {
            if (tempLeft[i] <= tempright[j]) {
                arr[k] = tempLeft[i];
                i++;
            } else {
                arr[k] = tempright[j];
                j++;
                
            }
            k++;
            
        }

        //Copia elementos restantes de temleft[] si los hay
        while (i < sizeleft) {
            arr[k] = tempLeft[i];
            i++;
            k++;
            
        }

        //copia elementos restantes de tempright[] si los hay
        while (j < sizeright) {
            arr[k] = tempright[j];
            j++;
            k++;
            
        }


    }
    public static void main(String[] args) throws Exception {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        int n = arr.length;

        mergesort(arr, left, n - 1); //Llamada al metodo de ordenamiento MergeSort

        System.out.println("Arreglo ordenado:");
        for (int num: arr){
            System.out.println(num + " ");
        }
    }
}
     
     //Nombre: Scarleth Julissa Vindel Sequeira  
    // Carnet: 2024-1643U

