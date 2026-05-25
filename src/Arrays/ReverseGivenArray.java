/*
*
Problem Statement: You are given an array. The task is to reverse the array and print it.

* Input: N = 5, arr[] = {5,4,3,2,1}
Output: {1,2,3,4,5}
Explanation: Since the order of elements gets reversed the first element will occupy the fifth position, the second element occupies the fourth position and so on.

Input: N=6 arr[] = {10,20,30,40}
Output: {40,30,20,10}
Explanation: Since the order of elements gets reversed the first element will occupy the fifth position, the second element occupies the fourth position and so on.
*
* */

void main(){

    Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    int[] arr = new int[N];
    for (int i = 0; i < N; i++) {
        arr[i] = in.nextInt();
    }
    int left = 0;
    int right = arr.length -1;
    while (left < right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
        right--;
    }
    for (int num : arr){
        System.out.print(num + " ");
    }
}