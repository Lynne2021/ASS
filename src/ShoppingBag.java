/**
 * To implement interface methods in shopping class.java
 *
 * @author honglin
 */
public class ShoppingBag implements ICollection{
    /**
     * private instance variable;
     * private Array instance variable;
     * initialize index is zero;
     */
    private int maxNumber;
    private String[] stack;
    private int index=0;
    /**
     * @param maxNumber
     * @throws  maxiNumber is zero or negative,throw IllegalArgument Exception
     */
    public ShoppingBag(int maxNumber) {
     if (maxNumber<=0) {
        throw new IllegalArgumentException(
                "maxiNumber can not be zero or negative");
    }else{
        System.out.println("The Shopping bag maxiNumber is " + maxNumber);
        this.maxNumber = maxNumber;
        stack = new String[maxNumber];
    }
}
    /**
     * Add shopping stuff into shoppingBag Stack, if shopping bag size less than
     * maximum number, add new stuff into shopping bag and return back true;
     * else return back false;
     *
     * @param object new items
     * @return if add shopping stuff successfully, return back true, else return
     * false;
     */
    @Override
    public boolean add(Object newItem) {
        if (index == maxNumber) {
            return false;
        } else {
            stack[index] = (String)newItem;
            index++;
            return true;
        }
    }
    /**
     * Get next shopping stuff from shopping bag stack, if no shopping stuff left;
     *  return back null;
     *
     * @return  next shopping stuff String
     */
    @Override
    public Object getNext() {
        if(index==0){
            System.out.println("It is empty.");
            return null;
        }
        else {
            return stack[--index];
        }
    }
}
