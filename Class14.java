class Prepaid extends  Thread{
    private static int sum=200;
    public void run(){
        int fee;
        while (sum > 10){
            fee=(int)(Math.random()*100);
            talk(fee);
        }
    }
    public synchronized static void talk(int n){
        int tmp=sum-n;
        try{
            sleep((int)(1000*Math.random()));
        }
        catch (InterruptedException e){}
            if (tmp>10){
                sum=tmp;
                System.out.println("通話費:"+n+"元");
                System.out.println("餘額    :"+sum+"元");
            }

    }

}
public class Class14{
    public static void main(String[] args) {
        Prepaid phone1 = new Prepaid();
        Prepaid phone2 = new Prepaid();
        Prepaid phone3 = new Prepaid();
        phone1.start();
        phone2.start();
        phone3.start();
    }
}