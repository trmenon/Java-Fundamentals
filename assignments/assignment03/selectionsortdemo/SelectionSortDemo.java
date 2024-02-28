package core.assignments.assignment03.selectionsortdemo;

import core.examples.sort.BubbleSort;

class SelectionSort {
    int numList[];
    public SelectionSort(int num[]) {
        this.numList = num;
    }

    public void display() {
        System.out.println("Current state of array");
        for(int i=0;i<this.numList.length;i++) {
            System.out.print(this.numList[i]);
            if(i!= this.numList.length - 1) {
                System.out.print("->");
            }
        }
    }

    public void sort() {
        int temp;
        for(int i=0;i<this.numList.length;i++) {
            for(int j=i+1;j<this.numList.length;j++) {
                if(this.numList[i]> this.numList[j]) {
                    temp = this.numList[i];
                    this.numList[i] = this.numList[j];
                    this.numList[j] = temp;
                }
            }
        }
        System.out.println("After sorting");
        this.display();
    }
}
public class SelectionSortDemo {
    public static void main(String[] args) {
        int array[] = {23,11,65,432,78,55,10,6,39,75,21};
        SelectionSort object = new SelectionSort(array);
        object.display();
        object.sort();
    }
}
