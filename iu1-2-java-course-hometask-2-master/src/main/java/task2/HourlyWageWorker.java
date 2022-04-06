package task2;

public class HourlyWageWorker extends Worker {
    private double rate_per_hour;

    public HourlyWageWorker(double rate_per_hour) {
        this.rate_per_hour = rate_per_hour;
    }

    @Override
    double salary() {
        return 20.8 * 8 * rate_per_hour;
    }
}
