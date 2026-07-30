public class LC_ShuffleString {
    class Solution {
        public String restoreString(String s, int[] indices) {
            char[] ch = s.toCharArray();
            char[] arr = new char[indices.length];

            int j=0;
            for(int i=0 ;i<indices.length;i++)
            {
                arr[indices[i]] = ch[j];
                j++;
            }
            return String.valueOf(arr);

        }
    }
}
