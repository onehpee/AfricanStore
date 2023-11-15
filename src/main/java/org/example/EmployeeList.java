package org.example;

public class EmployeeList {
    private int capacity;
    private int size;
    private EmployeeList[] list;

    public EmployeeList(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.list = new EmployeeList[capacity];
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull(){
        return size >= capacity;
    }

    public void addEmployee(Employees employees){
        Employees[] newEmployee = new Employees[capacity];
        if(isFull()){
            return;
        }
        for(int i = 0; i < size-1; i++) {
            newEmployee[i++] = employees;
        }
        newEmployee[capacity-1]=employees;

    }

    public EmployeeList removeEmployee(){
        if (isEmpty()){
            return null;
        }
        EmployeeList newFired = list[size-1];
        list[--size] = null;
        return newFired;
    }

    public void printEmployeeList(){
        for (int i = size-1; i >= 0; i--){
            System.out.println(list[i]);
        }
    }
}
