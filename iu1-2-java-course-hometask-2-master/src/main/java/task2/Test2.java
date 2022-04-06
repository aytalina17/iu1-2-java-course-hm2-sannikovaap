package task2;

public class Test2 {
    public static void main(String[] args) {
        Worker first_worker = new HourlyWageWorker(100);
        Worker second_worker = new FixedPayWorker(30000);

        System.out.println("salary of the hourly wage worker = " + first_worker.salary());
        System.out.println("salary of the fixed pay worker = " + second_worker.salary());

    }
}
