package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employees Boye = new Employees(1, "clerk",1, "Ajinboye Uwensuyi", 25.50,new Date("05/05/85"));

        Employees Ade = new Employees(2,"Manager",1,"Adedayo Uwensullyi", 50.50,new Date("01/01/90"));

        Employees Uyi = new Employees(3,"staff",1,"Uyi Omofonmwan", 45.00,new Date("02/02/96"));

        Employees[] employeesList = new Employees[3];

        employeesList[0] = Ade;
        employeesList[1] = Boye;
        employeesList[2] = Uyi;

        Store Sesi = new Store(1, "17545 Kedzie Ave","Sesi African Groceries",3854.85,4,employeesList);

        int []gum = new int[9];
        gum[0] = 1;

        //for(int i = 0; i < 3; i++){
            System.out.println(employeesList[1]);
        //}
    }
}