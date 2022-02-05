import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemo1Practice4Test {
    @Test
    public void test1(){
        assertEquals("happy 49th birthday", 
                    SkillDemo1Practice4.birthday(50));
    }
}
