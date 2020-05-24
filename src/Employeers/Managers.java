package Employeers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Managers extends Worker {

    private List<Worker> obeyEmployeersList = new ArrayList<Worker>();

    public Managers(String name, String surname, Date birthDay, Date employmentDay, ArrayList obeyEmployersList) {
        setTypeEmployeer("Manager");
    }

    public Managers(String name, String surname, Date birthDay, Date employmentDay) {
        super(name, surname, birthDay, employmentDay);
        setTypeEmployeer("Manager");
    }

    public List getObeyEmployeersList() {
        return obeyEmployeersList;
    }

    public void setObeyEmployeersList(Worker employeer) {

        this.obeyEmployeersList.add(employeer);
    }

    @Override
    public String toString() {
        return (getTypeEmployeer() + " | " + getName() + " | " + getSurname() + " | " + getBirthDay() + " | " + getEmploymentDay() + " | " + getObeyEmployeersList());
    }


    public void lookConnect() {
        for (Worker obeyEmployers : obeyEmployeersList) {
            System.out.println(toString());
            System.out.println(obeyEmployeersList.indexOf(obeyEmployers) + " | " + obeyEmployers.toString());
        }
    }

    public void connectEmploersToManager(Worker employeer) {

        setObeyEmployeersList(employeer);
    }


}
