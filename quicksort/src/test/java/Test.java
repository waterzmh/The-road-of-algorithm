import quicksort.Quick;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @description:
 * @author: zmh
 * @createtime: 2018/5/3
 */

public class Test {
    @org.junit.Test
    public void test1(){
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        List<Integer> integerList=new ArrayList<>();
        integerList.add(1);
        integerList.add(8);
        integerList.add(7);
        integerList.add(5);
        integerList.add(12);
        integerList.add(1);
        integerList.add(1);
        integerList.add(11312);
        integerList.add(12);
        integerList.add(12);
        integerList.add(12);
        Quick quick=new Quick();
        quick.sort(integerList,0,integerList.size()-1);
        integerList.forEach(i-> System.out.println(i));
    }
    @org.junit.Test
    public void test2(){
        List<Integer> integerList=new ArrayList<>();
        integerList.add(1);
        integerList.add(8);
        integerList.add(7);
        integerList.add(5);
        integerList.add(12);
        integerList.add(11312);
        integerList.add(12);
        integerList.add(12);
        integerList.add(12);
        Quick quick=new Quick();
        quick.sort(integerList,0,integerList.size()-1);
        integerList.forEach(i-> System.out.println(i));
    }
    @org.junit.Test
    public void test3(){
        List<Integer> integerList=new ArrayList<>();
        integerList.add(1);
        integerList.add(8);
        integerList.add(7);
        integerList.add(1);
        integerList.add(11312);
        integerList.add(12);
        integerList.add(12);
        integerList.add(12);
        Quick quick=new Quick();
        quick.sort(integerList,0,integerList.size()-1);
        integerList.forEach(i-> System.out.println(i));
    }
}
