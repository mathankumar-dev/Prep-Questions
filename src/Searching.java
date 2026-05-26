
void linearSearch(int[] arr , int searchElement){
    boolean found = false;
    for(int num : arr){
        if(num == searchElement){
            found = true;
            break;
        }
    }
    if(found){
        System.out.println("Element Found");
    }else{
        System.out.println("Element Not Found");
    }
}

void binarySearch(int[] arr , int searchElement ){
    boolean found = false;
    int left = 0 ;
    int right = arr.length - 1;


    while (left <= right){
    int mid = left + (right - left) / 2;
        if(searchElement == arr[mid]) {found = true; break;}
        else if(searchElement > arr[mid]){
            left = mid + 1;
        }else{
            right = mid - 1;
        }
    }
    if(found){
        System.out.println("Element Found");
    }else{
        System.out.println("Element Not Found");
    }
}

void main(){
    int[] arr = {5,7,8,9,10};
    int searchElement = 45;
    System.out.println("Linear Search");
    linearSearch(arr,searchElement);
    System.out.println("Binary Search");
    binarySearch(arr,searchElement);
}