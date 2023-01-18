public class labledandunlabledbreak {
    //unlabeled break
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            if(i==2){
                break;
            }
            System.out.println("break demo");
        }
        //labled break
        outer:for(int i=0;i<5;i++){
            if(i==2){
                break outer;
            }
            System.out.println("break demo");
        }
    }
}
