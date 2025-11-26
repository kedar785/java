package lecture.com;

import java.util.HashMap;
public class lec14 {
    public static void main(String[] args){

   HashMap<Integer,Integer> map=new HashMap<>();

   int arr[] ={2,7,76,56};
   int target=9;
   for(int i=0;i<arr.length;i++){
       int diff=target-arr[i];
       if(map.containsKey(diff)){
           System.out.println(map.get(diff) + " " +i);
           break;
       }
       map.put(arr[i],i);
   }
      //  String str="Alibaba";
//        for(char ch:str.toCharArray()){
//            map.put(ch,map.getOrDefault(ch,0)+1);
//        }
//
//        //System.out.println(map);
//
//        for(char ch:str.toCharArray()){
//            if(map.get(ch)==1){
//                System.out.println(ch);
//            }
//        }



//        int arr[]={1,1,3,4,5,5,6};
//        for(int x:arr){
//            map.put(x,map.getOrDefault(x,0)+1);
//        }
//        System.out.println(map);

        //map.put(1,10);
      //  map.put(2,20);
       // System.out.println(map.get(3));
       // System.out.println(map.getOrDefault(2,500));
      //  System.out.println(map.containsKey(2));

//        for(int x:map.keySet()){
//            System.out.println(map.get(x));
//        }

    }
}
