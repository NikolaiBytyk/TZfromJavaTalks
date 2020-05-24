package Employeers;

import java.util.Date;

public abstract class Worker implements Comparable<Worker> {

    private String name, surname, typeEmployeer;
    private Date birthDay, employmentDay;

    public Worker() {
        this.typeEmployeer = "Employer";
        this.name = "Bob";
        this.surname = "Billy";
        this.birthDay = new Date();
        this.employmentDay = new Date();
    }

    public Worker(String name, String surname, Date birthDay, Date employmentDay) {
        this.name = name;
        this.surname = surname;
        this.birthDay = birthDay;
        this.employmentDay = employmentDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public Date getEmploymentDay() {
        return employmentDay;
    }

    public void setEmploymentDay(Date employmentDay) {
        this.employmentDay = employmentDay;
    }

    public void setTypeEmployeer(String typeEmployeer) {
        this.typeEmployeer = typeEmployeer;
    }

    public String getTypeEmployeer() {
        return typeEmployeer;
    }

    @Override
    public String toString() {
        return (getTypeEmployeer() + " | " + getName() + " | " + getSurname() + " | " + getBirthDay() + " | " + getEmploymentDay());
    }

    public int compareTo(Worker other) {
        return this.surname.compareTo(other.surname);
    }
}
