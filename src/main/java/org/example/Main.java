package org.example;

import java.util.*;

import static org.example.Store.addEmployee;
import static org.example.Store.addEmployee2;

public class Main {
    public static void main(String[] args) {
        Employees Boye = new Employees(1, "clerk",1, "Ajinboye Uwensuyi", 25.50,new Date("05/05/85"));

        Employees Ade = new Employees(2,"Manager",1,"Adedayo Uwensullyi", 50.50,new Date("01/01/90"));

        Employees Uyi = new Employees(3,"staff",1,"Uyi Omofonmwan", 45.00,new Date("02/02/96"));

        Employees Oseratin = new Employees(4,"staff",1,"Oseratin Omofonmwan", 45.00,new Date("02/03/97"));

        Employees Princess = new Employees(5,"staff",1,"Princess", 45.00,new Date("07/02/05"));

        Stack<Employees> employeesList = new Stack<>();
        Employees[] cup = new Employees[3];

        //employeesList[0] = Ade;
        //employeesList[1] = Boye;
        //employeesList[2] = Uyi;

        addEmployee2(0,employeesList,Uyi);
        addEmployee2(1,employeesList,Ade);
        addEmployee2(2,employeesList,Boye);
        addEmployee2(3,employeesList,Oseratin);
        addEmployee(4, employeesList, Oseratin);



       // Store Sesi = new Store(1, "17545 Kedzie Ave","Sesi African Groceries",3854.85,4,employeesList);


        for(int i = 0; i < employeesList.; i++){
            System.out.println(employeesList.get(i));
        }
    }
}