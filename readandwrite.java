import java.io.*;
import java.util.*;
public class readandwrite {
    public static void main(String[] args) {
         String name,id,department;
         Scanner hello=new Scanner(System.in);
        try{
            PrintWriter write=new PrintWriter(new FileOutputStream("new.txt",true));
            System.out.println("enter your name");
            name= hello.next();
            System.out.println("enter your id");
            id= hello.next();
            System.out.println("enter your department");
            department= hello.next();
            write.print("your name is "+name+"\n");
            write.print("your id is "+id+"\n");
            write.print("your department is "+department+"\n");
            write.close();
        }catch (IOException e){
            System.out.println("error I/O :"+e);
    }
        try {
            BufferedReader read=new BufferedReader(new FileReader("new.txt"));
            String line;
            while((line=read.readLine())!=null){
                System.out.println(line);
            }
            read.close();
        }catch (IOException e){
            System.out.println("error I/O :"+e);
        }
}}
