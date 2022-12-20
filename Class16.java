import java.util.ArrayList;
class CTest extends Thread
{
    private int id;
    private int id2;
    public CTest(int str,int ss)
    {
        id=str;
        id2=ss;
    }
    public void run()
    {
        ArrayList<Integer>all=new ArrayList<>();
        int i,j;
        for (i=id;i<=id2;i++){
            for (j=2;j<i;j++){
                if(i%j==0){
                    break;
                }

            }
            if(j==i){
                all.add(i);
            }

        }
        System.out.println(id+"到"+id2+"的質數數量:"+all.size());
    }
}

public class Class16
{
    public static void main(String args[])
    {


        CTest fir=new CTest(2,100000);
        CTest sec=new CTest(100000,200000);
        long time1,time2,time3;
        time1 = System.currentTimeMillis();
        fir.run();
        time2 = System.currentTimeMillis();
        sec.run();
        time3 = System.currentTimeMillis();
        double ans1=(time2-time1)/1000;
        double ans2=(time3-time2)/1000;
        System.out.println("第一個程式花費:"+ans1+"秒");
        System.out.println("第二個程式花費:"+ans2+"秒");

    }
}
