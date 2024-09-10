package Entity;

public class Hour {
    private int hours;
    private int minutes;
    private int seconds;

    public Hour () {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }

    // Constructor for hours and minutes (24-hour format)
    public Hour(int hours, int minutes) {
        this.setHours(hours);
        this.setMinutes(minutes);
        this.seconds = 0; // Default value for seconds
    }

    // Constructor for hours, minutes, and seconds
    public Hour(int hours, int minutes, int seconds) {
        this.setHours(hours);
        this.setMinutes(minutes);
        this.setSeconds(seconds);
    }

    public Hour (String horarioInicio) {
        String[] partes = horarioInicio.split(":");
        this.setHours(Integer.parseInt(partes[0]));
        this.setMinutes(Integer.parseInt(partes[1]));
    }

    // Getter for hours
    public int getHours() {
        return hours;
    }

    // Setter for hours with validation (must be between 0 and 23)
    public void setHours(int hours) {
        if (hours >= 0 && hours < 24) {
            this.hours = hours;
        } else {
            throw new IllegalArgumentException("Invalid hour. Hours must be between 0 and 23.");
        }
    }

    // Getter for minutes
    public int getMinutes() {
        return minutes;
    }

    // Setter for minutes with validation (must be between 0 and 59)
    public void setMinutes(int minutes) {
        if (minutes >= 0 && minutes < 60) {
            this.minutes = minutes;
        } else {
            throw new IllegalArgumentException("Invalid minutes. Minutes must be between 0 and 59.");
        }
    }

    // Getter for seconds
    public int getSeconds() {
        return seconds;
    }

    // Setter for seconds with validation (must be between 0 and 59)
    public void setSeconds(int seconds) {
        if (seconds >= 0 && seconds < 60) {
            this.seconds = seconds;
        } else {
            throw new IllegalArgumentException("Invalid seconds. Seconds must be between 0 and 59.");
        }
    }

    // Method to format the time as HH:MM:SS
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}
