import java.util.ArrayList;

public class Multi2 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>mainList = new ArrayList<>();
        ArrayList<Integer> list1= new ArrayList<>();
        ArrayList<Integer> list2= new ArrayList<>();
        ArrayList<Integer> list3= new ArrayList<>();
        for(int i=1;i<= 5;i++)
        {
            list1.add(i*2);
            list2.add(i*3);
            list3.add(i*5);
        }

        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        System.out.println(mainList);
           
        
        for(int i=0;i<mainList.size();i++)
        {
          ArrayList<Integer> curr = mainList.get(i);
          for(int j=0;j<curr.size();j++)
          {
              System.out.print(curr.get(j)+" ");
          }
          System.out.println();
        }
  
        //   System.out.println(mai/nList);
    }
}
