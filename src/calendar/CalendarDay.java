package calendar;

public class CalendarDay {


    private final int day;
    private final int month;
    private final int year;
    private String notes;


    public CalendarDay(int year, int month, int day) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public boolean hasNote () {
        return notes != null && !"".equals(notes);
    }

    @Override
    public String toString() {
        return "CalendarDay{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                ", notes='" + notes + '\'' +
                '}';
    }

    public void setNotes(String notes) {
        this.notes = notes;
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

    public String getNotes() {
        return notes;
    }
}
