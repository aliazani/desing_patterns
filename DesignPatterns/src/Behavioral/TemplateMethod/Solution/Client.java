package Behavioral.TemplateMethod.Solution;

public class Client {
    public static void main(String[] args) {
        var task1 = new TransferMoneyTask();
        task1.execute();
        var task2 = new GenerateReportTask();
        task2.execute();

    }
}
