public class HeapSort {
    public void max_Heapify(int[] arr,int i) {
        int left = (2 * i) + 1;
        int right = (2 * i) + 2;
        int largest;
        if (left < arr.length && arr[left] > arr[i]) {
            largest = left;
        }
        else
            largest = i;
        if(right < arr.length && arr[right] > arr[largest]){
            largest = right;
        }
        if(largest != i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            max_Heapify(arr,largest);
        }
    }

    public void min_Heapify(int[] arr,int i) {
        int left = (2 * i) + 1;
        int right = (2 * i) + 2;
        int smallest;
        if (left < arr.length && arr[left] < arr[i]) {
            smallest = left;
        }
        else
            smallest = i;
        if(right < arr.length && arr[right] < arr[smallest]){
            smallest = right;
        }
        if(smallest != i){
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
            min_Heapify(arr,smallest);
        }
    }

    public void build_max_Heap(int[] arr){
        for(int i=(arr.length-1)/2; i>=0 ;i--){
            max_Heapify(arr,i);
        }
    }

    public void build_min_Heap(int[] arr){
        for(int i=(arr.length-1)/2; i>=0 ;i--){
            min_Heapify(arr,i);
        }
    }

    public void printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args){
        int[] arr1 = {10,20,33,45,51};
        HeapSort obj = new HeapSort();
        obj.build_max_Heap(arr1);
        obj.printArr(arr1);
        System.out.println("---Min Heap---");
        obj.build_min_Heap(arr1);
        obj.printArr(arr1);

    }
}
