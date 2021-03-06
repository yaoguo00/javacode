package code_practice.day_06;

/**
 * @author guoyao
 * @create 2020/3/13
 */

//2的个数
public class Test8 {

    public static int countNumberOf2(int n){
        int count=0;  //最终2的个数
        int factor=1;  //从低位到高位计算2的个数
        int low=0;  //屏蔽掉低位
        int current=0; //当前计算位数的值
        int high=0;  //计算高位
        while (n/factor!=0){
            low=n-(n/factor)*factor;
            current=(n/factor)%10;
            high=n/(factor*10);
            //根据当前的
            switch (current){
                case 0:
                case 1:
                    count+=high*factor;
                case 2:
                    count+=high*factor+low+1;
                    break;
                    default:
                        count=(high+1)*factor;
                        break;
            }
            factor*=10;
        }
        return count;
    }

}
