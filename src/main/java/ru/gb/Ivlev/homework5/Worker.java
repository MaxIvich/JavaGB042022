package ru.gb.Ivlev.homework5;

public class Worker {
    private String fullname;
    private String post;
    private String email;
    private int phoneNumber;
    private int salary;
    private int age;

    public  String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Worker(String fullname, String post, String email, int phoneNumber, int salary, int age){
            this.fullname = fullname;
            this.post = post;
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.salary = salary;
            this.age = age;
        }

         public String printData(Worker a) {

                    String b = a.fullname + " " + a.post + " " + a.email + " " + a.phoneNumber + " " + a.salary + " " + a.age;
                    System.out.println(b);
                    return b;

         }
}

