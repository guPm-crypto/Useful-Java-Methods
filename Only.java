/**
 * @author guPm-crypto
 * @version 1.0.0
 */

package Only;
import java.util.*;

public class Only {
    
    /**
     * 
     * @param arrayList
     * @param index
     * @param max
     * @return maximum
     */
    private static int max(ArrayList<Integer> arrayList,int index,int max)
    {
        if(index==arrayList.size())return max;
        if(arrayList.get(index)>max)max=arrayList.get(index);
        return max(arrayList,index+1,max);
    }
    /**
     * 
     * @param arrayList
     * @return maximum
     */
    public static int max(ArrayList<Integer> arrayList)
    {
        if(arrayList.size()==0)throw new EmptyListException();
        return max(arrayList,0,arrayList.get(0));
    }


    /**
     * 
     * @param listIterator
     * @param max
     * @return max
     */
    private static int max(ListIterator<Integer> listIterator,int max)
    {
        if(!listIterator.hasNext())return max;
        int value=listIterator.next();
        if(value>max)max=value;
        return max(listIterator,max);
    }
    /**
     * 
     * @param linkedList
     * @return maximum
     */
    public static int max(LinkedList<Integer> linkedList)
    {
        if(linkedList.size()==0)throw new EmptyListException();
        ListIterator<Integer> listIterator=linkedList.listIterator();
        return max(listIterator,linkedList.getFirst());
    }


    /**
     * 
     * @param arrayList
     * @param index
     * @param min
     * @return minimum
     */
    private static int min(ArrayList<Integer> arrayList,int index,int min)
    {
        if(index==arrayList.size())return min;
        if(arrayList.get(index)<min)min=arrayList.get(index);
        return min(arrayList,index+1,min);
    }
    /**
     * 
     * @param arrayList
     * @return minimum
     */
    public static int min(ArrayList<Integer> arrayList)
    {
        if(arrayList.size()==0)throw new EmptyListException();
        return min(arrayList,0,arrayList.get(0));
    }


    /**
     * 
     * @param listIterator
     * @param min
     * @return min
     */
    private static int min(ListIterator<Integer> listIterator,int min)
    {
        if(!listIterator.hasNext())return min;
        int value=listIterator.next();
        if(value<min)min=value;
        return min(listIterator,min);
    }
    /**
     * 
     * @param linkedList
     * @return minimum
     */
    public static int min(LinkedList<Integer> linkedList)
    {
        if(linkedList.size()==0)throw new EmptyListException();
        ListIterator<Integer> listIterator=linkedList.listIterator();
        return min(listIterator,linkedList.getFirst());
    }


    /**
     * 
     * @param arrayList
     * @param index
     * @param sum
     * @return sum
     */
    private static int sum(ArrayList<Integer> arrayList,int index,int sum)
    {
        if(index==arrayList.size())return sum;
        sum+=arrayList.get(index);
        return sum(arrayList,index+1,sum);
    }
    /**
     * 
     * @param arrayList
     * @return sum
     */
    public static int sum(ArrayList<Integer> arrayList)
    {
        if(arrayList.size()==0)throw new EmptyListException();
        return sum(arrayList,0,0);
    }


    /**
     * 
     * @param listIterator
     * @param sum
     * @return sum
     */
    private static int sum(ListIterator<Integer> listIterator,int sum)
    {
        if(!listIterator.hasNext())return sum;
        int value=listIterator.next();
        sum+=value;
        return sum(listIterator,sum);
    }
    /**
     * 
     * @param linkedList
     * @return sum
     */
    public static int sum(LinkedList<Integer> linkedList)
    {
        if(linkedList.size()==0)throw new EmptyListException();
        ListIterator<Integer> listIterator=linkedList.listIterator();
        return sum(listIterator,0);
    }


    /**
     * 
     * @param arrayList
     * @param index
     * @return ifInAscendingOrder
     */
    private static boolean inAscendingOrder(ArrayList<Integer> arrayList,int index)
    {
        boolean verified=true;
        if(index+1==arrayList.size() && verified)return true;
        if(arrayList.get(index)>arrayList.get(index+1)){verified=false;return false;}
        return inAscendingOrder(arrayList, index+1);
    }
    /**
     * 
     * @param arrayList
     * @return ifInAscendingOrder
     */
    public static boolean inAscendingOrder(ArrayList<Integer> arrayList)
    {
        if(arrayList.size()==0)throw new EmptyListException();
        return inAscendingOrder(arrayList,0);
    }


    /**
     * 
     * @param listIterator
     * @return ifInAscendingOrder
     */
    private static boolean inAscendingOrder(ListIterator<Integer> listIterator)
    {
        boolean verified=true;
        listIterator.next();
        if(!listIterator.hasNext() && verified)return true;
        listIterator.previous();
        int value=listIterator.next();
        int nextToValue=listIterator.next();
        listIterator.previous();
        if(value>nextToValue){verified=false;return false;}
        return inAscendingOrder(listIterator);
    }
    /**
     * 
     * @param linkedList
     * @return ifInAscedingOrder
     */
    public static boolean inAscendingOrder(LinkedList<Integer> linkedList)
    {
        if(linkedList.size()==0)throw new EmptyListException();
        ListIterator<Integer> listIterator=linkedList.listIterator();
        return inAscendingOrder(listIterator);
    }


    /**
     * 
     * @param arrayList
     * @param index
     * @return ifInDescendingOrder
     */
    private static boolean inDescendingOrder(ArrayList<Integer> arrayList,int index)
    {
        boolean verified=true;
        if(index+1==arrayList.size() && verified)return true;
        if(arrayList.get(index)<arrayList.get(index+1)){verified=false;return false;}
        return inDescendingOrder(arrayList, index+1);
    }
    /**
     * 
     * @param arrayList
     * @return ifInDescendingOrder
     */
    public static boolean inDescendingOrder(ArrayList<Integer> arrayList)
    {
        if(arrayList.size()==0)throw new EmptyListException();
        return inDescendingOrder(arrayList,0);
    }


    /**
     * 
     * @param listIterator
     * @return ifInDescendindOrder
     */
    private static boolean inDescendingOrder(ListIterator<Integer> listIterator)
    {
        boolean verified=true;
        listIterator.next();
        if(!listIterator.hasNext() && verified)return true;
        listIterator.previous();
        int value=listIterator.next();
        int nextToValue=listIterator.next();
        listIterator.previous();
        if(value<nextToValue){verified=false;return false;}
        return inDescendingOrder(listIterator);
    }
    /**
     * 
     * @param linkedList
     * @return ifInDescendingOrder
     */
    public static boolean inDescendingOrder(LinkedList<Integer> linkedList)
    {
        if(linkedList.size()==0)throw new EmptyListException();
        ListIterator<Integer> listIterator=linkedList.listIterator();
        return inDescendingOrder(listIterator);
    }


    /**
     * 
     * @param arrayList
     * @param index
     * @param value
     * @return ifListContainsValue
     */
    private static boolean contains(ArrayList<Integer> arrayList,int index,int value)
    {
        boolean verified=false;
        if(index==arrayList.size() && !verified)return false;
        if(arrayList.get(index)==value){verified=true;return true;}
        return contains(arrayList,index+1,value);
    }
    /**
     * 
     * @param arrayList
     * @param value
     * @return ifListContainsValue
     */
    public static boolean contains(ArrayList<Integer> arrayList,int value)
    {
        if(arrayList.size()==0)throw new EmptyListException();
        return contains(arrayList,0,value);
    }


    /**
     * 
     * @param listIterator
     * @param value
     * @return ifListContainsValue
     */
    private static boolean contains(ListIterator<Integer> listIterator,int value)
    {
        boolean verified=false;
        if(!listIterator.hasNext() && !verified)return false;
        int toVerify=listIterator.next();
        if(toVerify==value){verified=true;return true;}
        return contains(listIterator,value);
    }
    /**
     * 
     * @param linkedList
     * @param value
     * @return ifListContainsValue
     */
    public static boolean contains(LinkedList<Integer> linkedList,int value)
    {
        if(linkedList.size()==0)throw new EmptyListException();
        ListIterator<Integer> listIterator=linkedList.listIterator();
        return contains(listIterator,value);
    }


    /**
     * 
     * @param arrayList
     * @param index
     * @param value
     * @param occ
     * @return valueOccurrency
     */
    private static int occurrency(ArrayList<Integer> arrayList,int index,int value,int occ)
    {
        if(index==arrayList.size())return occ;
        if(arrayList.get(index)==value)occ++;
        return occurrency(arrayList, index+1, value, occ);
    }
    /**
     * 
     * @param arrayList
     * @param value
     * @return valueOccurrency
     */
    public static int occurrency(ArrayList<Integer> arrayList,int value)
    {
        if(arrayList.size()==0)throw new EmptyListException();
        return occurrency(arrayList,0, value,0);
    }


    /**
     * 
     * @param listIterator
     * @param value
     * @param occ
     * @return valueOccurrency
     */
    private static int occurrency(ListIterator<Integer> listIterator,int value,int occ)
    {
        if(!listIterator.hasNext())return occ;
        int toVerify=listIterator.next();
        if(toVerify==value)occ++;
        return occurrency(listIterator, value, occ);
    }
    /**
     * 
     * @param linkedList
     * @param value
     * @return valueOccurrency
     */
    public static int occurrency(LinkedList<Integer> linkedList,int value)
    {
        if(linkedList.size()==0)throw new EmptyListException();
        ListIterator<Integer> listIterator=linkedList.listIterator();
        return occurrency(listIterator, value, 0);
    }


    /**
     * 
     * @param arrayList
     * @param index
     * @return verifyIfElementsAreAllEqual
     */
    private static boolean allEqual(ArrayList<Integer> arrayList,int index)
    {
        boolean verified=true;
        if(index==arrayList.size() && verified)return true;
        if(arrayList.get(0)!=arrayList.get(index)){verified=false;return false;}
        return allEqual(arrayList, index+1);
    }
    /**
     * 
     * @param arrayList
     * @return verifyIfElementsAreAllEqual
     */
    public static boolean allEqual(ArrayList<Integer> arrayList)
    {
        if(arrayList.size()==0)throw new EmptyListException();
        return allEqual(arrayList,0);
    }


    /**
     * 
     * @param listIterator
     * @param value
     * @return verifyIfElementsAreAllEqual
     */
    private static boolean allEqual(ListIterator<Integer> listIterator,int value)
    {
        boolean verified=true;
        if(!listIterator.hasNext() && verified)return true;
        int toVerify=listIterator.next();
        if(toVerify!=value){verified=false;return false;}
        return allEqual(listIterator,value);
    }
    /**
     * 
     * @param linkedList
     * @return verifyIfElementsAreAllEqual
     */
    public static boolean allEqual(LinkedList<Integer> linkedList)
    {
        if(linkedList.size()==0)throw new EmptyListException();
        ListIterator<Integer> listIterator=linkedList.listIterator();
        return allEqual(listIterator,linkedList.getFirst());
    }


    /**
     * 
     * @param arrayList
     * @param index
     * @param value
     * @return verifyIfElementsAreGreaterThanAValue
     */
    private static boolean greaterThan(ArrayList<Integer> arrayList,int index,int value)
    {
        boolean verified=true;
        if(index==arrayList.size() && verified)return true;
        if(arrayList.get(index)<=value){verified=false;return false;}
        return greaterThan(arrayList, index+1, value);
    }
    /**
     * 
     * @param arrayList
     * @param value
     * @return verifyIfElementsAreGreaterThanAValue
     */
    public static boolean greaterThan(ArrayList<Integer> arrayList,int value)
    {
        if(arrayList.size()==0)throw new EmptyListException();
        return greaterThan(arrayList,0,value);
    }


    /**
     * 
     * @param listIterator
     * @param value
     * @return verifyIfElementsAreGreaterThanAValue
     */
    private static boolean greaterThan(ListIterator<Integer> listIterator,int value)
    {
        boolean verified=true;
        if(!listIterator.hasNext() && verified)return true;
        int toVerify=listIterator.next();
        if(toVerify<=value){verified=false;return false;}
        return greaterThan(listIterator, value);
    }
    /**
     * 
     * @param linkedList
     * @param value
     * @return verifyIfElementsAreGreaterThanAValue
     */
    public static boolean greaterThan(LinkedList<Integer> linkedList,int value)
    {
        if(linkedList.size()==0)throw new EmptyListException();
        ListIterator<Integer> listIterator=linkedList.listIterator();
        return greaterThan(listIterator, value);
    }


    /**
     * 
     * @param arrayList
     * @param index
     * @param value
     * @return verifyIfElementsAreLowerThanAValue
     */
    private static boolean lowerThan(ArrayList<Integer> arrayList,int index,int value)
    {
        boolean verified=true;
        if(index==arrayList.size() && verified)return true;
        if(arrayList.get(index)>=value){verified=false;return false;}
        return lowerThan(arrayList, index+1, value);
    }
    /**
     * 
     * @param arrayList
     * @param value
     * @return verifyIfElementsAreLowerThanAValue
     */
    public static boolean lowerThan(ArrayList<Integer> arrayList,int value)
    {
        if(arrayList.size()==0)throw new EmptyListException();
        return lowerThan(arrayList, 0, value);
    }


    /**
     * 
     * @param listIterator
     * @param value
     * @return verifyIfElementsAreLowerThanAValue
     */
    private static boolean lowerThan(ListIterator<Integer> listIterator,int value)
    {
        boolean verified=true;
        if(!listIterator.hasNext() && verified)return true;
        int toVerify=listIterator.next();
        if(toVerify>=value){verified=false;return false;}
        return lowerThan(listIterator, value);
    }
    /**
     * 
     * @param linkedList
     * @param value
     * @return verifyIfElementsAreLowerThanAValue
     */
    public static boolean lowerThan(LinkedList<Integer> linkedList,int value)
    {
        if(linkedList.size()==0)throw new EmptyListException();
        ListIterator<Integer> listIterator=linkedList.listIterator();
        return lowerThan(listIterator, value);
    }


}