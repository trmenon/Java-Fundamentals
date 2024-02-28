package core;

public class ForEachDemo {
    public static void main(String[] args) {
        int [] nums = {1,3,5,7,9};
        int sum = 0;
        for(int item: nums) {
            sum += item;
        } 
        System.out.println("Sum of elements of nums array is " + sum);
    }
}
