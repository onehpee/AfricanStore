package org.example;

public class Store implements OwnedStores {
    private int storeNum;
    private String location;
    private String name;
    private double revenue;

    private int numberOfStaff;
    private EmployeeList[] employees;


    /**
     * Constructor for new object created
     * @param storeNum The store's number
     * @param location The location of the store
     * @param name The name of the store
     * @param revenue The income of a normal business day
     * @param numberOfStaff The number of staff the works at the store
     * @param employees A list of employees in the store
     */
    public Store(int storeNum, String location, String name, double revenue, int numberOfStaff, EmployeeList[] employees){
        this.storeNum=storeNum;
        this.location=location;
        this.name=name;
        this.revenue=revenue;
        this.numberOfStaff=numberOfStaff;
        this.employees=employees;
    }

    public int getStoreNum() {return storeNum;}

    public String getLocation() {return location;}

    public String getName() {return name;}

    public double getRevenue() {
        return revenue;
    }

    public int getNumberOfStaff() {return numberOfStaff;}

    public EmployeeList[] getEmployeeList() {return employees;}


}
