import java.util.*; 
public class treeset {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Set<Integer> myset = new HashSet<Integer>();
        //String str = sc.next();
        // char []strArr = str.toCharArray();
        for (int i = 0; i < 5; i++) {
              myset.add(sc.nextInt());
        }
        System.out.println(myset);
        TreeSet<Integer> sortedSet = new TreeSet<Integer>(myset);
         System.out.println(sortedSet);

    }
}
