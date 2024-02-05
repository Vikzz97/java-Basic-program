package ExceptionHandling;

public class YoungerAge extends RuntimeException {
    YoungerAge(String msg){
        super(msg);
    }
}
