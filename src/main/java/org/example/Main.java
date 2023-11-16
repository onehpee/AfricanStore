package org.example;

import java.util.*;




public class Main {
    public static void main(String[] args) {
        Employees Boye = new Employees(1, "clerk",1, "Ajinboye Uwensuyi", 25.50,new Date("05/05/85"));

        Employees Ade = new Employees(2,"Manager",1,"Adedayo Uwensullyi", 50.50,new Date("01/01/90"));

        Employees Uyi = new Employees(3,"staff",1,"Uyi Omofonmwan", 45.00,new Date("02/02/96"));

        Employees Oseratin = new Employees(4,"staff",1,"Oseratin Omofonmwan", 45.00,new Date("02/03/97"));

        Employees Princess = new Employees(5,"staff",1,"Princess", 45.00,new Date("07/02/05"));
        Employees Sammy = new Employees(6,"staff",1,"Sanmisola Uwensuyi", 0.50,new Date("1/1/20"));

        //Employee[] cup = new Employees[3];
        EmployeeList employeeList = new EmployeeList(5);
        employeeList.addEmployee(Uyi);
        employeeList.addEmployee(Ade);
        employeeList.addEmployee(Boye);
        employeeList.addEmployee(Oseratin);
        employeeList.addEmployee(Princess);
        employeeList.addEmployee(Sammy);

        //Store sesi = new Store(1, "17545 Kedzie Ave","Sesi African Groceries",3854.85,4, new EmployeeList[]{employeeList});
        //employeesList[0] = Ade;
        //employeesList[1] = Boye;
        //employeesList[2] = Uyi;

        employeeList.printEmployeeList();

        //Store Sesi = new Store(1, "17545 Kedzie Ave","Sesi African Groceries",3854.85,4,employeesList);


//        for(int i = 0; i < employeesList.; i++){
//            System.out.println(employeesList.get(i));
//        }

    }
}