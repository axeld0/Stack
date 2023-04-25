public class Main {
    public static void main(String[] args) {
        Stack a = new Stack();

        a.add(3);
        a.add(45);
        a.add(345);

        System.out.println(a.toString());
        System.out.println(a.first());
        System.out.println(a.extract());
        System.out.println(a);

    }


}