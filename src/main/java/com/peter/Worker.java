package com.peter;

import java.util.List;

public class Worker {

    private String firstName;
    private String lastName;
    private double salary;
    private List<String> teamProject;

    public Worker() {
    }

    public Worker(String firstName, String lastName, double salary, List<String> teamProject) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.teamProject = teamProject;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public List<String> getTeamProject() {
        return teamProject;
    }

    public void setTeamProject(List<String> teamProject) {
        this.teamProject = teamProject;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", teamProject=" + teamProject +
                '}';
    }
}
