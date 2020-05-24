package Employeers;

import java.util.Date;

public class OtherEmployees extends Worker {

    private String description;

    public OtherEmployees(String name, String surname, Date birthDay, Date employmentDay, String description) {
        super(name, surname, birthDay, employmentDay);
        setTypeEmployeer("OtherEmployer");
        this.description = description;
    }

    public OtherEmployees() {
        setTypeEmployeer("OtherEmployer");
        this.description = null;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return (getTypeEmployeer() + " | " + getName() + " | " + getSurname() + " | " + getBirthDay() + " | " + getEmploymentDay() + " | " + getDescription());
    }
}
