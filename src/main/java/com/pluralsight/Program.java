package com.pluralsight;

import com.pluralsight.streams.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Person> people = new ArrayList<>();

        Person person1 = new Person("Aidan", "Kennedy", 23);
        Person person2 = new Person("Harley", "Wallace", 27);
        Person person3 = new Person("Declan", "Brown", 19);
        Person person4 = new Person("Lewis", "Wilkinson", 44);
        Person person5 = new Person("Oliver", "Thomson", 87);
        Person person6 = new Person("Edgar", "Spencer", 32);
        Person person7 = new Person("Brecken", "Daugherty", 29);
        Person person8 = new Person("Ace", "Kent", 51);
        Person person9 = new Person("Kymani", "Cantu", 68);
        Person person10 = new Person("Zaid", "Hancock", 76);

        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);
        people.add(person6);
        people.add(person7);
        people.add(person8);
        people.add(person9);
        people.add(person10);

        String firstOrLast;
        String first;
        String last;

        System.out.print("Search by First or Last (F/L): ");
        firstOrLast = scan.nextLine();

        List<Person> searchResults = new ArrayList<>();

        if(firstOrLast.equalsIgnoreCase("f")){
            System.out.print("Please enter the first name: ");
            first = scan.nextLine();

            for (Person person : people) {
                if(first.equalsIgnoreCase(person.getFirstName())){
                    searchResults.add(person);
                }
            }
        }

        if(firstOrLast.equalsIgnoreCase("l")){
            System.out.print("Please enter the last name: ");
            last = scan.nextLine();

            for (Person person : people) {
                if(last.equalsIgnoreCase(person.getLastName())){
                    searchResults.add(person);
                }
            }
        }
        for (Person searchResult : searchResults) {
            System.out.println(searchResult);
        }
        int totalAge = 0;
        int youngestAge = person1.getAge();

        for (Person person : people) {
            totalAge += person.getAge();
            if(person.getAge() < youngestAge){
                youngestAge = person.getAge();
            }
        }
        System.out.println("Total age of all the people: " + totalAge);
        System.out.println("Youngest age of all the people: " + youngestAge);
    }

}


