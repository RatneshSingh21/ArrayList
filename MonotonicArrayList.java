import java.util.ArrayList;

public class MonotonicArrayList {
    public boolean isMonotonic(ArrayList<Integer> A) {
        boolean inc = true;
        boolean dec = true;
        for (int i = 0; i < A.size() - 1; i++) {
            if (A.get(i) > A.get(i + 1))
                inc = false;
            if (A.get(i) < A.get(i + 1))
                dec = false;
        }
        return inc || dec;
    }
    public static void main(String[] args) {
        ArrayList<Integer> h=new ArrayList<>();
        h.add(1);
         h.add(3);
          h.add(2);
          isMonotonic(h);
    }
}
