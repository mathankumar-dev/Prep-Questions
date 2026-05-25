/*
A warehouse contains boxes represented as integers in an array.
Empty spaces are represented by 0. The warehouse manager wants all
empty spaces shifted to the end while maintaining the relative order of non-empty boxes.

Write a program to perform this rearrangement.

Input Format
First line contains integer N
Second line contains N integers
Sample Input
6
0 1 0 3 12 0
Sample Output
1 3 12 0 0 0

* */

void main(){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter N :");
    int N = in.nextInt();
    int[] arr = new int[N];
    for (int i = 0; i < N; i++) {
        arr[i] = in.nextInt();
    }
    int left = 0;
    for (int right = 0; right < N; right++) {
        if(arr[right] != 0){
            int temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
            left++;
        }
    }
    for(int num : arr){
        System.out.print(num + " ");
    }
}