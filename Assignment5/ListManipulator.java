import java.util.*;

/**
 * @author Pedro Augusto
 * @version 1.0
 *
 * This ListManipulator class consists of methods that manipulate ArrayLists in different ways
 */
class ListManipulator {

    /**
     * This method sorts your arraylist<Integer></integer> in either ascending or descending order
     * @param myList Type ArrayList<Integer></Integer>
     * @param ascending type boolean
     * @return myList Type ArrayList<Integer></Integer>
     */
    ArrayList<Integer> sort(ArrayList<Integer> myList, Boolean ascending){
        Collections.sort(myList);
        if(ascending == true){
            return myList;
        }
        else {
           Collections.reverse(myList);
           return myList;
        }
    }

    /**
     * This method swaps the largest value of your arraylist<Integer></integer> with the smalles value
     * @param myList Type ArrayList<Integer></Integer>
     * @return myList Type ArrayList<Integer></Integer>
     */
    ArrayList<Integer> swapLargestSmallest(ArrayList<Integer> myList){

        Integer maxValue = Collections.max(myList);
        Integer minValue = Collections.min(myList);

        Collections.swap(myList, myList.indexOf(maxValue), myList.indexOf(minValue));

        return myList;
    }

    /**
     * This method prints out the frequency of each integer in your arraylist<Integer></Integer> 
     * @param myList Type ArrayList<Integer></Integer>
     */
    void table(ArrayList<Integer> myList){
      Set<Integer> uniqueSet = new HashSet<Integer>(myList);
      for(Integer i : uniqueSet){
          System.out.println(i + ": " + Collections.frequency(myList, i));
      }
    }
}
