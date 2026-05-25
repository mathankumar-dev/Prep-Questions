/*

A bank stores transaction IDs as integers. Due to a synchronization issue, one transaction ID appears twice while all others appear once.

Find the duplicate transaction ID.

Input Format
First line contains integer N
Second line contains N integers
Sample Input
6
1 3 4 2 2 5
Sample Output
2


* */

void main(){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num , map.getOrDefault(num , 0)+1);
        }

        int duplicateValue = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > 1) {
                duplicateValue = entry.getKey();
                break;
            }
        }
        System.out.println(duplicateValue);
}