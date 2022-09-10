import java.util.Arrays;
import java.util.HashSet;

import javax.lang.model.type.IntersectionType;

import java.util.*;
public class hashset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> a = new HashSet<Integer>();
        Set<Integer> b = new HashSet<Integer>();
        
        a.addAll(Arrays.asList(new Integer[] {1,4,6,3,7,3,}));
        b.addAll(Arrays.asList(new Integer[]{5,3,8,9,0,2,1,4}));

        Set<Integer>  union = new HashSet<Integer>(a);
        union.addAll(b);
        System.out.println("Union of both sets are : "+union);

        Set<Integer> intersection = new HashSet<Integer>(a);
        intersection.retainAll(b);
        System.out.println("Intersection of both sets are : "+intersection);

        Set<Integer>difference = new HashSet<Integer>();
        difference.removeAll(b);
        System.out.println("Difference of sets are : "+difference);

    }
}
