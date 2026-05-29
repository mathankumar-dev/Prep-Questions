
//Problem : Count Zeroes in the given Number.
//void main(){
//    int Number = 1002004005;
//    int count = 0;
//    while (Number > 0){
//        int d= Number % 10;
//        Number /= 10;
//        if(d == 0) count++;
//    }
//    System.out.println(count);
//}

void main(){
    int Number = 0;
    int count = 0;
    if(Number == 0) count = 1;
    else count = countZeroes(Number);
    System.out.println(count);
}
int countZeroes(int num){
    if(num == 0) return 0;
    int d = num % 10;
    if(d == 0) return 1 + countZeroes(num / 10);
    return countZeroes(num / 10);
}

