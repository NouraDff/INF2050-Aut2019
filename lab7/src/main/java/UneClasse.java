package com.company;


import org.apache.commons.io.FilenameUtils;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class UneClasse {

    public static  String getFileNameFromPath(String path){
        Path path1 = Paths.get(path);
        Path fileName = path1.getFileName();
        return fileName.toString();
    }

    public  static  String getExtensionFromPath(String path){
        return  FilenameUtils.getExtension(path);
    }

    public static  String getDateToString(String date) throws ParseException {
        Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(date);
        SimpleDateFormat formatter = new SimpleDateFormat("dd MMMM yyyy");
        return  formatter.format(date1);
    }

    public static int getRandomNumberMinMax(int min, int max){
        Random r = new Random();
        return r.nextInt((max - min) +1 ) + min;
    }


    public static String cipher(String msg, int shift){
        String s = "";
        int len = msg.length();
        for(int x = 0; x < len; x++){
            char c = (char)(msg.charAt(x) + shift);
            if (c > 'z')
                s += (char)(msg.charAt(x) - (26-shift));
            else
                s += (char)(msg.charAt(x) + shift);
        }
        return s;
    }

    public static String deCipher(String msg, int shift){
        return  cipher(msg, 26-shift);
    }

    public static int getAge(String dateBorn, String dateNow) throws ParseException{
        Date d1 = new SimpleDateFormat("yyyy-MM-dd").parse(dateBorn);
        Date d2 = new SimpleDateFormat("yyyy-MM-dd").parse(dateNow);
        LocalDate date1 = d1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate date2 = d2.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        Period period = Period.between(date1, date2);

        return period.getYears();
    }
}
