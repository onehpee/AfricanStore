package org.example;

public class EmployeeList {
    private int capacity;
    private int size;
    private Employees[] list;

    public EmployeeList(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.list = new Employees[capacity];
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull(){
        return size >= capacity;
    }

    public void addEmployee(Employees employees){
        if (isFull()){
            Employees[] newEmployeeList = new Employees[capacity+=20];
            System.out.println("old list " + capacity);
            System.out.println("new list " + newEmployeeList.length);
            for (int i = 0; i < size; i++){
                newEmployeeList[i] = list[i];
            }
            list = newEmployeeList;
            System.out.println("old list2 " + capacity);
        }
        list[size++] = employees;
    }

    public Employees removeEmployee(){
        if (isEmpty()){
            return null;
        }
        Employees newFired = list[size-1];
        list[--size] = null;
        return newFired;
    }

    public void printEmployeeList(){
        for (int i = size-1; i >= 0; i--){
            System.out.println(list[i]);
        }
    }

    public Employees[] getList(){
        return list;
    }
}
