import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DiffOfTwoArrays {
    public static void main(String[] args) {
    int[] a1={1,2,3,3};
    int[] a2={1,1,2,2};
        System.out.println(findDifference(a1,a2));
    }
    static public List<List<Integer>> findDifference(int[] nums1, int[] nums2){
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        List<List<Integer>> list1 = new ArrayList<List<Integer>>(2);
        list1.add(new ArrayList<>());
        list1.add(new ArrayList<>());
        for (int j : nums1) {
            s1.add(j);
        }
        for (int j : nums2) {
            s2.add(j);
        }
        for (int num : s1) {
            if (!s2.contains(num)) {
                list1.get(0).add(num);
            }
        }
        for (int num : s2) {
            if (!s1.contains(num)) {
                list1.get(1).add(num);
            }
        }
        return list1;
    }

    static public List<List<Integer>> findDifference2(int[] nums1, int[] nums2) {
        // this solution is not handling the repetitions
        List<List<Integer>> list1 = new ArrayList<List<Integer>>(2);
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            boolean flag=false;
            for (int j = 0; j < nums2.length; j++) {
                if(nums1[i]==nums2[j]){
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                l1.add(nums1[i]);
            }
        }
        list1.add(l1);
        for (int i = 0; i < nums2.length; i++) {
            boolean flag=false;
            for (int j = 0; j < nums1.length; j++) {
                if(nums2[i]==nums1[j]){
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                l2.add(nums2[i]);
            }
        }
        list1.add(l2);
        return list1;
    }
}
