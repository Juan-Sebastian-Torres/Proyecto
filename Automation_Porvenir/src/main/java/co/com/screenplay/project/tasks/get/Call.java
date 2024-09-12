package co.com.screenplay.project.tasks.get;

public class Call {

    private Call(){}

    public static ConsumeServiceGet service(){
        return new ConsumeServiceGet();
    }
}
