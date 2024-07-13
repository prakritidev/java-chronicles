package greedystuff;

/**
 * InnerJobSchedulingProblem
 */
class InnerJobSchedulingProblem {
    int id, profit, deadline;

    public InnerJobSchedulingProblem() {
    }

    public InnerJobSchedulingProblem(int id, int profit, int deadline) {
        this.id = id;
        this.profit = profit;
        this.deadline = deadline;
    }

}

public class JobSchedulingProblem {
    public static void main(String[] args) {
        System.out.println("JobSchedulingProblem.main()");
        InnerJobSchedulingProblem[] arr = new InnerJobSchedulingProblem[4];
        arr[0] = new InnerJobSchedulingProblem(1, 4, 20);
        arr[1] = new InnerJobSchedulingProblem(2, 1, 10);
        arr[2] = new InnerJobSchedulingProblem(3, 2, 40);
        arr[3] = new InnerJobSchedulingProblem(4, 2, 30);

    }

    public static String scheduleJobs(InnerJobSchedulingProblem[] input) {
        return null;
    }
}
