import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        Queue <String> newqueue=new LinkedList<>();
        //to add in elements
        newqueue.add("new");
        newqueue.add("item");
        newqueue.add("list");
        newqueue.add("for");
        newqueue.add("any");
        newqueue.add("students");
        System.out.println(newqueue);
        System.out.println();
        //to remove element
        newqueue.remove();//this will delete the first added element
        System.out.println(newqueue);
        System.out.println();
        //to remove any desired object
        newqueue.remove("item");
        System.out.println(newqueue);
        System.out.println();

        //to check if a certain element exist or not
        if(newqueue.contains("list")){
            System.out.println("yes it exists");
        }else {
            System.out.println("no it doesnt exist");
        }
        System.out.println();
        //to delete all elements
        newqueue.clear();
        System.out.println(newqueue);
        System.out.println();

    }
}
