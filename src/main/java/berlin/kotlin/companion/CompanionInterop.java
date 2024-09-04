package berlin.kotlin.companion;

public class CompanionInterop {

    public static void main(String[] args) {
        String first = Outer.Companion.getFirst();
        String second = Outer.getSecond();
        String third = Outer.third;
        String fourth = Outer.fourth;

        System.out.println(first + second + third + fourth);
    }

}
