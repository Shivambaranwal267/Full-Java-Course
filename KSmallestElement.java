

//  public static int kthSmallest(int[] arr, int l, int r, int k) 
//     { 
//          PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

//         for(int i=0;i<k;i++){
//             pq.add(arr[i]);
//         }

//         for(int i=k;i<arr.length;i++){
//             if(pq.peek() > arr[i]){
//                 pq.remove();
//                 pq.add(arr[i]);
//             }
//         }

//         return pq.peek();
//     } 


// // public int findKthLargest(int[] nums, int k) {
//         PriorityQueue<Integer> pq = new PriorityQueue<>();

//         for(int i=0;i<k;i++){
//             pq.add(nums[i]);
//         }

//         for(int i=k;i<nums.length;i++){
//             if(pq.peek()< nums[i]){
//                 pq.remove();
//                 pq.add(nums[i]);
//             }
//         }

//         return pq.peek();

//     } 

// class MedianFinder {
//     PriorityQueue<Integer> small;
//     PriorityQueue<Integer> large;
//     public MedianFinder() {
//         small = new PriorityQueue<>(Collections.reverseOrder());
//         large = new PriorityQueue<>();
//     }
    
//     public void addNum(int num) {
//         if(small.size() == large.size()){
//             large.add(num);
//             small.add(large.remove());
//         }else{
//             small.add(num);
//             large.add(small.remove());
//         }
//     }
    
//     public double findMedian() {
//         if(small.size() == large.size()){
//             return (small.peek()+large.peek())/2.0;
//         }else{
//             return small.peek();
//         }
//     }
// }
