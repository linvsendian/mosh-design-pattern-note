package behavioral.templateMethod;

public abstract class Task {
    private AuditTrail auditTrail;

    public Task(){
        this.auditTrail = new AuditTrail();
    }
    public Task(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    // 模板，或者说是公共部分
    public void execute(){
        auditTrail.record();
        doExecute();
    }

    protected abstract void doExecute();

}
