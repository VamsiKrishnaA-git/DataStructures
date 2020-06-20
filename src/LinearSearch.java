public class LinearSearch {
    public int implementLinearSearch(int[] arr,int target){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] array = {5,4,7,1,8,41,45,17,1,545,45};
        LinearSearch obj = new LinearSearch();
        System.out.println(obj.implementLinearSearch(array,545));
        System.out.println(obj.implementLinearSearch(array,555554));
    }
}
