import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.util.Scanner;

public class AppTest {
    @Test
    @DisplayName("'== 명언앱 =='출력")
    void t1(){
        Scanner sc = TestUtil.genScanner("종료");
        ByteArrayOutputStream outputStream = TestUtil.setOutByteArray();
        new App(sc).run();
        String out = outputStream.toString();
        Assertions.assertThat(out).contains("== 연언 앱 ==");
    }
}
