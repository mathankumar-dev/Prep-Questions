/*
*
A telecom company records signal strengths every second. Engineers need to identify the maximum sum obtainable from any continuous segment of readings.

Write a program to determine the maximum subarray sum.

Sample Input
8
-2 -3 4 -1 -2 1 5 -3
Sample Output
7
*
* */

void main(){
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    int[] arr = new int[N];
    for (int i = 0; i < N; i++) {
        arr[i] = in.nextInt();
    }
    int currentSum = 0;
    int maxSum = Integer.MIN_VALUE;
    for (int num : arr){
        currentSum += num;
        if(currentSum > maxSum) maxSum = currentSum;

        if (currentSum < 0) currentSum = 0;
    }

    System.out.println(maxSum);
}