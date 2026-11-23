class DivQuestion extends Question {
    private int count;
    public DivQuestion(int count) {
        this.count = count;
    }
    @Override
    public void generate() {
        if(count ==2){
            do{
                num2 = rand.nextInt(49)+1;
                int k = rand.nextInt(49)+1;
                num1 = num2 * k;
                result = num1 / num2;
            }while(num1>=100 || result >=100 || result <=0);
            expr = num1 + " / " + num2;
        }else{
            do{
                num3 = rand.nextInt(20)+1;
                int k2 = rand.nextInt(20)+1;
                int midRes = num3 * k2;
                num2 = rand.nextInt(20)+1;
                int k1 = rand.nextInt(20)+1;
                num1 = num2 * midRes;
                result = num1 / num2 / num3;
            }while(num1>=100 || result >=100 || result <=0);
            expr = num1 + " / " + num2 + " / " + num3;
        }
    }
}
