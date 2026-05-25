/*
* A company tracks employee productivity scores daily.
* HR wants to identify how many continuous periods have a total productivity score exactly equal to K.

Given an integer array representing daily productivity scores,
return the number of continuous subarrays whose sum equals K.

Input Format
First line contains integer N
Second line contains N integers
Third line contains integer K
Sample Input
5
1 2 3 -2 2
3

Sample Output
4
*
* */

void main(){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter N:");
    int N =  in.nextInt();
    int[] arr = new int[N];
    for (int i = 0; i < N; i++) {
        arr[i] =  in.nextInt();
    }
    System.out.println("Enter K :");
    int K = in.nextInt();

    Map<Integer,Integer> map = new HashMap<>();
    map.put(0,1);
    int sum = 0;
    int count = 0;
    for (int i = 0; i < arr.length ; i++) {
        sum += arr[i];

        if(map.containsKey(sum - K)){
            count += map.get(sum - K);
        }
        map.put(sum , map.getOrDefault(sum , 0)+1);
    }
    System.out.println(count);
}
