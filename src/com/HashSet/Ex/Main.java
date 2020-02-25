package com.HashSet.Ex;

import java.util.HashSet;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        //Assignment1: Write a Java program to append the specified element to the end of a hash set
//        System.out.println("Exercice 1 from HashMap");
//        HashSet<Integer> set1 = new HashSet<Integer>();
//        for ( int i=0; i<=1000; i++){
//            set1.add(i);
//        }

//        appendElToSet(set1, 1506);


        //Assignment2: Write a Java program to iterate through all elements in a hash list
        HashSet<String> hs = new HashSet<String>();
        hs.add("Welcome");
        hs.add("to");
        hs.add("my");
        hs.add("HashMap");
        hs.add("and");
        hs.add("another");
        hs.add("words");
        System.out.println("My HashMap is " + hs);
        Iterator value = hs.iterator();
        System.out.println("My iterator values are: ");
        while (value.hasNext()){
            System.out.println(value.next());
        }


        //Assignment3: Write a Java program to get the number of elements in a hash set
        System.out.println("Size of the Hash Set is: " + hs.size());


        //Assignment3: Write a Java program to empty an hash set
//        hs.removeAll(hs);
//        System.out.println("My Hash Set after removing is " + hs);


        //Assignment4: Write a Java program to test a hash set is empty or not
        System.out.println("Checking if it's empty " + hs.isEmpty());


        //Assignment5: Write a Java program to clone a hash set to another hash se
        HashSet <String> newHs = new HashSet <String>();
        newHs = (HashSet)hs.clone();
        System.out.println("Colned Hash Set: " + newHs);


//        //Assignment7: Write a Java program to compare two hash set
        HashSet <String> hs2 = new HashSet<String>();
        hs2.add("Welcome");
        hs2.add("here");
        hs2.add("my");
        HashSet<String>result= new HashSet<String>();
        for (String element : hs) {
            System.out.println(hs2.contains(element) ? "Yes" : "No");
        }

        //Assignment8: Write a program to remove all the elements from a hash set
        System.out.println("Original hash set contains: "+ hs );
        hs.clear();
        System.out.println("HashSet content: " + hs );

   }
}

