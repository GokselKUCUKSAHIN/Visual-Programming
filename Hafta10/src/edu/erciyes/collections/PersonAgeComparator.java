package edu.erciyes.collections;

import java.util.Comparator;

public class PersonAgeComparator implements Comparator<Person>
{

    @Override
    public int compare(Person person, Person other)
    {
        return person.getAge() - other.getAge();
    }


}
