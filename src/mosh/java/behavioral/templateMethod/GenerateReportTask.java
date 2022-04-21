package behavioral.templateMethod;

public class GenerateReportTask extends Task{
    @Override
    protected void doExecute() {
        System.out.println("generate report task...");
    }
}
