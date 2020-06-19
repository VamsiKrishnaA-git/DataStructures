public class SelectionSort {
    public int[] implementSelectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int k;
            for(int j=k=i;j<arr.length;j++){
                if(arr[j] < arr[k]){
                    k = j;
                }
            }
            int temp = arr[k];
            arr[k] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public void printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args){
        int[] array = {5,8,4,8,54,1,51};
        SelectionSort obj = new SelectionSort();
        int[] sarray = obj.implementSelectionSort(array);
        obj.printArr(sarray);
    }
}
