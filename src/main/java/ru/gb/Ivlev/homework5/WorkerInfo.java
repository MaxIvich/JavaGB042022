package ru.gb.Ivlev.homework5;

public class WorkerInfo {

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

        Worker[] workers = new Worker[5];
        workers[0] =worker1;
        workers[1] =worker2;
        workers[2] =worker3;
        workers[3] =worker4;
        workers[4] =worker5;

        for (int i = 0; i <workers.length ; i++) {
            if(workers[i].getAge()>=40) {
                System.out.println(workers[i].getFullname() + " " + workers[i].getPost() + " " + workers[i].getEmail() + " " + workers[i].getPhoneNumber() + " " +
                        workers[i].getSalary() + " " + workers[i].getAge());
            }

        }
       String printData = worker2.printData() ;
    }
}
