import java.util.*;

public class optimizedDuplicates {

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
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int num : nums) {
            if(set1.contains(num)) {
                set2.add(num); //set automatically removes duplicates for you
            }
            set1.add(num);
        }
        List<Integer> result = new ArrayList<>(set2); //returns set as list
        return result;
    }
}
