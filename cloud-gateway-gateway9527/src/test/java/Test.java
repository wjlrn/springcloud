import java.time.ZonedDateTime;

/**
 * @author wanajinae
 **/

public class Test {
    public static void main(String[] args) {
        ZonedDateTime zbj; //默认时区
        zbj = ZonedDateTime.now();
        System.out.println(zbj);
    }
}
