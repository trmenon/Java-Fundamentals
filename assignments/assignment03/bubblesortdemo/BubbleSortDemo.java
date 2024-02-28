package core.assignments.assignment03.bubblesortdemo;

class BubbleSort {
    int numList[];
    public BubbleSort(int num[]) {
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
        boolean isSorted = false;
        int temp, i;
        do {
            isSorted = true;
            for(i=0;i<this.numList.length-1;i++) {                
                if(this.numList[i]> this.numList[i+1]) {
                    isSorted = false;
                    temp = this.numList[i];
                    this.numList[i] = this.numList[i+1];
                    this.numList[i+1] = temp;
                }
            }
        }while(isSorted == false);
        System.out.println("After sorting");
        this.display();
        
    }
}

public class BubbleSortDemo {
    public static void main(String[] args) {
        int array[] = {23,11,65,432,78,55,10,6,39,75,21};
        BubbleSort object = new BubbleSort(array);
        object.display();
        object.sort();
    }
}

