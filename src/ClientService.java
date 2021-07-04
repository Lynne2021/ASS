import java.util.ArrayList;
public class ClientService implements ICollection{
    private ArrayList<String> clients;
    private int maxiNumber;
    public ClientService() {
    }
    public ClientService(int maxiNumber) {
        if (maxiNumber <= 0) {
            throw new ArithmeticException("Max number cannot be zero or negative");
        }else{
            System.out.println("The max number of clients is : " + maxiNumber);
            this.maxiNumber = maxiNumber;
            clients = new ArrayList<String>();
        }
    }
    /**
     * Add client name into list, if clients size less than maximum
     * number, add new client and return back true; else return back false;
     *
     * @param  newItem  client's name
     * @return if add client successfully, return back true, else return false;
     */
    @Override
    public boolean add(Object newItem) {
        if (clients.size() < maxiNumber) {
            clients.add((String)newItem);
            return true;
        }
        return false;
    }
    /**
     * Get next client from clients list, if no client in the list, return back
     * null;
     *
     * @return  next client String
     */
    @Override
    public Object getNext() {
        if(clients.size()>0) {
            return clients.remove(0);
        }
        return null;
    }
}
