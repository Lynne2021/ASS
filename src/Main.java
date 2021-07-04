/**
 * Test all these classes using appropriate ways to get correct result and modification.
 *
 * @author honglin
 */
public class Main {
    public static void main(String[] args) {
        //initiallize
        /*
          @try check the code if suitable
         * @catch Exception e to get the problem code.
         */
        try {
            ClientService clientService0 = new ClientService(0);
        }catch(Exception e) {
            e.printStackTrace();
        }
        ClientService clientService = new ClientService(5);
        System.out.println(clientService.add("tom"));
        System.out.println(clientService.add("mike"));
        System.out.println(clientService.add("john"));
        System.out.println(clientService.add("nick"));
        System.out.println(clientService.add("sabre"));
        System.out.println(clientService.add("jack"));
        /*
          use loop to get the next all object
         */
        while(true) {
            Object client = clientService.getNext();
            if(client!=null) {
                System.out.println("fetch "+(String)client);
            }else {
                System.out.println("no client");
                break;
            }
        }
        System.out.println("\n");
        //initiallize stack
        try {
            ShoppingBag shoppingBag0 = new ShoppingBag(0);
        }catch(Exception e) {
            e.printStackTrace();
        }
        ShoppingBag shoppingBag = new ShoppingBag(5);
        System.out.println(shoppingBag.add("apple"));
        System.out.println(shoppingBag.add("hotdog"));
        System.out.println(shoppingBag.add("grape"));
        System.out.println(shoppingBag.add("pear"));
        System.out.println(shoppingBag.add("bread"));
        System.out.println(shoppingBag.add("pineapple"));
        //fetch element from stack
        while(true) {
            Object item = shoppingBag.getNext();
            if(item!=null) {
                System.out.println("fetch "+(String)item);
            }else {
                System.out.println("no item");
                break;
            }
        }
        //initiallize list
        DeansList deans = new DeansList();
        Student stu1 = new Student("tom", (double)2.5);
        Student stu2 = new Student("jack", (double)3.8);
        Student stu3 = new Student("nick", (double)3.7);
        Student stu4 = new Student("mike", (double)4.2);
        Student stu5 = new Student("sabre", (double)3.9);
        System.out.println(deans.add(stu1));
        System.out.println(deans.add(stu2));
        System.out.println(deans.add(stu3));
        System.out.println(deans.add(stu4));
        System.out.println(deans.add(stu5));

        while(true) {
            Object student = deans.getNext();
            if(student instanceof Student) {
                System.out.println("fetch "+(Student)student);
            }else {
                System.out.println("no student");
                break;
            }
        }

    }
    }

