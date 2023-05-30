public class _00_Class_04 {
    public static void main(String[] args) {
        String str = "abc";
        str = str + "1";
        //스트링은 공간에 데이터를 누적하고 ex)백만번 돌리면 백만번 주소가 생김
        //인트는 같은공간에 덮어씌우기를 한다. ex) 많은 계산은 인트로 이루어지겠음
        //스트링 버퍼
        int a = 0;
        a = a + 1;
        StringBuffer sb = new StringBuffer("abc");
        //sb = sb + 1;
        sb.append(1);
        sb.append(1);
        System.out.println(sb);


    }
}
