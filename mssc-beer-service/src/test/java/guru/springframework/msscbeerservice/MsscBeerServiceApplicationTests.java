package guru.springframework.msscbeerservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
class MsscBeerServiceApplicationTests {

    @Test
    void contextLoads() {
        int a = 1;
        assertThat(a).isEqualTo(1);
    }

}
