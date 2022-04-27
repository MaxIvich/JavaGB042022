package ru.gb.Ivlev.homework5;

public class Worker {
    private String fullname;
    private String post;
    private String email;
    private int phoneNumber;
    private int salary;
    private int age;

    public String getFullname() {
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

        public static  void printData(Worker a){

        System.out.println(a.fullname +" "+ a.post+ " "+a.email+" "+a.phoneNumber+" "+a.salary+" "+a.age);
    }


    public static void main(String[] args) {

       Worker worker1 = new Worker("Иванов Иван Иванович", "engineer", "123@ru"
               , 112358, 60000, 45);
       Worker worker2 = new Worker("Петров Константин Андреевич", "engineer", "1234@ru"
               , 112358, 20000, 19);
       Worker worker3 = new Worker("Сидоров Александр Алексеевич", "engineer", "1235@ru"
               , 112358, 50000, 35);
       Worker worker4 = new Worker("Федоров Игорь Евгеньевич", "engineer", "1236@ru"
               , 112358, 30000, 25);
       Worker worker5 = new Worker("Лебедев Павел Викторович", "engineer", "1237@ru"
               , 112358, 40000, 40);

                    printData(worker1);

           Worker[] workers = new Worker[5];
        workers[0] =worker1;
        workers[1] =worker2;
        workers[2] =worker3;
        workers[3] =worker4;
        workers[4] =worker5;


        for (int i = 0; i <workers.length ; i++) {
                 if(workers[i].age>=40){
                     System.out.println(workers[i].fullname +" "+ workers[i].post +" "+ workers[i].email+" "+workers[i].phoneNumber+" "+
                             workers[i].salary+" "+workers[i].age);
                 }
        }
    }
}

//                      new Worker("Иванов Иван Иванович","engineer","123@ru"
//                              ,112358,60000,45);
//                              new Worker("Петров Константин Андреевич", "engineer", "1234@ru"
//                              , 112358, 20000, 19);
//                              new  Worker("Сидоров Александр Алексеевич", "engineer", "1235@ru"
//                              , 112358, 50000, 35);
//                              new Worker("Федоров Игорь Евгеньевич", "engineer", "1236@ru"
//                              , 112358, 30000, 25);
//                              new Worker("Лебедев Павел Викторович", "engineer", "1237@ru"
//                              , 112358, 40000, 40);
