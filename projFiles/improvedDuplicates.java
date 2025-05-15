import java.util.*;

public class improvedDuplicates {

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
        Set<Integer> set = new HashSet<>();
        //add nums to set
        for(int num : nums) {
            //check if duplicate exists and if list already contains duplicate to prevent duplicate outputs
            if(set.contains(num) && !result.contains(num)) {
                result.add(num);
            }
            set.add(num);
        }
        return result;
    }
}
