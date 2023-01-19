import java.util.*;
/*in this source code we see the implementation of interfaces by writing a code which
     -accepts students info
     -ask for their attendance record and
     -display what it acquired
 */
public interface interfacedemo {
    //abstract methods
      void attendance(students a);
      void getinfo(students a);
      void displayinfo(students a);
      //student class implementing those methods
         class students implements interfacedemo{
            Scanner info=new Scanner(System.in);
            String name,id; int attendancee;
            students(){
                this.getinfo(this);
                this.name=name;
                this.id=id;
                this.attendance(this);
                this.attendancee=attendancee;
                this.displayinfo(this);
            }
            public void getinfo(students a) {//this method is to accept info of student
            System.out.println("enter your information");
            System.out.println("name:");
            name= info.nextLine();
            System.out.println("id:");
            id= info.nextLine();
            }
            public void attendance(students a) {//this method is to acquire the attendance of the student
            System.out.println("how many classes have you attended in the semister??");
            System.out.println();
            System.out.println("out of 45 classes,you have attended :");//let's assume we have 45 given clases in the semister
            attendancee=info.nextInt();

            }
            public void displayinfo(students a){//this method is to display our students' info
                Double att= (double) attendancee;//this is to calculate the percentage for the attendance.so here we are converting our integer into double variable.
                double percentage=att/45*100;

                System.out.println();
                System.out.println("This is your info");
                System.out.println();
                System.out.println("your name is "+name);
                System.out.println("your id is "+id);
                System.out.println("you have attended "+attendancee+" classes which is "+percentage+"% of all classes");

            }


        }

    public static void main(String[] args) {
        interfacedemo.students students1 = new interfacedemo.students();//creating an object to run our code
    }
        }

