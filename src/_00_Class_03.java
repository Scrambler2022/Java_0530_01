import java.util.Scanner;

public class _00_Class_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 소문자를 대문자로 출력하시오.
//        System.out.println("영문소문자를 입력하세요.");
//        char input = scan.next().charAt(0);
//        System.out.println("입력한 문자 : "+ input);
//        char output = (char) (input-32); //char + int = int + int = int 형번환-> char
//        System.out.println("대문자 : "+ input);


//        //소문자를 대문자로 , 대문자를 소문자로 출력하시오
//        System.out.println("영문자를 입력하세요.");
//        char input = scan.next().charAt(0);
//        char output = (char) (input-32); //char + int = int + int = int 형번환-> char
//        if (('a' <= input) && ('z' >= input)==true ) {
//            System.out.println("입력한 문자 : "+ input +"입니다");
//            output = (char)(input-32);
//            System.out.println("대문자 : "+ output +"를 출력합니다.");
//        } else if (('A' <= input) && ('Z' >= input)==true) {
//            System.out.println("입력한 문자 : "+ input +"입니다");
//            output = (char)(input+32);
//            System.out.println("소문자 : "+ output +"를 출력합니다.");
//        } else {
//            System.out.println("영문자를 입력해주세요.");
//        }

        //소문자를 대문자로 , 대문자를 소문자로 출력하시오
        System.out.println("영문자를 입력하세요.");
        String input = scan.next();
        StringBuilder output = new StringBuilder();
        char temp;
        for (int i = 0; i < input.length(); i++) {
            temp = input.charAt(i);
            if (('a' <= temp) && ('z' >= temp)) {
                output.append((char) (temp - 32));
            } else if (('A' <= temp) && ('Z' >= temp)) {
                output.append((char) (temp + 32));
            } else {
                System.out.println("영문자만 입력해주세요.");
                return;
            }
        }
        System.out.println("변환된 문자열 : " + output.toString());
    }//main

}
