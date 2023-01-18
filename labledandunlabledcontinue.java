public class labledandunlabledcontinue {
    //unlabeled continue
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            if(i==2){
                continue;
            }
            System.out.println("break demo");
        }
        //labled continue
        outer:for(int i=0;i<5;i++){
            if(i==2){
                continue outer;
            }
            System.out.println("break demo");
        }
    }
}
