package pascaltriangle;

import java.util.HashMap;

/**
 * @description:杨辉三角
 * @author: zmh
 * @createtime: 2018/4/27
 */

public class PascalTriangle {
    /**
     * 设定的总层数,n=0表示第一层
     */
    private int n;
    /**
     *
     * @param n  要打印的总层数
     */
    public void printTriangle(int n){
        //如果n小于0则返回，说明输入的层数有误
        if(n<0){
            return;
        }
        this.n=n;

        //传入0和第0层的数据
        Integer[] integers=new Integer[1];
        integers[0]=1;
        concreteRealization(0,integers);
    }

    public void concreteRealization(int n,Integer[] upperstoryIntegers){
        //创建该层对应数量的数组
        Integer[] integers=new Integer[n+1];
        //收尾值设为1
        integers[0]=1;
        integers[n]=1;
        //依次给中间赋值，结合上一层的数值
        for(int i=1;i<integers.length-1;i++){
            integers[i]=upperstoryIntegers[i-1]+upperstoryIntegers[i];
        }
        //根据层数来决定首个数字的空格，这里默认三个空格为数值所占位置，如果数值过千则要重新设计，否则打印的内容会逼死强迫症
        for(int i=this.n;i>n;i--){
            //三个空格
            System.out.print("   ");
        }
        for(int i:integers){
            //如果是个位数和十位数则在前方补一个空格
            if(i>0 && i<100){
                System.out.print(" ");
            }
            System.out.print(i+"   ");
            //如果是个位数则尾部也要补一个空格
            if(i>0 && i<10){
                System.out.print(" ");
            }
        }
        System.out.println();
        //如果运行到行数相同了则返回，不再继续递归
        if(n==this.n){
            return;
        }
        concreteRealization(n+1,integers);
    }
}
