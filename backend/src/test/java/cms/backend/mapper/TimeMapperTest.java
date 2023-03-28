package cms.backend.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TimeMapperTest {

    @Autowired
    private TimeMapper timeMapper;

    @Test
    void getTime() {
        System.out.println("time : " + timeMapper.getTime());
    }
}