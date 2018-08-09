public class Foo {

    public String getBar() {
        return "bar";
    }

    public static void main(String[] args) {
        System.out.println(new Foo().getBar());
    }
}
