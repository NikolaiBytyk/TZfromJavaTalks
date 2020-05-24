package WorkWithEmployeers;

import Employeers.Employeers;
import Employeers.Managers;
import Employeers.OtherEmployees;
import Employeers.Worker;

import java.util.*;

public class WorkWithEmployeers {

    private List<Worker> employeersList = new ArrayList<Worker>();

    public List<Worker> getEmployeersList() {
        return employeersList;
    }

    public Worker getEmployeersList(int number) {
        return employeersList.get(number);
    }

    public void lookEmployers() {
        for (Worker employeers : employeersList) {
            System.out.println(employeersList.indexOf(employeers) + " | " + employeers.toString());
        }
    }

    public void lookEmployers(String typeEmployer) {
        for (Worker employeers : employeersList) {
            if (employeers.getTypeEmployeer().equals(typeEmployer)){
                System.out.println(employeersList.indexOf(employeers) + " | " + employeers.toString());
            }
        }
    }

    public void addEmployers(String whichEmployeer, String name, String surname, Date birthDay, Date employmentDay,
                             ArrayList obeyEmployersList, String description) {

        //Employeers employeers = new Employeers(name,surname,birthDay,employmentDay);
        //Managers managers = new Managers(name,surname,birthDay,employmentDay, obeyEmployeersList);
        //OtherEmployees otherEmployeestherEmployees = new OtherEmployees();

        switch (whichEmployeer) {
            case ("Employer"): {
                Employeers employeers = new Employeers(name, surname, birthDay, employmentDay);
                employeersList.add(employeers);
                break;
            }
            case ("Manager"): {
                Managers managers = new Managers(name, surname, birthDay, employmentDay, obeyEmployersList);
                employeersList.add(managers);
                break;
            }
            case ("Other Employer"): {
                OtherEmployees otherEmployers = new OtherEmployees(name, surname, birthDay, employmentDay, description);
                employeersList.add(otherEmployers);
                break;
            }

        }


    }

    public void addEmployers() {
        Employeers employer = new Employeers();
        employeersList.add(employer);
    }

    public void addEmployers(Worker employer) {
        employeersList.add(employer);

    }


    public void deletEmployers(int number) {
        if (number < employeersList.size() || number > 0)
            employeersList.remove(number);
        else {
            System.out.println("Нет елемента с таким номером");
            deletEmployers(number);
        }
    }

    public void editEmployers(Worker editEmploer, String whichEmployeerWillBe, int number) {

        switch (whichEmployeerWillBe) {
            case ("Employer"): {
                Employeers employeers = new Employeers(editEmploer.getName(), editEmploer.getSurname(), editEmploer.getBirthDay(), editEmploer.getEmploymentDay());
                employeersList.add(employeers);
                deletEmployers(number);
                break;
            }
            case ("Manager"): {
                Managers managers = new Managers(editEmploer.getName(), editEmploer.getSurname(), editEmploer.getBirthDay(), editEmploer.getEmploymentDay());
                employeersList.add(managers);
                deletEmployers(number);
                break;
            }
            case ("Other Emploer"): {
                OtherEmployees otherEmployers = new OtherEmployees(editEmploer.getName(), editEmploer.getSurname(), editEmploer.getBirthDay(), editEmploer.getEmploymentDay(), null);
                employeersList.add(otherEmployers);
                deletEmployers(number);
                break;
            }

        }
    }

    public void sortBySurname() {
        this.employeersList.sort(Comparator.comparing(Worker::getSurname));
    }

    public void sortByEmploymentDay() {
        this.employeersList.sort(Comparator.comparing(Worker::getEmploymentDay));
    }

}
