package org.benf.cfr.tests;


import org.benf.cfr.tests.support.UnaryFunction;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 18:48
 * To change this template use File | Settings | File Templates.
 */
public class LambdaTest3 {

    Integer invoker(int arg, UnaryFunction<Integer, Integer> fn) {
        return fn.invoke(arg);
    }

    public int test(int y, Object o) {
//        return invoker(3, x -> x + y + 1 + (o.toString().length()));
        return 2;
    }

}
