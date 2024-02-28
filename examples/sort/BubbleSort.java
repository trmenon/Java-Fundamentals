package core.examples.sort;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {1,34,65,123,76,34,21,66,900,4};
        int i,j, temp;
        for(i=0;i<10;i++) {
            for(j=i+1;j<10;j++) {
                if(arr[i]> arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("After sorting");
        for(i=0;i<10;i++) {
            System.out.print(arr[i]);
            if(i!=9) {
                System.out.print("->");
            }
        }
    }
}
