import java.util.ArrayList;
import java.util.Iterator;

public class _00_Class_06 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        //Iterator 사용출력
        Iterator it = list.iterator();//컬렉션을 읽어오는 객체

        while (it.hasNext()) {//데이터가 있는지 확인
            System.out.println(it.next());//1개의 데이터를 가져옴.
        }
        //list.remove(3);
        //list.remove(4);//이해됨 순차적으로 연산되며 지워지므로  당겨지고 나서 지워지는것이므로 12357 으로 나옴

//        //전체삭제
//        for (int i=list.size()-1;i >=0;i--){
//            list.remove(i);
//        }
//        //출력
//        System.out.println(list.size());

    }//main
}//class
