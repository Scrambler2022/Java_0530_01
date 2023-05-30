import java.util.ArrayList;

public class _00_Class_05 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        list.add("abc"); // 주소 0
        list.add("abc"); // 주소 1
        list.add("bbb"); // 주소 2
        list.add("aaa"); // 주소 3
        list.add(3);     // Integer
        //list.add(3); // Integer
        System.out.println(list.get(4));
        for (int i = 0; i < list.size(); i++) {
            System.out.println("list : " + list.get(i));
        }
//        ArrayList list2 = new ArrayList(); //지네릭스 : 특정클래스만 입력가능
//        list2.add(new Student(1,"홍길동",100,100,99));
//        list2.add(new Student(2,"유관순",90,90,99));
//        list2.add(new Student(3,"이순신",80,80,87));
//        //중복가능 어레이 리스트 중복가능 어레이리스트 중복가능 어레이 리스트 중복가능
//
////        list2.add(2);
////        list2.add("abc");
//
//        //출력하시오
//        for (int i=0; i< list2.size();i++) {
//            Student s = (Student) list2.get(i); //형변환을 꼭 해줘야한다.
//            System.out.println("list : "+ s.getName()+" "+s.getStuNo()+" "+ s.getKor()+" "
//                    +s.getEng()+" "+s.getMath()+" "+s.getTotal()+" "+s.getAvg()+" "
//                    +s.getRank());
//
//            System.out.printf("%d %s %d %d %d %d %.2f \n",s.getStuNo(),s.getName(),
//                    s.getKor(),s.getEng(),s.getMath(),s.getTotal(),
//                    s.getAvg(),s.getRank());
//        }


    }//main

}//class
