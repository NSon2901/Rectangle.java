package baithuchanhtuan6.java;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class convertNumber {
    private static final Map<Integer, String> singleDigit = new HashMap<Integer, String>();
    static {
        singleDigit.put(0, "không");
        singleDigit.put(1, "một");
        singleDigit.put(2, "hai");
        singleDigit.put(3, "ba");
        singleDigit.put(4, "bốn");
        singleDigit.put(5, "năm");
        singleDigit.put(6, "sáu");
        singleDigit.put(7, "bảy");
        singleDigit.put(8, "tám");
        singleDigit.put(9, "chín");
        singleDigit.put(10, "mười");
        singleDigit.put(11, "mười một");
        singleDigit.put(12, "mười hai");
        singleDigit.put(13, "mười ba");
        singleDigit.put(14, "mười bốn");
        singleDigit.put(15, "mười năm");
        singleDigit.put(16, "mười sáu");
        singleDigit.put(17, "mười bảy");
        singleDigit.put(18, "mười tám");
        singleDigit.put(19, "mười chín");
    }
    private static final Map<Integer, String > multiDigits = new HashMap<>();
    static {
        multiDigits.put(10, "mười");
        multiDigits.put(20, "hai mươi");
        multiDigits.put(30, "ba mươi");
        multiDigits.put(40, "bốn mươi");
        multiDigits.put(50, "năm mươi");
        multiDigits.put(60, "sáu mươi");
        multiDigits.put(70, "bảy mươi");
        multiDigits.put(80, "tám mươi");
        multiDigits.put(90, "chín mươi");
    }
    private static final int BILLION = 1000000000;
    private static final int MILLION = 1000000;
    private static final int THOUSAND = 1000;
    private static final int HUNDRED = 100;
    private static final int TEN = 10;
    private static final String handleUnderOneThousand(int number){
        StringBuilder builder = new StringBuilder();
        int x = number;
        int m = x / HUNDRED;
        int r = x % HUNDRED;
        if (m>0){
            builder.append(singleDigit.get(m)).append(" trăm");
            x = x % HUNDRED;
        }
        if (r>0){
            if(m>0){
                builder.append(" ");
            }
            if (x<=19){
                builder.append(singleDigit.get(x));
            } else {
                m = x / TEN;
                r = x % TEN;
                if (r==0){
                    builder.append(multiDigits.get(x));
                } else {
                    x = x - r;
                    builder.append(multiDigits.get(x)).append(" ");
                    if (r == 1){
                        singleDigit.put(1, "mốt");
                    }
                    builder.append(singleDigit.get(r));
                }
            }
        }
        return builder.toString();
    }
    public static final String toVietNamese(int number){
        int x = number;
        if(x>Integer.MAX_VALUE || x <= Integer.MIN_VALUE){
            throw new IllegalArgumentException("Number has to be <= Integer.MAX_VALUE and > Integer.MIN_VALUE. number=" + x ) ;
        }
        StringBuilder builder = new StringBuilder();
        if(x==0){
            builder.append(singleDigit.get(x));
            return builder.toString();
        }
        boolean billion = false;
        boolean million = false;
        boolean thousand = false;
        if (x<0){
            builder.append(" âm ");
            x = -1 * x;
        }
        int m = x / BILLION;
        if (m > 0){
            billion = true;
            builder.append(handleUnderOneThousand(m)).append(" tỷ");
            x = x % BILLION;
        }
        m = x / MILLION;
        if (m > 0){
            if (billion){
                builder.append(" ");
            }
            million = true;
            builder.append(handleUnderOneThousand(m)).append(" triệu");
            x = x % MILLION;
        }
        m = x / THOUSAND;
        if (m > 0){
            if(billion || million){
                builder.append(" ");
            }
            thousand = true;
            builder.append(handleUnderOneThousand(m)).append(" nghìn");
            x = x % THOUSAND;
        }
        if (billion || million || thousand && x != 0){
            builder.append(" ");
        }
        builder.append(handleUnderOneThousand(x));
        return builder.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cần muốn đổi: ");
        int number = sc.nextInt();
        System.out.println(toVietNamese(number));
    }
}
