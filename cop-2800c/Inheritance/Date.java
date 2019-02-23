/*
* File: Date.java
* Name: David Bruno
* Date: 2/22/19
*/

public class Date {
    private int month;
    private int day;
    private int year;

    public Date(int month, int day, int year) {
        setMonth(month);
        setDay(day);
        setYear(year);
    }

    public Date(String date) {
        String temp[] = date.split("/");

        if (temp.length == 3) {
            setMonth(Integer.parseInt(temp[0]));
            setDay(Integer.parseInt(temp[1]));
            setYear(Integer.parseInt(temp[2]));
        } else {
            System.out.println("Invalid date. Using 1/1/2000.");
            setMonth(1);
            setDay(1);
            setYear(2000);
        }
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return month + "/" + day + "/" + year;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;

        if (!(obj instanceof Date))
            return false;

        Date dObj = (Date) obj;
        if (this.month == dObj.getMonth() && this.day == dObj.getDay() && this.year == dObj.getYear())
            return true;

        return false;
    }
}