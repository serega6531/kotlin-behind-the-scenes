package berlin.kotlin.lambda;

public class ModifyJava {

    public static void main(String[] args) throws Throwable {
        int counter = 1;

        Runnable lambda = () -> {
            // counter++;
        };

        lambda.run();

        System.out.println(counter);
    }

}
