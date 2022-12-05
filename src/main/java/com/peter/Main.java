package com.peter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    static List<Worker> workers = new ArrayList<>();

    static {
        workers.add(
                new Worker("Simon", "DELALUNA", 2500.00, List.of("ProjectX"))
        );
        workers.add(
                new Worker("Evans", "DELALUNA", 2200.00, List.of("ProjectZ", "ProjectX"))
        );
        workers.add(
                new Worker("Hill", "DELALUNA", 1500.00, List.of("ProjectZ"))
        );
    }

    public static void main(String[] args) {

        // you can call a stream like this to
        Stream.of(workers);

        //foreach
        //simple use of a stream to replace a foreach loop.
        workers.stream()
                .forEach(s -> System.out.println(workers));
        // as you see on the lambda you can assign any name to loop {s}  on your list.

        System.out.println("*****************************");


        //map
        //map is an intermediary operation
        //after that you can collect your result to a Collector.
        List<Worker> increaseSalary =
                workers.stream()
                .map(worker -> new Worker(
                        worker.getFirstName(),
                        worker.getLastName(),
                        worker.getSalary() * 1.10,
                        worker.getTeamProject()
                ))
                .collect(Collectors.toList());
        System.out.println(increaseSalary);

        System.out.println("*****************************");

        //filter
        List<Worker> filterWorker = workers.stream()
                .filter(worker -> worker.getSalary() < 2000.00)
                .map(worker -> new Worker(
                        worker.getFirstName(),
                        worker.getLastName(),
                        worker.getSalary() * 1.10,
                        worker.getTeamProject()
                ))
                .collect(Collectors.toList());
        System.out.println(filterWorker);

        System.out.println("***************************");

        //findFirst
        Worker findFirst = workers.stream()
                .filter(worker -> worker.getSalary() > 2000.00)
                .map(worker -> new Worker(
                        worker.getFirstName(),
                        worker.getLastName(),
                        worker.getSalary() * 1.10,
                        worker.getTeamProject()
                ))
                .findFirst()
                .orElse(null);
        System.out.println(findFirst);

        System.out.println("***************************");

        //flatMap
        String projects = workers.stream()
                .map(worker -> worker.getTeamProject())
                .flatMap(strings -> strings.stream())
                .collect(Collectors.joining(","));
        System.out.println(projects);

        System.out.println("**************************");

        //min or Max
        //Quickly get the min or max value of a list
        Worker maxSalary = workers.stream()
                .max(Comparator.comparing(Worker::getSalary))
                .orElseThrow(NoSuchElementException::new);

        System.out.println("maxSalary = " + maxSalary);;

        System.out.println("***************************");

        //reduce
        Double totalSalary = workers.stream()
                .map(worker -> worker.getSalary())
                .reduce(0.0, Double::sum);

        System.out.println("totalSalary = " + totalSalary +"€");;

    }
}