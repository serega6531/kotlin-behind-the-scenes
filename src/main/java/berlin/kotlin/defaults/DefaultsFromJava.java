package berlin.kotlin.defaults;

import static berlin.kotlin.defaults.DefaultsKt.*;

public class DefaultsFromJava {

    public static void main(String[] args) {
        doSomething(456, false, "qwerty"); // all parameters only

        doSomethingWithOverloads();
        doSomethingWithOverloads(456);
        doSomethingWithOverloads(456, false);
        doSomethingWithOverloads(456, false, "qwerty");
        // but not:
        // doSomethingWithOverloads(false)
        // doSomethingWithOverloads("qwerty")
        // doSomethingWithOverloads(false, "qwerty")
    }

}
