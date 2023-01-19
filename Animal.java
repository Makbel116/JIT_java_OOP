public abstract class Animal {
    //this code is to illustrate abstraction in abstract class
    public abstract void makesound();
    public abstract void eat();
    public void move(){//all methods in abstract class need to be abstract

    }
    class Cat extends Animal{
        //both abstract methods declared above need to be implemented here
        public void makesound(){
            System.out.println("cat is making sound");
        }
        public void eat(){
            System.out.println("cat is eating");
        }
    }

}
