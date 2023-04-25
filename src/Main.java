public class Main {
    public static void main(String[] args) {
        Stack a = new Stack();

        StackTest st = new StackTest();
        st.fill(a);
        System.out.println(a);
        System.out.println(st.printAndDelete(a));

    }


}