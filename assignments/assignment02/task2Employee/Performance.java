package core.assignments.assignment02.task2Employee;

public class Performance {
    int [] monthlyCredits; 
    int mappingKey;

    public Performance(int mapppingKey) {
        this.mappingKey = mapppingKey;
        this.monthlyCredits = new int[12];
        for(int i=0;i<12; i++) {this.monthlyCredits[i] = 0;}
    }

    public int getConsolidatedCredits(int multiplier) {
        int credits = 0;
        for(int value: this.monthlyCredits) {credits += (multiplier*value);}
        return credits;
    }

    public void setMonthlyCredit (int month, int value) {
        if(month >= 0 && month <12) {
            this.monthlyCredits[month] = value;
        }
    }

    public void generateReport() {
        for(int iterator= 0; iterator<12; iterator++) {
            System.out.println(generateMonthString(iterator) + "\t:\t" + this.monthlyCredits[iterator]);
        }
    }

    private String generateMonthString(int number) {
        String monthString;
        switch (number) {
            case 0:
                monthString = "Jan";
                break;
            case 1:
                monthString = "Feb";
                break;
            case 2:
                monthString = "Mar";
                break;
            case 3:
                monthString = "Apr";
                break;
            case 4:
                monthString = "May";
                break;
            case 5:
                monthString = "Jun";
                break;
            case 6:
                monthString = "Jul";
                break;
            case 7:
                monthString = "Aug";
                break;
            case 8:
                monthString = "Sep";
                break;
            case 9:
                monthString = "Oct";
                break;
            case 10:
                monthString = "Nov";
                break;
            case 11:
                monthString = "Dec";
                break;
            default:
                monthString = "Undefined month";
                break;
        }
        return monthString;
    }
}

