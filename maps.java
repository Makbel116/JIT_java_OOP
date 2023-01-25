import java.util.HashMap;

public class maps {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        //adding element to the list
        map.put("blue",1);
        map.put("green",2);
        map.put("yellow",10);
        map.put("red",22);
        //print the size of the map
        System.out.println("the size of the map is "+map.size());
        //print the elements of the map
        System.out.println(map);
        //to access the object
        System.out.println("the first element is "+map.get("blue"));
        System.out.println("the second element is "+map.get("green"));
        System.out.println("the third element is "+map.get("yellow"));
        System.out.println("the fourth element is  "+map.get("red"));
        //to remove element
        map.remove("yellow");
        //to check if map contains a key
        if(map.containsKey("red")){
            System.out.println("it exist");
        }else{
            System.out.println("no it doest exist");
        }
        //to check if map contains a value
        if(map.containsValue(2)){
            System.out.println("it exist");
        }else{
            System.out.println("no it doest exist");
        }
        //to check if map is empty
        if(map.isEmpty()){
            System.out.println("nothing exist");
        }else{
            System.out.println("elements exist");
        }
    }
}
