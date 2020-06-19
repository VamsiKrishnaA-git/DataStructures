public class InsertionSort {
    public int[] ImplementInsertionSort(int[] arr){
        for(int j=1;j<arr.length;j++){
            int key = arr[j];
            int i = j-1;
            while(i>=0 && arr[i]>key){
                arr[i+1] = arr[i];
                i -= 1;
            }
            arr[i+1] = key;
        }
        return arr;
    }

    public void printArr(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args){
        int[] array = {0,5,6,9,4,3};
        InsertionSort obj = new InsertionSort();
        int[] sarray = obj.ImplementInsertionSort(array);
        obj.printArr(sarray);

    }
}
