class AddQuestion extends Question {
    private int count;
    public AddQuestion(int count) {
        this.count = count;
    }
    @Override
    public void generate() {
        if(count == 2){
            do{
                num1 = rand.nextInt(99)+1;
                num2 = rand.nextInt(99)+1;
                result = num1 + num2;
            }while(result >=100 || result <=0);
            expr = num1 + " + " + num2;
        }else{
            do{
                num1 = rand.nextInt(99)+1;
                num2 = rand.nextInt(99)+1;
                num3 = rand.nextInt(99)+1;
                result = num1 + num2 + num3;
            }while(result >=100 || result <=0);
            expr = num1 + " + " + num2 + " + " + num3;
        }
    }
}
