/**
 * Interface class creat these methods to implement by these classes.java
 *
 * @author lynne
 * @version 1.0
 */
public interface ICollection {
    /**
     * interface method never implement by own. has to implement by override at class.java
     * @param newItem , add Object use boolean type method
     * @return return Object or null
     */
    public boolean add(Object newItem);
    public Object getNext();
}
