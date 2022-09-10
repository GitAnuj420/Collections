import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

import javax.sound.sampled.SourceDataLine;
class list{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<String> arrLis = new ArrayList<String>();
        LinkedList<Integer> LiLiist = new LinkedList<Integer>();

        /* arrLis.add("Anuj");
        arrLis.add("Gaurav");
        arrLis.add("MK");
        arrLis.add("Ajay");
        arrLis.add("Anuj");
        System.out.println(arrLis);
        arrLis.remove("Anuj");
        arrLis.remove("Ajay");
        arrLis.remove("MK");
        arrLis.remove("Gaurav");
        if(arrLis.isEmpty())
        {
            System.out.println("List is empty...");
        }else{
            System.out.println(arrLis);
        } */
        /* LiLiist.add(9);
        LiLiist.add(9);
        LiLiist.add(2);
        LiLiist.add(7);
        LiLiist.add(8);
        LiLiist.add(1);
        LiLiist.add(0);
        LiLiist.add(4);
        System.out.println(LiLiist);
        Iterator itr = LiLiist.iterator();
        
        Collections.sort(LiLiist);
        System.out.println(LiLiist); */

        /* Vector<Integer>vecLis = new Vector<Integer>();
         vecLis.add(5);
         vecLis.add(8);
         vecLis.add(7);
         vecLis.add(7);
         vecLis.add(2);
         vecLis.add(3);
         System.out.println(vecLis.size());
        int i=vecLis.lastElement();
        System.out.println(i); */

        Stack<Integer> st=new Stack<Integer>();
        st.push(25);
        st.push(24);
        st.push(82);
        st.push(86);
        st.push(36);
        st.push(68);
        System.out.println(st);
        st.remove(st.get(3));
        System.out.println(st);
        Iterator itr = st.iterator();
        
    }
}