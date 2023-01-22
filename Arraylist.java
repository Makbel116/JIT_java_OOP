import java.util.*;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> randomnames=new ArrayList<>();
        //adding strings to our arraylist collection
        randomnames.add("john");
        randomnames.add("chalachew");
        randomnames.add("abebe");
        System.out.println(randomnames);
        System.out.println();
        //to add at desired index
        randomnames.add(1,"fuad");
        //to access elements
        String s0=randomnames.get(0);
        String s1=randomnames.get(1);
        String s2=randomnames.get(2);
        String s3=randomnames.get(3);
        System.out.println("the first element would be :"+s0);
        System.out.println("the second element would be :"+s1);
        System.out.println("the third element would be :"+s2);
        System.out.println("the fourth element would be :"+s3);
        System.out.println();
        //to replace elements
        randomnames.set(1,"chaltu");
        System.out.println("our collection after replacement :"+randomnames);
        System.out.println();
        //to remove elements
        randomnames.remove(2);
        System.out.println("our collection after deletion of object at index 2:"+randomnames);
        System.out.println();
        //to know the length of our arraylist
        int length=randomnames.size();
        System.out.println("the size of our collection is "+length);
        System.out.println();
        //to sort our arraylist
        randomnames.sort(Comparator.naturalOrder());
        System.out.println("our arraylist after sorting :"+randomnames);
        //to clone our arraylist
        ArrayList<String> cloned=(ArrayList<String>)randomnames.clone();
        System.out.println("the cloned arraylist :"+cloned);
        System.out.println();
        //to specify the total element the arraylist can specify
        randomnames.ensureCapacity(10);
        //to check if our arraylist is empty
        if(randomnames.isEmpty()){
            System.out.println("empty");}
        else{
            System.out.println("not empty");
            }
        System.out.println();
        //to search a specified element in arraylist and return the index of the element;
        System.out.println("the index of abebe is "+randomnames.indexOf("john"));

    }
    }
