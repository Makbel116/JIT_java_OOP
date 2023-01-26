import java.util.*;
public class stack {
    public static void main(String[] args) {
        Stack <String>newstack=new Stack<>();
       //to add in elements
        newstack.push("new");
        newstack.push("item");
        newstack.push("list");
        newstack.push("for");
        newstack.push("any");
        newstack.push("students");
        System.out.println(newstack);
        System.out.println();
        //to remove element
        newstack.pop();//this will delete the last added element
        System.out.println(newstack);
        System.out.println();
        //to remove any desired object
        newstack.remove("item");
        System.out.println(newstack);
        System.out.println();
        //to remove by index
        newstack.remove(2);
        System.out.println(newstack);
        System.out.println();
        //to access a single element
        String s1=newstack.get(1);
        System.out.println(s1);
        System.out.println();
        //to check if a certain element exist or not
        if(newstack.contains("list")){
            System.out.println("yes it exists");
        }else {
            System.out.println("no it doesnt exist");
        }
    }
}
