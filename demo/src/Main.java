import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Question> qList = new ArrayList<>();
        while(true){
            System.out.println("========四则运算习题生成器========");
            System.out.println("1.两数加法 | 2.两数减法 |3.两数乘法 |4.两数除法");
            System.out.println("5.三数加法 |6.三数减法 |7.三数乘法 |8.三数除法");
            System.out.println("0.退出程序");
            System.out.print("请选择题型：");
            if(!sc.hasNextInt()){
                System.out.println("输入非法，请输入数字！\n");
                sc.next();
                continue;
            }
            int op = sc.nextInt();
            if(op ==0) break;
            if(op <1 || op>8){
                System.out.println("选项范围0‑8！\n");
                continue;
            }
            System.out.print("输入出题数量：");
            if(!sc.hasNextInt()){
                System.out.println("输入非法！\n");
                sc.next();
                continue;
            }
            int total = sc.nextInt();
            if(total <=0){
                System.out.println("数量必须大于0！\n");
                continue;
            }
            //批量生成题目
            for(int i=0;i<total;i++){
                Question q = null;
                switch (op){
                    case 1: q = new AddQuestion(2);break;
                    case 2: q = new SubQuestion(2);break;
                    case 3: q = new MulQuestion(2);break;
                    case 4: q = new DivQuestion(2);break;
                    case 5: q = new AddQuestion(3);break;
                    case 6: q = new SubQuestion(3);break;
                    case 7: q = new MulQuestion(3);break;
                    case 8: q = new DivQuestion(3);break;
                }
                q.generate();
                qList.add(q);
            }
            //控制台：每行输出5道题目
            System.out.println("\n====生成习题====");
            for(int i=0;i<qList.size();i++){
                System.out.printf("%-12s ", qList.get(i).getExpr()+"=?");
                if((i+1)%5 ==0){
                    System.out.println();
                }
            }
            System.out.println("\n");
            //导出CSV文件 exercise.csv
            exportCsv(qList);
            System.out.println("题目已导出至exercise.csv\n");
            qList.clear();
        }
        System.out.println("程序结束");
        sc.close();
    }

    /**
     * 将题目列表导出csv，逗号分隔
     */
    public static void exportCsv(List<Question> list){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("exercise.csv"))){
            bw.write("题号,表达式,答案");
            bw.newLine();
            for(int i=0;i<list.size();i++){
                Question q = list.get(i);
                String line = (i+1)+","+q.getExpr()+"=?,"+q.getResult();
                bw.write(line);
                bw.newLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
