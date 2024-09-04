package berlin.kotlin.checked;

import java.io.IOException;

public class CheckedInterop {

    public static void main(String[] args) {
        //try {
            CheckedKt.second();
        //} catch (IOException e) {
        //    e.printStackTrace();
        //}

        try {
            CheckedKt.third();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
