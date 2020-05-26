package com.ibm.vertx.main.functionalProg;
import java.util.Arrays;
import java.util.List;

public class DeclarativeProg {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Dory", "Gill", "Bruce", "Nemo", "Darla", "Marlin", "Jacques");

        //find a nemo ; declarative
        names.stream().filter(name -> name.equals("Nemo")).forEach(res -> System.out.println(res));

    }
}
