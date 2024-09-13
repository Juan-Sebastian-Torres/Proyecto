package co.com.screenplay.project.tasks.post;

public class Call {

    private Call(){}

    public static ConsumeServicePost service(){
        return new ConsumeServicePost();
    }
}
