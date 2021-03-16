package com.percifalll._09_collections.practical;

import java.util.*;

public class PracticalTask1 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> myCollection, newCollection;

        myCollection = new ArrayList<>();

        // Filling collection
        for(int i = 0; i < 10; i++){
            myCollection.add( random.nextInt(40) -10);
        }

        // Printing first collection
        System.out.println(Arrays.toString(myCollection.toArray()) + "\n");

        // Finding values greated than 5
        newCollection = findGreaterThan(myCollection, 5);

        // Printing second collection
        System.out.println(Arrays.toString(newCollection.toArray()) + "\n");

        // Deleting values greater than 20
        deleteGreaterThan(myCollection, 20);
        System.out.println(Arrays.toString(myCollection.toArray()) + "\n");

        // Inserting values [1, -3, -4] on positions [2, 8, 5]
        int[] positions, values;
        positions = new int[] {2, 5, 8};
        values = new int[] {1, -4, -3};

        insertOnPositions(myCollection, positions, values);

        System.out.println(Arrays.toString(myCollection.toArray()) + "\n");

        // Sorting and final output
        Collections.sort(myCollection);
        System.out.println("\t***");
        System.out.println(Arrays.toString(myCollection.toArray()) + "\n");
    }

    public static List<Integer> findGreaterThan(List<Integer> list, int bound){
        List<Integer> newList = new LinkedList<>();
        int i = 0;

        for (Integer item : list){
            if (item > bound)
                newList.add(i);
            i++;
        }

        return newList;
    }

    public static void deleteGreaterThan(Collection<Integer> collection, int bound){
        Iterator<Integer> iterator = collection.iterator();

        while(iterator.hasNext()){
            Integer element = (Integer) iterator.next();
            if (element > bound){
                iterator.remove();
            }
        }
    }

    public static void insertOnPositions(List<Integer> list, int[] positions, int[]values){
        for (int i = 0; i < positions.length; i++){
            list.add(positions[i], values[i]);
        }
    }
}

