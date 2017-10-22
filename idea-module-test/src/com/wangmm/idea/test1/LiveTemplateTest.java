package com.wangmm.idea.test1;

/**
 * Created by iacct_000 on 2017/9/21.
 */
public class LiveTemplateTest {
    private static int a;
    private static boolean b;

    public static void main(String args[]){
        int b = 3;
        LiveTemplateTest.a = 1;
        System.out.println("-----------wangmm-----------a值=" + LiveTemplateTest.a + "," + "当前类=LiveTemplateTest.main()");
        LiveTemplateTest.b = false;
        assert LiveTemplateTest.b;
        String s;


    }
}
