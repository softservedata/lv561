package com.homework11.homework;

  /*
   * 3. Create method to validate date according to format "mm.dd.yy"
   */



import java.text.SimpleDateFormat;
import java.util.Date;

public class ApplTime {
        public static void main(String[] args) {
            long currentTime = System.currentTimeMillis();
            Date date = new Date(currentTime);
            System.out.println("default: " + date);


            String myTime = new SimpleDateFormat("MM.dd.yy").format(date);
            System.out.println("Formatted date : " + myTime);
        }
    }
