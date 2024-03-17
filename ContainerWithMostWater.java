
import java.util.ArrayList;

// public class ContainerWithMostWater {

//     // brute force
//     public static int storeWater(ArrayList<Integer> height) {
//         int maxWater = 0;
//         for (int i = 0; i < height.size(); i++) {
//             for (int j = i + 1; j < height.size(); j++) {
//                 int width = j - i;
//                 int ht = Math.min(height.get(i), height.get(j));
//                 int curWater = ht * width;
//                 maxWater = Math.max(maxWater, curWater);
//             }
//         }
//         return maxWater;
//     }

//     public static void main(String[] args) {
//         ArrayList<Integer> height = new ArrayList<>();
//         height.add(1);
//         height.add(8);
//         height.add(6);
//         height.add(2);
//         height.add(5);
//         height.add(4);
//         height.add(8);
//         height.add(3);
//         height.add(7);
//         System.out.println(storeWater(height));

//     }
// }


//optimise force
public class ContainerWithMostWater {
    public static int storeWater(ArrayList<Integer> height) {
        int maxWater = 0;
        int i=0;
        int j=height.size()-1;
       while(i<=j)
       {
           int width = j - i;
                int ht = Math.min(height.get(i), height.get(j));
                int curWater = ht * width;
                maxWater = Math.max(maxWater, curWater);
                if(height.get(i)<height.get(j))
                {
                    i++;
                }
                else{
                    j--;
                }
       }
        return maxWater;
    }
    public static void main (String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(storeWater(height));
    }
}
