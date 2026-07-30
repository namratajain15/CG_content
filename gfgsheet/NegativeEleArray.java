public class NegativeEleArray {

    //time complexity = O(n)

    public static void main(String[] args) {
        int[] arr = {-12,34,-15,90,88,-10,-17,70,-55,55,0};

        int temp;
        int count = 0 ;

       for(int i = 0 ; i< arr.length; i++){
           if(arr[i]<0){
                temp = arr[i];
                arr[i] = arr[count];
                arr[count++] = temp;
            }
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
