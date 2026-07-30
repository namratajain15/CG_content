public class sortZeroOneTwoArray {

    //time complexity = O(n)
    public static void main(String[] args) {

        int[] arr = {1,0,2,1,0,1,0,1,0,2};

        int zero,one,two;
        zero=one=two=0;

        for (int i : arr) {
            if(i==0)
                zero++;
            else if (i==1)
                one++;
            else 
                two++;
        }
        int c = 0;

        for (int i = 0; i < zero ; i++) {
            arr[i] = 0;
            c++;
        }
        for (int i = c; i < zero+one ; i++) {
            arr[i] = 1;
            c++;
        }

        for (int i = c; i < arr.length ; i++) {
            arr[i] = 2;
        }

        for (int i : arr) {
            System.out.println(i);
        }

    }
}
