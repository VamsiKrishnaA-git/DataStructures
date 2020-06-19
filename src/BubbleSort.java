public class BubbleSort {
    public int[] bubbleSortarr(int[] arr){
        for(int i=0;i<arr.length;i++){
            int swapped = 0;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;

                    swapped = 1;
                }
            }
            if(swapped == 0)
                return arr;
        }
        return arr;
    }

    public void printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args){
        int[] sarr = {10,5,25,02,12,54,544,45,4,544,484,1,0,55,584,55};
        BubbleSort obj = new BubbleSort();
        int[] array = obj.bubbleSortarr(sarr);
        obj.printArr(array);
    }
}
