/*
A smart city traffic system records vehicle counts at checkpoints.
The city authority wants to identify the checkpoint with
the highest traffic count and the second highest traffic count.

Write a program to print the second largest distinct element.

Input Format
First line contains integer N
Second line contains N space-separated integers
Constraints
2 <= N <= 10^5
Sample Input
5
10 20 5 8 20
Sample Output
10
* */

void main(){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter N :");
    int N = in.nextInt();
    int[] arr = new int[N];
    for (int i = 0; i < N; i++) {
        arr[i] = in.nextInt();
    }
    int fmax = Integer.MIN_VALUE;
    int smax = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length ; i++) {
        if(arr[i] > fmax) {
            smax = fmax;
            fmax = arr[i];
        }
        else if (arr[i] > smax && arr[i] != fmax) {
            smax = arr[i];
        }
        System.out.println("array index :" + i + " value : " + arr[i]);
        System.out.println("fmax =" + fmax);
        System.out.println("smax =" + smax);
    }

    System.out.println(smax);

}