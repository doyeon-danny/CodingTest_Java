class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = {};
        int i = 1;
        if (arr.length%2==1) {
            i = 0;
        }
        for (int j=i; j<arr.length+i; j+=2) {
            // System.out.println(j);
            arr[j] += n;
            
        }
        return arr;
    }
}