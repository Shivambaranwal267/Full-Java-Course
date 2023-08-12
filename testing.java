import java.util.*;

public class testing {

  public static void main(String[] args) {
     
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[]arr = new int[n];
    
    for(int i=0;i<n;i++){
        arr[i] = scn.nextInt();
    }
    int max = Integer.MIN_VALUE;
    for(int i=0;i<n;i++){
        for(int j =0;j<n;j++){
            if(Math.abs(arr[i]-arr[j])+i-j > max){
                max = Math.abs(arr[i]-arr[j])+i-j;
            }
        }
    }
    
    //System.out.println(max);
    
    int ans1 = maxdifference_2(arr);
    int ans2 = maxdifference_3(arr);
    
    System.out.println(Math.max(ans1,ans2));

    scn.close();
  }

  public static int maxdifference_3(int[]arr){
    for(int i=0;i<arr.length;i++){
        arr[i] = arr[i] - i;
    }
    
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    
    for(int i=0;i<arr.length;i++){
        if(arr[i] > max){
            max = arr[i];
        }
        
        if(arr[i] < min){
            min = arr[i];
        }
        
    }
    
    return max - min;
}

public static int maxdifference_2(int[]arr){
  for(int i=0;i<arr.length;i++){
      arr[i] = arr[i] + i;
  }
  
  int max = Integer.MIN_VALUE;
  int min = Integer.MAX_VALUE;
  
  for(int i=0;i<arr.length;i++){
      if(arr[i] > max){
          max = arr[i];
      }
      
      if(arr[i] < min){
          min = arr[i];
      }
      
  }
   for(int i=0;i<arr.length;i++){
      arr[i] = arr[i] - i;
  }
  
  return max - min;
}

}





