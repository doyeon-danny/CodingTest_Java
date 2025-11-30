import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        // int[] answer = {};
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i=0; i<arr.length; i++) {
            // System.out.println(arr[i]);
            boolean flag = true;
            for (int j=0; j<delete_list.length; j++) {
                if (arr[i] == delete_list[j]) {
                    System.out.println(arr[i]);
                    flag = false;
                    break;
                }   
            }
            if (flag) {
                answer.add(arr[i]);
            }
            
            // System.out.println("not matched : " + arr[i]);
        }
        int[] result = new int[answer.size()];
        for (int i=0; i<answer.size(); i++) {
            result[i] = answer.get(i);
        }
        return result;
    }
}