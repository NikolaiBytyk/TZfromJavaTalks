package Employeers;

import java.util.Date;

public class Employeers extends Worker {


    public Employeers() {
        setTypeEmployeer("Employer");
    }

    public Employeers(String name, String surname, Date birthDay, Date employmentDay) {
        super(name, surname, birthDay, employmentDay);
        setTypeEmployeer("Employer");
    }


    public String getAllInfoFromEmployer() {
        return (getTypeEmployeer() + " | " + getName() + " | " + getSurname() + " | " + getBirthDay() + " | " + getEmploymentDay());
    }

}
