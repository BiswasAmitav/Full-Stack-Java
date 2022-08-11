package primitive.dataTyppe;
import java.math.BigDecimal;
public class BDecimal {
    public static void main(String[] args) {

        double x=1.05;
        double y=2.55;

        System.out.println(x/3);//it doesn't shows correct output....

        //Its called rounding method..on java ........
        BigDecimal d1=new BigDecimal("1.05");
        BigDecimal d2=new BigDecimal("2.55");

        System.out.println(d1.add(d2));//now it perform good ...



    }
}
