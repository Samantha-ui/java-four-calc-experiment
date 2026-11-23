class SubQuestion extends Question {
    private int count;
    public SubQuestion(int count) {
        this.count = count;
    }
    @Override
    public void generate() {
        if(count ==2){
            do{
                num1 = rand.nextInt(99)+1;
                num2 = rand.nextInt(num1)+1;
                result = num1 - num2;
            }while(result >=100 || result <=0);
            expr = num1 + " - " + num2;
        }else{
            do{
                num1 = rand.nextInt(99)+1;
                num2 = rand.nextInt(num1)+1;
                int mid = num1 - num2;
                num3 = rand.nextInt(mid)+1;
                result = mid - num3;
            }while(result >=100 || result <=0);
            expr = num1 + " - " + num2 + " - " + num3;
        }
    }
}
