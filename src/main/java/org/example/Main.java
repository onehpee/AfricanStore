package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.example.Employees.addEmployee;
import static org.example.Employees.addEmployee2;

public class Main {
    public static void main(String[] args) {
        Employees Boye = new Employees(1, "clerk",1, "Ajinboye Uwensuyi", 25.50,new Date("05/05/85"));

        Employees Ade = new Employees(2,"Manager",1,"Adedayo Uwensullyi", 50.50,new Date("01/01/90"));

        Employees Uyi = new Employees(3,"staff",1,"Uyi Omofonmwan", 45.00,new Date("02/02/96"));

        Employees[] employeesList = new Employees[3];
        Employees[] cup = new Employees[3];

        //employeesList[0] = Ade;
        //employeesList[1] = Boye;
        //employeesList[2] = Uyi;

        addEmployee2(3,employeesList,Uyi);
        addEmployee2(3,employeesList,Ade);
        addEmployee2(3,employeesList,Boye);




        Store Sesi = new Store(1, "17545 Kedzie Ave","Sesi African Groceries",3854.85,4,employeesList);


        for(int i = 0; i < 3; i++){
            System.out.println(employeesList[i]);
        }
    }
}