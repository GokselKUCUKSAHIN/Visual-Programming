package edu.erciyes.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Person implements Comparable<Person>
{

    private String tcNo;
    private String name;
    private int age;

    public Person(String tcNo, String name, int age)
    {
        this.tcNo = tcNo;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person other)
    {
        return tcNo.compareTo(other.tcNo);
    }

    @Override
    public String toString()
    {
        return tcNo + " " + name + " " + age;
    }

    public static void main(String[] args)
    {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("1020", "Ali", 20));
        people.add(new Person("2000", "Veli", 18));
        people.add(new Person("1000", "Can", 40));
        System.out.println(people);

        Collections.sort(people);
        System.out.println(people);

        PersonAgeComparator ageComparator = new PersonAgeComparator();
        Collections.sort(people, ageComparator);
        System.out.println(people);

        Collections.shuffle(people);
        System.out.println(people);

    }

    public int getAge()
    {
        return age;
    }
}
