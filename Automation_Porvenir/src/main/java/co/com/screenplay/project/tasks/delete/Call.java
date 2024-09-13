package co.com.screenplay.project.tasks.delete;

public class Call {

    private Call() {
    }

    public static ConsumeServiceDelete service() {
        return new ConsumeServiceDelete();
    }
}