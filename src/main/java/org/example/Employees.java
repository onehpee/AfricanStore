package org.example;

import java.util.ArrayList;
import java.util.Date;

public class Employees {
    private int id;
    private String role;
    private int storeNum;
    private String name;
    private double salary;

    private double totalTips;
    private Date dateEmployed;

    Employees[] employeesList;

    private int timeEmployed;


    /**
     * Constructor used to set the values of a new object, after instantiation
     * @param id of the Employee
     * @param role of the Employee in the company
     * @param storeNum The number of the store they work at
     * @param name of the employee
     * @param salary of the employee
     * @param dateEmployed The amount of time working at the company
     */
    public Employees(int id, String role, int storeNum, String name, double salary, Date dateEmployed){
        this.id=id;
        this.role=role;
        this.storeNum=storeNum;
        this.name=name;
        this.salary=salary;
        this.dateEmployed=dateEmployed;
    }


    public Employees(){}

    /**
     * Gets the employee Id
     * @return the ID
     */
    public int getId(){return id;}

    /**
     * Gets the role employee in the company
     * @return the Role
     */
    public String getRole(){return role;}

    /**
     * Get the location the employee works at
     * @return the Location
     */
    public int getStoreNum(){return storeNum;}

    /**
     * Get the name of the employee
     * @return the Name
     */
    public String getName(){return name;}

    /**
     * Gets the salary of the employee
     * @return the Salary
     */
    public double getSalary(){return salary;}

    /**
     * Gets the date the employee started working there
     * @return Time employed
     */
    public Date getDateEmployed(){return dateEmployed;}

    public static Employees[] addEmployee(int size, Employees[] employeesList, Employees x){
        Employees[] newEmployeeList = new Employees[size+1];

        for(int i = 0; i < size; i++) {
            newEmployeeList[i] = employeesList[i];
            newEmployeeList[size] = x;
        }
        return newEmployeeList;
    }

    public static Employees[] addEmployee2(int size, Employees[] employeesList, Employees x){
        for(int i = 0; i < size; i++) {
            employeesList[i] = x;
         //   newEmployeeList[size] = x;
        }
        return employeesList;
    }

    public String toString(){
        return name;
    }
}
