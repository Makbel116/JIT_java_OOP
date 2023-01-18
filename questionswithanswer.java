import java.util.*;
public class questionswithanswer {
    //question 1: Write a Java program to find the second largest element in an array?
    public static int SecondLargest(int[] arr){
        int num;
        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j])
                {
                    num = arr[i];
                    arr[i] = arr[j];
                    arr[j] = num;}
            }
        }
        return arr[arr.length-2];
    }
    // or the other simple way to do this will be
    public static   int secondlargest(int []arr){
        for(int i=0;i<arr.length;i++)

        Arrays.sort(arr);
        return arr[arr.length-2];
    }
    //question 2:Write a Java program to add two matrices of same size?
    public static void twomatricesadder(int[][]a,int[][]b){

        int[][]sum = new int[a.length][b.length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                sum[i][j]=a[i][j]+b[i][j];
                System.out.print(sum[i][j]+" ");
            }
        }}
    //question 3: Write a Java program to find the common elements between two arrays of integers?
    public static void commonfinder(int []a,int[]b ){
        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<b.length; j++)
            {
                if(a[i]==b[j])
                    System.out.print(a[i]+ " ");
            }
        }
    }
    public static void main(String[] args){
        //let's test our methods
        int a[]={1,2,8,4,7,6};
        int b[]={22,7,4,25,2,6};
        int a1[][]={{11,23,34},{21,42,34},{35,42,53}};
        int a2[][]={{11,32,42},{22,41,13},{21,22,42}};
        System.out.println("Second Largest: "+SecondLargest(a));
        System.out.println("Second Largest: "+secondlargest(b));
        System.out.println("Sum of the matirx would be: ");
        twomatricesadder(a1,a2);
        System.out.println("the common numbers are");
        commonfinder(a,b);

    }
}

