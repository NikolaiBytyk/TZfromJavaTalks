import Employeers.Employeers;
import Employeers.Managers;
import InterfaceForProgect.InterfaceForProject;
import WorkWithEmployeers.WorkWithEmployeers;
import Employeers.OtherEmployees;
import WorkWithFile.ReadFile;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class main {
    public static void main(String[] args) throws IOException {
        WorkWithEmployeers list = new WorkWithEmployeers();


        list.lookEmployers();
        InterfaceForProject interfaceForProject = new InterfaceForProject();
        interfaceForProject.makeList();
        interfaceForProject.firstPage();


       /* list.editEmployers(list.getEmployeersList(3), "Manager", 3);
        list.lookEmployers();
        list.getEmployeersList(1);
        Managers manager;
        // manager = list.getEmployeersList(1);
        manager = (Managers) list.getEmployeersList(0);
        manager.connectEmploersToManager(list.getEmployeersList(1));
        manager.connectEmploersToManager(list.getEmployeersList(3));
        manager.lookConnect();*/
        // list.sortBySurname();
        //   list.lookEmployers();


    }
}
