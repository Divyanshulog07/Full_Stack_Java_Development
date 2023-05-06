/* Q. 1,2,3,4,5-->list1
      1,2,3,4,5-->list2
   ans. 1*5=5
        2*4=8
        3*3=9
        4*2=8
        5*1=5
*/
package collectionframework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMultiplicationProb {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        List<Integer> list2 = new ArrayList<>();

        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);

        for (int i = 0, j=list2.size()-1; i< list1.size(); i++, j--){
                System.out.println(list1.get(i)*list2.get(j));
        }
    }
}
