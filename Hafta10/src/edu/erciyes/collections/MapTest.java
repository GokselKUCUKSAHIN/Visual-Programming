package edu.erciyes.collections;

import java.util.HashMap;
import java.util.Map;

public class MapTest
{

    public static void main(String[] args)
    {
        Map<String, String> capitals = new HashMap<>();
        capitals.put("Norway", "Oslo");
        capitals.put("Sweden", "Stockholm");
        capitals.put("Finland", "Helsinki");
        for (String country : capitals.keySet())
        {
            System.out.println("Capital of " + country + " is " + capitals.get(country));
        }
    }
}
