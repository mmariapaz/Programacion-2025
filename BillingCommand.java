public class BillingCommand implements Command {
    private DocumentProcessor processor;
    private DocumentJob job;

    public BillingCommand(DocumentProcessor processor, DocumentJob job) {
        this.processor = processor;
        this.job = job;
    }

    @Override
    public void execute() {
        processor.triggerBilling(job);
    }
}
