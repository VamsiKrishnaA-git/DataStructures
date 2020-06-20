//import QuickSort.java;
public class BinarySearch {
    public int implementBinarySearch(int[] arr,int low,int high, int target){
        //int mid = low+(high - low)/2;
        while(low <= high){
            int mid = low+(high - low)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
                high = mid - 1;
            }
            else
                low = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args){
        int[] array = {5,4,12,75,15,41,96,45,111,41,2};
        BinarySearch obj = new BinarySearch();
        QuickSort obj1 = new QuickSort();
        int n = array.length-1;
        int[] sarray = obj1.implementQuickSort(array,0,n);
        System.out.println(obj.implementBinarySearch(sarray,0,n,111));

    }
}
