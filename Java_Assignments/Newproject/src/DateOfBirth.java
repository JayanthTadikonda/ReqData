public class DateOfBirth {

    private int day;
    private int month;
    private int year;

    public DateOfBirth(int day, int month, int year) {
        if(this.day == day && this.month == month){
            System.out.println("Already Existing");
            return;
        }
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return getDay()+ " - " + getMonth() + " - " + getYear();
    }

    public boolean equals(DateOfBirth obj) {
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        DateOfBirth dob = (DateOfBirth) obj;
        if((dob.day == this.day && dob.month == this.month))
            return false;
        return false;
    }

    @Override
    public int hashCode() {
        return this.day;
    }
}
