package com.homework4.homework;

//read number of HTTP Error (400, 401,402, ...) and write the name of this error (Declare enum HTTPError)

import java.util.Locale;
import java.util.Scanner;

enum HTTPResponce {
    ERROR401("Unauthorized"), ERROR404("Not Found");
        private int description;
    //
        private HTTPResponce(String num){
            this.description = description;
        }
        }
public class EnumHTTPError {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Code = ");
        String code = sc.nextLine();
        HTTPResponce httpRes = null;
        try {
            httpRes = HTTPResponce.valueOf(code.toUpperCase(Locale.ROOT));
        }catch (Exception e){

        }
        if( httpRes != null){
            System.out.println("Description = " + httpRes);
        }else{
            System.out.println("Invalid code");
        }
    }

}
