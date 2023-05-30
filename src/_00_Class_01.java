import java.util.Scanner;

public class _00_Class_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("복권을 입력하세요,(예:1조1234567)");
        //1조 1234567
        //subString(0,2)

        String str4 = new String("1조1234567");
        String output1 = str4.substring(0, 2);
        String output2 = str4.substring(2);
        int output3 = Integer.parseInt(output2);
        int random = (int) (Math.random() * 1000000) + 1000000; // 1000000 - 9999999
        System.out.println("문자타입 : " + output2);
        System.out.println("숫자타입 : " + output3);
//        String output1 = "";
//        String output2 = "";
//        String input = scan.next(); //output2 숫자가 무엇인지 맞춰보세요.
        //Integer.parseInt(output2)
        //12356780 정수타입으로 변경 후 for문 쓰기
        for (int i = 1000000; i <= 9999999; i++) {
            if (output3 == i) {
                System.out.println("입력한 숫자 : " + i);
            }
        }
        for (int i = 1000000; i <= 9999999; i++) {
            if (random == i) {
                System.out.println("random Number : " + i);
            }
        }


//
//
//        String str = new String("abc");
//        char ch= 'a';
//        char ch2= 'b';
//        char ch3= 'c';
//        //스트링은 항상 등가비교 이퀄스를 사용해야한다. 등가비교 == 는 똑같은 문자가 들어가면 나오지만  99%는 다르게 나온다.
//        String str2 = "abc";
//
//        System.out.println(str);
//        System.out.println(str2);
//        System.out.println(str.charAt(0));
//
//        String str3 ="abcdefg";
//        String str4 = str3.substring(4);
//        System.out.println(str4);
    }//main
}//class
