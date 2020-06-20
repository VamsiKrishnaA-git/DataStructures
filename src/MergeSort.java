public class MergeSort {
    public int[] implementMergeSort(int[] arr,int start,int end){
        if(start < end) {
            int q = (start + end) / 2;

            implementMergeSort(arr, start, q);
            implementMergeSort(arr, q + 1, end);
            merge(arr,start,q,end);
        }
        return arr;
    }

    public void merge(int[] arr,int start,int q,int end){
        int[] Left = new int[q-start+2];
        int[] Right = new int[end-q+1];

        for(int i=0;i<Left.length-1;i++){
           // System.out.println(arr[start+i]);
            Left[i] = arr[start + i];
        }

        for(int j=0;j<Right.length-1;j++){
           // System.out.println(arr[q+1+j]);
            Right[j] = arr[q+j+1];
        }

        Left[Left.length-1] = Integer.MAX_VALUE;
        Right[Right.length-1] =  Integer.MAX_VALUE;
        int i = 0;
        int j = 0;
        for(int k=start;k<=end;k++){
            if(Left[i]<Right[j]){
                arr[k] = Left[i];
                i++;
            }
            else{
                arr[k] = Right[j];
                j++;
            }
        }

    }

    public void printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args){
        int[] array = {7005,2,25,1,54,5,75,74,4};
        MergeSort obj = new MergeSort();
        int[] sarray = obj.implementMergeSort(array,0,array.length-1);
        obj.printArr(sarray);
    }
}
