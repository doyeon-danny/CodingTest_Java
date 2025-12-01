import java.util.stream.IntStream;
class Solution {
    public int solution(int[] arr1, int[] arr2) {
        // if (arr1.length > arr2.length) {
        //     return 1;
        // } else if (arr1.length < arr2.length) {
        //     return -1;
        // } else {
        //     int sum1 = 0;
        //     int sum2 = 0;
        //     for (int i=0; i<arr1.length; i++) {
        //         sum1 += arr1[i];
        //         sum2 += arr2[i];
        //     }
        //     return sum1 > sum2 ? 1 : sum1 < sum2? -1 : 0;
        // }
        int answer = Integer.compare(arr1.length, arr2.length);
        if (answer == 0) {
            answer = Integer.compare(IntStream.of(arr1).sum(), IntStream.of(arr2).sum());
        }
        return answer;
    }
}