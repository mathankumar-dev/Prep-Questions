/*

A digital library stores book IDs in a string format. The librarian wants to determine whether the entered book code is a palindrome.

Sample Input
MADAM
Sample Output
Palindrome

* */

void main(){
    Scanner in = new Scanner(System.in);
    String str = in.nextLine().toLowerCase();
    char[] strCharacters = str.toCharArray();
    int left =0;
    int right = strCharacters.length - 1;
    boolean isPalindrome = true;
    while(left <= right){
        if(strCharacters[left] != strCharacters[right]){
            isPalindrome = false;
            break;
        }
        left++;
        right--;
    }
    System.out.println(isPalindrome ? "Palindrome" : "Not Palindrome");
}