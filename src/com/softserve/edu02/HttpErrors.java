package com.softserve.edu02;


import java.util.Scanner;

public class HttpErrors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter error number: ");
        int number = scanner.nextInt();
        if (number >= 400 && number <= 410) {
            switch (number) {
                case 400:
                    System.out.println("Error: "+Error.BadRequest.toString());
                    break;
                case 401:
                    System.out.println("Error: "+Error.Unauthorized.toString());
                    break;
                case 402:
                    System.out.println("Error: "+Error.PaymentRequired.toString());
                    break;
                case 403:
                    System.out.println("Error: "+Error.Forbidden.toString());
                    break;
                case 404:
                    System.out.println("Error: "+Error.NotFound.toString());
                    break;
                case 405:
                    System.out.println("Error: "+Error.MethodNotAllowed.toString());
                    break;
                case 406:
                    System.out.println("Error: "+Error.NotAcceptable.toString());
                    break;
                case 407:
                    System.out.println("Error: "+Error.ProxyAuthenticationRequired.toString());
                    break;
                case 408:
                    System.out.println("Error: "+Error.RequestTimeout.toString());
                    break;
                case 409:
                    System.out.println("Error: "+Error.Conflict.toString());
                    break;
                case 410:
                    System.out.println("Error: "+Error.Gone.toString());
                    break;
            }
        } else {
            System.out.println("You should enter number in range for 400 to 410 included both");
        }
    }


    public enum Error {
        BadRequest, Unauthorized , PaymentRequired, Forbidden, NotFound, MethodNotAllowed, NotAcceptable,
        ProxyAuthenticationRequired, RequestTimeout, Conflict, Gone
        }
}
