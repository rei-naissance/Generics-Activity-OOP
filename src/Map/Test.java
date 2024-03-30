package Map;

public class Test {
    public static void main(String[] args) {

        MyMap map = new MyMap();

        map.put("rei", 19);

        map.print();

        System.out.println(map.get("rei"));

        map.remove("rei");

        map.print();
    }
}
