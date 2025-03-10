package JavaPractice;
import  java.util.*;
public class hashMapExample {
    public static <HasMap> void main(String[] args) {
//        HashMap<Integer,String> hashMapex = new HashMap<Integer,String>();
//        hashMapex.put(1,"Akshay");
//
//        System.out.println(hashMapex.get(1));

        //Given two integer arrays, A and B of size N and M, respectively.
        // Your task is to find all the common elements in both the array.

        int [] A = {1,2,2,3,4,5,6,7,8};
        int [] b = {1,2,4,5,6,7,10};

        HashMap<Integer,Integer> frequny = new HashMap<Integer,Integer>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0;i<A.length;i++){
            if(frequny.containsKey(A[i])){
                frequny.put(A[i],frequny.get(A[i])+1);
            }else{
                frequny.put(A[i],1);
            }
        }
        System.out.println(frequny);

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i<b.length;i++){
            if(frequny.containsKey(b[i]) && frequny.get(b[i])>0){
                list.add(b[i]);
                frequny.put(b[i],frequny.get(b[i])-1);
            }
        }
        System.out.println(list);
    }
}
