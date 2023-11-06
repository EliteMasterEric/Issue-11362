package test;

public class TestClass {
    public static void main(String[] args) {
        test.CoolClass<String> coolClass = new test.CoolClass<String>("outer", "inner");
        doTheThing(coolClass);
    }

    public static void doTheThing(test.CoolClass<String> input) {
        System.out.println(input.toString());
    }
}

