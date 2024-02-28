package core.assignments.assignment03.insertionsortdemo;

class InsertionSort {
    int numList[];
    public InsertionSort(int num[]) {
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
        int temp, pos = 0;
        for(int i=0; i<this.numList.length-1;i++) {
            pos = i;
            if(this.numList[i]> this.numList[i+1]) {
                temp = this.numList[i+1];
                for(int j=i;j>=0;j--) {
                    if(temp<this.numList[j]) {
                        this.numList[j+1] = this.numList[j];
                        pos=j;
                    }
                }
                this.numList[pos] = temp;
            }
        }
        this.display();
    }
}

public class InsertionSortDemo {
    public static void main(String[] args) {
        int array[] = {23,11,65,432,78,55,10,6,39,75,21};
        InsertionSort object = new InsertionSort(array);
        object.display();
        object.sort();
    }
    
}
