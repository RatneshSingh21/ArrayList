// package arraylist;

import java.util.ArrayList;

public class swap {
    public static void swap1(ArrayList<Integer> list,int idx1,int idx2)
    {
        int temp = list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2, temp);
        System.out.println(idx1 +" "+idx2);
    }
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(2);
        list.add(4);
        int idx1=1,idx2 =4;
        System.out.println(list);
        swap1(list, idx1, idx2);
        System.out.println(list);
    }
}
