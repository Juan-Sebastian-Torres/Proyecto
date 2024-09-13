package co.com.screenplay.project.tasks.put;

public class Call {

    private Call(){}

    public static ConsumeServicePut service(){
        return new ConsumeServicePut();
    }
}