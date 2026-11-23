import java.util.Random;

// 基类 题目
abstract class Question {
    protected int num1, num2, num3;
    protected int result;
    protected String expr;
    protected Random rand = new Random();

    public abstract void generate();
    public String getExpr() { return expr; }
    public int getResult() { return result; }
}
