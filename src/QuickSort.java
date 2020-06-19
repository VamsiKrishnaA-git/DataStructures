public class QuickSort {
    public int partition(int[] arr,int start,int end){
        int x = arr[end];
        int i = start-1;
        for(int j=start;j<=end-1;j++){
            if(arr[j]<=x){
                i += 1;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        arr[end] = arr[i+1];
        arr[i+1] = x;
        return i+1;
    }

    public int[] implementQuickSort(int[] arr,int start,int end){
        if(start < end){
            int q = partition(arr,start,end);
            implementQuickSort(arr,start,q-1);
            implementQuickSort(arr,q+1,end);
        }
        return arr;

    }

    public void printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args){
        int[] array ={1,2,3,3,4,5,7,7,9,2};
        QuickSort obj = new QuickSort();
        int n = array.length;
        int[] sarray = obj.implementQuickSort(array,0,n-1);
        obj.printArr(sarray);
    }
}
