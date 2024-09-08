package Entity;

public class Data {
    private int day;
    private int month;
    private int year;

    // Constructor to initialize the date
    public Data(int day, int month, int year) {
        this.setYear(year);   // Set year first because leap year affects day validation in February
        this.setMonth(month); // Set month second
        this.setDay(day);     // Set day last to use correct month/year validation
    }

    public Data (String data) {
        String[] partes = data.split("/");
        this.setDay(Integer.parseInt(partes[0]));
        this.setMonth(Integer.parseInt(partes[1]));
        this.setYear(Integer.parseInt(partes[2]));
    }

    // Getter for day
    public int getDay() {
        return day;
    }

    // Setter for day with validation based on month and year (leap years)
    public void setDay(int day) {
        if (day >= 1 && day <= getDaysInMonth()) {
            this.day = day;
        } else {
            throw new IllegalArgumentException("Invalid day for the month. Day must be between 1 and " + getDaysInMonth());
        }
    }

    // Getter for month
    public int getMonth() {
        return month;
    }

    // Setter for month with validation
    public void setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            throw new IllegalArgumentException("Invalid month. Month must be between 1 and 12.");
        }
    }

    // Getter for year
    public int getYear() {
        return year;
    }

    // Setter for year (you can add custom validation if needed)
    public void setYear(int year) {
        if (year >= 0) {
            this.year = year;
        } else {
            throw new IllegalArgumentException("Invalid year. Year must be a positive number.");
        }
    }

    // Method to get the number of days in the current month (taking leap years into account)
    private int getDaysInMonth() {
        switch (this.month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapYear() ? 29 : 28;
            default:
                throw new IllegalArgumentException("Invalid month.");
        }
    }

    // Method to check if the current year is a leap year
    private boolean isLeapYear() {
        return (this.year % 4 == 0 && this.year % 100 != 0) || (this.year % 400 == 0);
    }

    // Method to print the date in a readable format
    public String formatDate() {
        return String.format("%02d/%02d/%04d", day, month, year);
    }
}
