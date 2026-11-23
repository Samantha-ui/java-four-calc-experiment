import org.junit.Test;
import static org.junit.Assert.*;

/**
 * JUnit单元测试：校验题目生成结果范围0<result<100
 */
public class QuestionTest {

    @Test
    public void testAdd(){
        AddQuestion q = new AddQuestion(2);
        q.generate();
        assertTrue(q.getResult()>0 && q.getResult()<100);
    }
    @Test
    public void testSub(){
        SubQuestion q = new SubQuestion(2);
        q.generate();
        assertTrue(q.getResult()>0 && q.getResult()<100);
    }
    @Test
    public void testMul(){
        MulQuestion q = new MulQuestion(2);
        q.generate();
        assertTrue(q.getResult()>0 && q.getResult()<100);
    }
    @Test
    public void testDiv(){
        DivQuestion q = new DivQuestion(2);
        q.generate();
        assertTrue(q.getResult()>0 && q.getResult()<100);
    }
    @Test
    public void testThreeAdd(){
        AddQuestion q = new AddQuestion(3);
        q.generate();
        assertTrue(q.getResult()>0 && q.getResult()<100);
    }
}
