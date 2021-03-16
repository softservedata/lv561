package com.percifalll._04_condition_statements.homework;

/**
 * Solve the next tasks:
 * 1) read 3 float numbers and check: are they all belong to the range [-5,5];
 * 2) read 3 integer numbers and write max and min of them;
 * 3) read number of HTTP Error (400, 401,402, ...) and write the name of this error (Declare enum HTTPError)
 */

public class Tasks {
    public static void main(String[] args) {
        // task 1.1
        double[] floats = new double[]{
                5.3, 2.4, 1.4, -3.5, 7.3, 9.6, 23.1
        };

        boolean[] isInRange = findInRange(floats, -5, 5);

        for (int i = 0; i < floats.length; i++){
            System.out.printf("%5.3f %s\n", floats[i], isInRange[i]);
        }
        System.out.println("\n\t***\n");

        // task 1.2
        int[] ints = new int[]{
                -2, 4, 3, 7, 20, -3, -4, 8
        };

        int[] minAndMax = findMinAndMax(ints);
        System.out.printf( "Min = %d\nMax = %d\n", minAndMax[0], minAndMax[1]);
        System.out.println("\n\t***\n");

        // task 1.3
        int[] errorsCodes = new int[]{
                400, 401, 402, 403, 404
        };

        for (int error : errorsCodes){
            System.out.printf("%d %s\n", error, HTTPError.getError(error).getNameOfError());
        }
    }

    //  *** *** *** ***

    public static boolean[] findInRange(double[] array, double left, double right){
        boolean[] isInRange = new boolean[array.length];

        for (int i = 0; i < array.length; i++){
            if ((array[i] >= left) && (array[i]) < right){
                isInRange[i] = true;
            }
            else{
                isInRange[i] = false;
            }
        }

        return isInRange;
    }

    public static int[] findMinAndMax(int[] array){
        int max = array[0],
            min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
            else if (array[i] < min){
                min = array[i];
            }
        }

        return new int[] {min, max};
    }

    public enum HTTPError{
        _400("Bad request"),
        _401("Unauthorized "),
        _402("Payment Required"),
        _403("Forbidden"),
        _404("Not Found");

        private String nameOfError;

        HTTPError(String nameOfError){
            this.nameOfError = nameOfError;
        }

        public String getNameOfError(){
            return nameOfError;
        }

        public static HTTPError getError(int number){
            return HTTPError.values()[number - 400];
        }
    }
}
