import java.util.HashMap;

public class BasicHashMap {

  public static void main(String[] args) {
    HashMap<Integer, Integer> map = new HashMap<>();

    map.put(10, 50);
    map.put(20, 60);
    map.put(30, 60);

    // System.out.println(map.get(20));

    // map.put(20, 70); // replace

    // System.out.println(map.get(20));

    // System.out.println(map.get(40)); // null
    // System.out.println(map.size());  // size

    // System.out.println(map.containsKey(30));

    // // remove
    // map.remove(30);
    // System.out.println(map.containsKey(30));

    // int arr[] = {2,3,4,5,6};
    // for(int val:arr) {
    //     System.out.print(val + " ");
    // }

    for(int val:map.keySet()) {  // random order value given
        System.out.println(val);
    } 


  }
}
