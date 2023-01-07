/* Create a class called Date that includes three pieces of information as instance
variables—a month (typeint), a day (typeint) and a year (typeint). Your class
should have a constructor that initializes the three instance variables and
assumes that the values provided are correct. Provide a set and a get method
for each instance variable. Provide a method displayDate that displays the
month, day and year separated by forward slashes(/). Write a test application
named DateTest that demonstrates classDate’s capabilities. */


class Date{
    private int month, day, year;

    public Date(int InputMonth, int InputDay, int InpurYear) {
        this.month = InputMonth;
        this.day = InputDay;
        this.year = InpurYear;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int InputMonth) {
        this.month = InputMonth;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int InputDay) {
        this.day = InputDay;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int InputYear) {
        this.year = InputYear;
    }
    public void displayDate() {
        System.out.printf("%d / %d/ %d", getMonth(),getDay(),getYear());
    }
}
public class DateTest {
    public static void main(String[] args) {
        Date D = new Date(2,15,2022);
        D.displayDate();
    }

}
