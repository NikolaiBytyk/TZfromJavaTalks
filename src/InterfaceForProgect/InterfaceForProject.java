package InterfaceForProgect;

import Employeers.Employeers;
import Employeers.Managers;
import Employeers.OtherEmployees;
import WorkWithEmployeers.WorkWithEmployeers;

import java.util.Date;
import java.util.Scanner;

public class InterfaceForProject {

    WorkWithEmployeers list = new WorkWithEmployeers();

    public void firstPage() {

        System.out.println("Program for work with Workers");
        System.out.println();
        System.out.println("Press 1 to see all employees");
        System.out.println("Press 2 to add employee");
        System.out.println("Press 3 to delete employee");
        System.out.println("Press 4 to change employee type");
        System.out.println("Press 5 to connect an employee with a manager");
        System.out.println("Press 6 to sort by employee by Surname");
        System.out.println("Press 7 to sort by employee by dates of employment");
        System.out.println("Press 8 to exit");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        switch (number) {
            case (1): {
                list.lookEmployers();
                firstPage();
                break;
            }
            case (2): {
                System.out.println("Press 1 to add Employer ");
                System.out.println("Press 2 to add Manager ");
                System.out.println("Press 3 to add Other Employers ");

                int add = scanner.nextInt();

                System.out.println("Enter employee name: ");
                String name;
                String surname;
                name = write();
                System.out.println("Enter employee surname: ");
                surname = write();

                switch (add) {
                    case (1):
                        list.addEmployers(new Employeers(name, surname, null, null));
                        break;
                    case (2):
                        list.addEmployers(new Managers(name, surname, null, null));
                        break;
                    case (3): {
                        System.out.println("Enter employee description: ");
                        String description = scanner.nextLine();
                        list.addEmployers(new OtherEmployees(name, surname, null, null, description));
                        break;
                    }
                }
                firstPage();
                break;
            }
            case (3): {
                list.lookEmployers();
                System.out.println("Enter employer id: ");
                int id = scanner.nextInt();
                list.deletEmployers(id);
                firstPage();
                break;
            }
            case (4): {
                list.lookEmployers();
                System.out.println("Enter employer id: ");
                int id = scanner.nextInt();
                System.out.println("Enter what type of employee to set: ");
                String type = scanner.nextLine();
                list.editEmployers(list.getEmployeersList(id), type, id);
                firstPage();
                break;
            }
            case (5): {
                list.lookEmployers("Manager");
                System.out.println("Enter Manager id: ");
                int idManager = scanner.nextInt();
                Managers manager;
                manager = (Managers) list.getEmployeersList(idManager);
                list.lookEmployers("Employer");
                System.out.println("Enter Employer id: ");
                int idEmployer = scanner.nextInt();
                manager.connectEmploersToManager(list.getEmployeersList(idEmployer));
                firstPage();
                break;
            }
            case (6): {
                list.sortBySurname();
                list.lookEmployers();
                firstPage();
                break;
            }
            case (7): {
                list.sortByEmploymentDay();
                list.lookEmployers();
                firstPage();
                break;
            }
            case (8):
                break;

        }

    }

    public void makeList() {

        list.addEmployers(new Managers("Kolya", "Bytyk", new Date(0), new Date(0)));
        list.addEmployers(new Employeers("Vici", "Doc", null, null));
        list.addEmployers(new Managers("Gogo", "Vice", null, null));
        list.addEmployers(new OtherEmployees("Father", "Fail", null, null, null));
        list.addEmployers();
    }

    private String write() {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            return scanner.nextLine();
        }
        return null;
    }
}
