package app;

import com.example.App;
import com.example.global.AppContext;
import test.TestUtil;

import java.io.ByteArrayOutputStream;
import java.util.Scanner;

public class AppTestRunner {

    public static String run(String input) {
        Scanner sc = TestUtil.genScanner(input + "\n종료");

        ByteArrayOutputStream outputStream = TestUtil.setOutByteArray();
        AppContext.init(sc);
        new App(sc).run();
        return outputStream.toString();
    }

}
