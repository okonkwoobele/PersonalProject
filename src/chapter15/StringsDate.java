package chapter15;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class StringsDate {
    public static void main(String args[]){
        String dateBefore = "2021-07-10";
        System.out.println(dateBefore+" is the date before adding days");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        try{
            cal.setTime(sdf.parse(dateBefore));
        }catch(ParseException e){
            e.printStackTrace();
        }
        cal.add(Calendar.DAY_OF_MONTH, 3);
        String dateAfter = sdf.format(cal.getTime());
    }
}
