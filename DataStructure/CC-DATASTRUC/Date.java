public class Date 
{
    int month;
    int day;
    int year;

    public void setDate(int setMonth, int setDay, int setYear)
    {
        month = setMonth;
        day = setDay;
        year  = setYear;
    }

    public String getDate()
    {
        StringBuilder date = new StringBuilder();
        return date.append(month).append(" ").append(day).append(" ").append(year).toString();
    }
}
