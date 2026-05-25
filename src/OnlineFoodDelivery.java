/*
*
A restaurant receives orders throughout the day. Each order has a preparation time represented by an integer array arr[]. The restaurant manager wants to identify the longest continuous sequence of orders such that the total preparation time does not exceed K minutes.
Write a program to determine the maximum number of consecutive orders that can be processed within K minutes.

Input Format
First line contains integer N representing number of orders.
Second line contains N space-separated integers.
Third line contains integer K.
Output Format

Print the maximum number of consecutive orders.

Constraints
1 <= N <= 10^5
1 <= arr[i] <= 10^4
Sample Input
7
1 2 1 0 1 1 0
4
Sample Output
5
*
*
* */


void main() {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter Number of Orders : ");
    int N = in.nextInt(); // number of orders

    int[] arr = new int[N];
    for (int i = 0; i < N; i++) {
        arr[i] = in.nextInt();
    }

    int K = in.nextInt();
    int left = 0;
    int maxLen = 0 ;
    int sum = 0;
    for (int right = 0; right < arr.length ; right++) {
        sum += arr[right];
        while(sum > K){
            sum -= arr[left];
            left++;
        }
        maxLen = Math.max(maxLen,right - left +1);
    }

    System.out.println(maxLen);
}
