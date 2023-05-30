import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ColClass {
    Map<String, Object> execute() {
        Map<String, Object> map = new HashMap<>();
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(1, "홍길동", 100, 100, 99));
        list.add(new Student(2, "유관순", 90, 90, 99));
        list.add(new Student(3, "이순신", 80, 80, 87));
        list.add(new Student(4, "홍길둥", 100, 100, 99));
        list.add(new Student(5, "유관손", 90, 90, 99));
        list.add(new Student(6, "이순산", 80, 80, 87));
        list.add(new Student(7, "홍길딩", 100, 100, 99));
        list.add(new Student(8, "유관선", 90, 90, 99));
        list.add(new Student(9, "이순싱", 80, 80, 87));
        list.add(new Student(10, "이순상", 80, 80, 87));

        int nowPage = 3;
        int startRow = 21;
        int endRow = 30;

        map.put("list", list);
        map.put("nowPage", nowPage);
        map.put("startRow", startRow);
        map.put("endRow", endRow);

        return map;
    }
}
