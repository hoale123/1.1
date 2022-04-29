package com.company;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class App {

    public void printKeys(Map<String,String> map){
        Set<String> mapKeys = map.keySet();
        for (String key : mapKeys){
            System.out.println(key);
        }
    }
    public void printValues(Map<String,String> map){
        Collection<String> mapKeys = map.keySet();
        for (String values : mapKeys){
            System.out.println(values);
        }
    }

    public Map<String, Integer> mapFun(Map<String, Integer> map){
        map.put("Toyota Camry", 2012);
        map.put("Chevy Camaro", 1969);
        map.put("Hyundai Genesis", 2015);
        map.put("Jeep Wrangler", 2003);
        map.put("Honda Civic", 2018);
        map.put("Pontiac GTO", 1964);
        map.put("Ford Explorer", 2012);
        map.put("Smart Fortwo", 2013);
        map.remove("Jeep Wrangler");

        return map;
    }
    
}
