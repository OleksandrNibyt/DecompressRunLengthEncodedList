import java.util.ArrayList;
import java.util.List;

class Solution {
    public static int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<nums.length;i+=2){
            while(nums[i-1]!=0){
                list.add(nums[i]);
                nums[i-1]--;
            }
        }
        int[] result = new int[list.size()];
        for(int i=0;i<result.length;i++){
            result[i]=list.get(i);
        }
        return result;
    }
}

public class DecompressRunLengthEncodedList {

    public static void main(String[] args) {
        int[] input = {1,2,3,4};
        int[] result = Solution.decompressRLElist(input);
        System.out.println(String.valueOf(result));
    }


}
