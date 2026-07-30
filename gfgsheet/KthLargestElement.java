import java.util.Arrays;

public class KthLargestElement {
    public static void main(String[] args) {                //o(nlogn)
        int[] arr = {3, 2, 1, 5, 6, 4};
        int k = 2;
        System.out.println(k + "th Largest Element: " + findKthLargest(arr, k));
    }

    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums); // Sorts in ascending order
        return nums[nums.length - k]; // Kth largest element
    }
}

//--------------------using min heap-------  //O(nlogk) and O(k)

//import java.util.PriorityQueue;
//
//public class KthLargestElementMinHeap {
//    public static void main(String[] args) {
//        int[] arr = {3, 2, 1, 5, 6, 4};
//        int k = 2;
//        System.out.println(k + "th Largest Element: " + findKthLargest(arr, k));
//    }
//
//    public static int findKthLargest(int[] nums, int k) {
//        PriorityQueue<Integer> minHeap = new PriorityQueue<>(); // Min Heap
//
//        for (int num : nums) {
//            minHeap.add(num);
//            if (minHeap.size() > k) {
//                minHeap.poll(); // Remove smallest element
//            }
//        }
//        return minHeap.peek(); // Kth largest element
//    }
//}

