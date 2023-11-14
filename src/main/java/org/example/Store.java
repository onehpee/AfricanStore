package org.example;

import java.util.Stack;

public class Store implements OwnedStores {
    private int storeNum;
    private String location;
    private String name;
    private double revenue;

    private int numberOfStaff;
    private Employees[] employees;

    private static int size;
    private static int capacity;

    /**
     * Constructor for new object created
     * @param storeNum The store's number
     * @param location The location of the store
     * @param name The name of the store
     * @param revenue The income of a normal business day
     * @param numberOfStaff The number of staff the works at the store
     * @param employees A list of employees in the store
     */
    public Store(int storeNum, String location, String name, double revenue, int numberOfStaff, Employees[] employees){
        this.storeNum=storeNum;
        this.location=location;
        this.name=name;
        this.revenue=revenue;
        this.numberOfStaff=numberOfStaff;
        this.employees=employees;
        this.size = 0;
        this.capacity = 0;
    }

    public int getStoreNum() {return storeNum;}

    public String getLocation() {return location;}

    public String getName() {return name;}

    public double getRevenue() {
        return revenue;
    }

    public int getNumberOfStaff() {return numberOfStaff;}

    public Employees[] getEmployees() {return employees;}

    public boolean isEmpty(){
        return size == 0;
    }

    public static boolean isFull(){
        return size >= capacity;
    }

    public static Employees[] addEmployee(int size, Stack<Employees> employeesList, Employees x){
        Employees[] newEmployeeList = new Employees[size];

        for(int i = 0; i < size-1; i++) {
            newEmployeeList[i] = employeesList.get(i);
        }
        newEmployeeList[size-1]=x;
        return newEmployeeList;
    }

    public static void addEmployee2(int index, Stack<Employees> employeesList, Employees x){
        if (isFull()) {
            employeesList.set(index, x);
        }
    }

    public static Employees[] removeEmployee(Employees[] fired, int index){
        if (fired == null || index < 0
                || index >= fired.length) {

            return fired;
        }

        Employees[] newFired = new Employees[fired.length - 1];

        for (int i = 0, k = 0; i < fired.length; i++ ){
            if(i == index){
                continue;
            }

            newFired[k++] = fired[i];
        }

        return newFired;
    }

}
