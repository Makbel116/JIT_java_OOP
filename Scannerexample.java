
import java.util.Scanner;
    public class Scannerexample {
        //this code is to elaborate the function of scanner to take input from the user and
        //the use of the keyword "this" in a given class
        //it also illustrares constructors,functions,objects
        public String name;public int id;public String department;
        Scannerexample(String name,int id,String department){//constructor

            this.name=name;
            this.id=id;
            this.department=department;
            this.Display(this);//by using keyword "this" we are calling a function
        };

        void Display(Scannerexample b){//this is to display our recieved info

            System.out.println("This is your student info");
            System.out.println("student name is "+b.name);
            System.out.println("student id is "+b.id);
            System.out.println("student department is"+b.department);
        }

        public static void main(String[] args) {
            String student;//creating variables to accept input from the user
            int idno;
            String dep;
            Scanner hello= new Scanner(System.in);//object called "hello" is created for Scanner class
            System.out.println("Dear Student, enter your information ");
            student=hello.next();
            idno=hello.nextInt();
            dep=hello.next();

            Scannerexample stu1= new Scannerexample(student,idno,dep);//we are creating our first object called stu1
            //and assigning the values given by the user to it by using constructors


        }

    }


