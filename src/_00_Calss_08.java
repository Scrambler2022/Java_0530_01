import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class _00_Calss_08 {
    public static void main(String[] args) {
        // ArrayList 객체를 생성합니다.
        ArrayList list = new ArrayList<>();

        // ArrayList에 "aaa"라는 문자열을 추가합니다.
        list.add("aaa");
        // ArrayList의 첫 번째 요소를 출력합니다. "aaa"가 출력됩니다.
        System.out.println("list : " + list.get(0));
        // HashMap 객체를 생성합니다.
        HashMap map = new HashMap<>();
        // HashMap에 여러 쌍의 키와 값들을 추가합니다.
        map.put("id", "aaa");  // "id"라는 키와 "aaa"라는 값을 추가합니다.
        map.put("list", "data");  // "list"라는 키와 "data"라는 값을 추가합니다.
        map.put("no", "data");  // "no"라는 키와 "data"라는 값을 추가합니다.
        map.put("lastNo", "100");  // "lastNo"라는 키와 "100"라는 값을 추가합니다.
        map.put("id", "bbb");  // "id"라는 키와 "bbb"라는 값을 추가합니다.
        // 이미 "id"라는 키가 있으므로, 이전의 값 "aaa"는 "bbb"로 덮어쓰여집니다.
        // HashMap에서 "id" 키에 해당하는 값을 출력합니다. "bbb"가 출력됩니다.
        System.out.println("map : " + map.get("id"));
        // HashMap의 모든 키와 값을 순회하기 위해 Iterator 객체를 사용합니다.
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            // HashMap의 다음 키와 값을 출력합니다.
            System.out.println(it.next());
        }
    }
}
