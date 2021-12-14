package net.htlgrieskirchen.pos3.timeutil;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import static java.time.temporal.TemporalQueries.zone;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;


public class TimeUtilPro
{   
    TimeUtilPro() {
    }

    // ########## LOCALDATE METHODS ##########
    
    
    public static LocalDate intToLocalDate(int date) {
        String number = String.valueOf(date);
        
        String[] digits = number.split("(?<=.)");
        String year = (digits[0] + digits[1] + digits[2] + digits[3]);
        int iYear = Integer.parseInt(year);
        String month = (digits[4] + digits[5]);
        int iMonth = Integer.parseInt(month);
        String days = (digits[6] + digits[7]);
        int iDays = Integer.parseInt(days);
        LocalDate a = LocalDate.of(iYear, iMonth, iDays);
        return a;
    }

    public static LocalDate longToLocalDate(long dateTime) {
        String number = String.valueOf(dateTime);
         String[] digits = number.split("(?<=.)");
        String year = (digits[0] + digits[1] + digits[2] + digits[3]);
        int iYear = Integer.parseInt(year);
        String month = (digits[4] + digits[5]);
        int iMonth = Integer.parseInt(month);
        String days = (digits[6] + digits[7]);
        int iDays = Integer.parseInt(days);
        
        
        LocalDate a = LocalDate.of(iYear, iMonth, iDays);
        return a;
        
    }
    
    public static LocalDate dateToLocalDate(Date dateTime) {
        LocalDate a = LocalDate.ofInstant(dateTime.toInstant(), ZoneId.systemDefault());
        return a;
    }
    
    public static LocalDate calendarToLocalDate(Calendar dateTime) {
        LocalDate a = LocalDate.ofInstant(dateTime.toInstant(), ZoneId.systemDefault());
        return a;
    }
    
    // ########## LOCALDATETIME METHODS ##########
            
    public static LocalDateTime intToLocalDateTime(int date) {
        String number = String.valueOf(date);
        
        String[] digits = number.split("(?<=.)");
        String year = (digits[0] + digits[1] + digits[2] + digits[3]);
        int iYear = Integer.parseInt(year);
        String month = (digits[4] + digits[5]);
        int iMonth = Integer.parseInt(month);
        String days = (digits[6] + digits[7]);
        int iDays = Integer.parseInt(days);
        LocalDateTime a = LocalDateTime.of(iYear, iMonth, iDays, 0, 0);
        return a;
    }
    
    public static LocalDateTime longToLocalDateTime(long dateTime) {
         String number = String.valueOf(dateTime);
        
        String[] digits = number.split("(?<=.)");
        String year = (digits[0] + digits[1] + digits[2] + digits[3]);
        int iYear = Integer.parseInt(year);
        String month = (digits[4] + digits[5]);
        int iMonth = Integer.parseInt(month);
        String days = (digits[6] + digits[7]);
        int iDays = Integer.parseInt(days);
        String hours = (digits[8] + digits[9]);
        int iHours = Integer.parseInt(hours);
        String minutes = (digits[10] + digits[11]);
        int iMinutes = Integer.parseInt(minutes);
        LocalDateTime a = LocalDateTime.of(iYear, iMonth, iDays, iHours, iMinutes);
        return a;
    }
      
    public static LocalDateTime dateToLocalDateTime(Date dateTime) {
        LocalDate a = LocalDate.ofInstant(dateTime.toInstant(), ZoneId.systemDefault());
        LocalDateTime ret = a.atTime(dateTime.getHours(), dateTime.getMinutes());
        return ret;
    }
    
    public static LocalDateTime calendarToLocalDateTime(Calendar dateTime) {
        LocalDateTime a = LocalDateTime.ofInstant(dateTime.toInstant(), ZoneId.systemDefault());
        return a;
    }
           
    // ########## INT METHODS ##########
    
    public static int localDateToInt(LocalDate date) {
        String years = String.valueOf(date.getYear());
        String month = String.valueOf(date.getMonth().getValue());
        String days = String.valueOf(date.getDayOfMonth());
        String zero = "0";
        String ret = years+ zero + month+ zero +days;
        return Integer.parseInt(ret);
    }

    public static int localDateTimeToInt(LocalDateTime dateTime) {
        String years = String.valueOf(dateTime.getYear());
        String month = String.valueOf(dateTime.getMonth().getValue());
        String days = String.valueOf(dateTime.getDayOfMonth());
        
        String zero = "0";
        String ret = years+ zero + month+ zero +days;
        return Integer.parseInt(ret);
    }

    // ########## LONG METHODS ##########
    
    public static long localDateToLong(LocalDate date) {
        String years = String.valueOf(date.getYear());
        String month = String.valueOf(date.getMonth().getValue());
        String days = String.valueOf(date.getDayOfMonth());
        String zero = "0";
        String ret = years+ zero + month+ zero +days;
        return Long.parseLong(ret);
    }

    public static long localDateTimeToLong(LocalDateTime dateTime) {
        String years = String.valueOf(dateTime.getYear());
        String month = String.valueOf(dateTime.getMonth().getValue());
        String days = String.valueOf(dateTime.getDayOfMonth());
        String hour = String.valueOf(dateTime.getHour());
        String minute = String.valueOf(dateTime.getMinute());
        String zero = "0";
        String ret = years+ zero + month+ zero +days+hour+minute;
        return Long.parseLong(ret);
    }

    // ########## DATE METHODS ##########
    
    @SuppressWarnings("deprecation")
    public static Date localDateToDate(LocalDate date) {
        Date d = new Date();
        d.setYear(date.getYear());
        d.setMonth(date.getMonth().getValue());
        d.setDate(date.getDayOfMonth());
        return d;
    }

    @SuppressWarnings("deprecation")
    public static Date localDateTimeToDate(LocalDateTime dateTime) {
        Date d = new Date();
        d.setYear(dateTime.getYear());
        d.setMonth(dateTime.getMonth().getValue());
        d.setDate(dateTime.getDayOfMonth());
        d.setHours(dateTime.getHour());
        d.setMinutes(dateTime.getMinute());
        return d;
    }

    // ########## CALENDAR METHODS ##########
    
    public static Calendar localDateToCalendar(LocalDate date) {
        Calendar c = new GregorianCalendar(date.getYear(), date.getMonth().getValue(), date.getDayOfMonth());
        return c;
    }

    public static Calendar localDateTimeToCalendar(LocalDateTime dateTime) {
        Calendar c = new GregorianCalendar(dateTime.getYear(), dateTime.getMonth().getValue(), dateTime.getDayOfMonth(), dateTime.getHour(), dateTime.getMinute());
        return c;
    }

}
