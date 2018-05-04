package quicksort;

import java.util.List;

/**
 * @description:
 * @author: zmh
 * @createtime: 2018/5/3
 */

public class Quick{
    //继承Comparable接口才可以比较  不然无法比
    public <T extends Comparable<T>> void sort(List<T> tList,int begin,int end){
        if(begin>=end){
            return;
        }
        //记录下左端右端开始的位置，方便递归
        int beginLeft=begin;
        int beginRight=end;
        //设置要确序的数组下标
        int base=begin;
        //设置中间变量
        T tmp;
        //设置左端or右端移动的标志,因为基数是左端，所以默认必须右端开始移动
        int left=-1;
        while(begin<end){
            //如果是右端在移动
            if(left==-1){
                //如果右端的值小于中间变量的值，则互换位置
                //自定义类的话要重写compareTo
                if(tList.get(end).compareTo(tList.get(base))<0){
                    tmp=tList.get(base);
                    tList.set(base,tList.get(end));
                    tList.set(end,tmp);
                    base=end;
                    left=1;
                    continue;
                }
                end--;
            }else {
                //如果左端的值大于中间变量的值，则互换位置
                if(tList.get(begin).compareTo(tList.get(base))>0 ){
                    tmp=tList.get(base);
                    tList.set(base,tList.get(begin));
                    tList.set(begin,tmp);
                    base=begin;
                    left=-1;
                    continue;
                }
                begin++;
            }
        }
        sort(tList,beginLeft,base-1);
        sort(tList,base+1,beginRight);
    }
}
