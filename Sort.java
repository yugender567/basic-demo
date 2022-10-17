import java.util.*;

public class Sort {
  
  public static void main(String args[]){
    try (Scanner sc = new Scanner(System.in)) {
      int k=sc.nextInt();

      int[] arr =  new int[k];
      for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
      }
      
      for(int i=1;i<arr.length-1;i++){
        int cur=arr[i];
        int j=i-1;
        while(j>=0 && cur<arr[j] ){
          arr[j+1]=arr[j];
          j--;
        }
        arr[j+1]=cur;
      }
      for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
      }
    }
    
  }
}
