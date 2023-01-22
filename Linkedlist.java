
import java.util.LinkedList;



public class Linkedlist {
    public static void main(String[] args) {

        LinkedList<Integer>animals=new LinkedList<>();
       //adding elements to our linkedlist
        animals.add(6);
        animals.add(2);
        animals.add(3);
        System.out.println("our list looks like "+animals);
        System.out.println();
        //adding at desired index
        animals.add(1,8);
        System.out.println("updated "+animals);
        System.out.println();
        int s0=animals.get(0);
        int s1=animals.get(1);
        int s2=animals.get(2);
        int s3=animals.get(3);
        System.out.println("the first element would be :"+s0);
        System.out.println("the second element would be :"+s1);
        System.out.println("the third element would be :"+s2);
        System.out.println("the fourth element would be :"+s3);
        System.out.println();
        //to replace elements
        animals.set(2,11);
        System.out.println("after the change "+animals);
        System.out.println();
        //to delete an element at a given element
        animals.remove(2);
        System.out.println("after removal"+animals);
        System.out.println();
        //to check if linkedlist contains the element
         if(animals.contains(6)){
        System.out.println("6 exists");
        }else{
           System.out.println("6 dont exist");
        }System.out.println();
        //to add at first
         animals.addFirst(31);
        System.out.println("after adding at first "+animals);
        System.out.println();
        //to add at last
        animals.addLast(5);
        System.out.println("after adding at last "+animals);
        System.out.println();
        //to get the last number
        int sw=animals.getLast();
        System.out.println("the last number in the list is "+sw);
        System.out.println();
        //to get the first number
        int swd=animals.getFirst();
        System.out.println("the first number in the list is "+swd);
        System.out.println();
        //to remove the first number
        animals.removeFirst();
        System.out.println("after removal of the first element "+animals);
        System.out.println();
        //to remove the last number
        animals.removeLast();
        System.out.println("after removal of the last element "+animals);
        System.out.println();

         //to remove all elements
        animals.clear();
        System.out.println("after clear() "+animals);



}
}
