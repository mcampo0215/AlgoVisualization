import java.util.*;

public class bruteDuplicates {

    public static void main(String[] args) {
        //test cases
        int[] test1 = {1, 3, 5, 3, 1, 7, 8, 8, 1, 1}; //return 1 3 and 8
        int[] test2 = {1, 1, 1}; //return 1
        int[] test3 = {}; //return empty
        List<Integer> case1 = findDuplicates(test1);
        List<Integer> case2 = findDuplicates(test2);
        List<Integer> case3 = findDuplicates(test3);
        //print test cases
        System.out.println(case1);
        System.out.println(case2);
        System.out.println(case3);
    }

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        //compare elements
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                //add duplicate if elements are the same and prevents duplicates in output
                if(nums[i] == nums[j] && !result.contains(nums[i])) {
                    result.add(nums[i]);
                }
            }
        }
        return result;
    }
}
