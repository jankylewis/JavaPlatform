package javaProgrammingParadigms.metaProgramming;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class sample1 {

    public static void main(String[] args) {
        InvocationHandler handler = new MyInvocationHandler();
        Calculator proxy = (Calculator) Proxy.newProxyInstance(
                Calculator.class.getClassLoader(),
                new Class[]{Calculator.class},
                handler
        );

        int result = proxy.add(2, 3);
        System.out.println("Result: " + result);
    }

    static interface Calculator {
        int add(int x, int y);
    }

    static class MyInvocationHandler implements InvocationHandler {
        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("Calling method: " + method.getName());
            return method.invoke(null, args);
        }
    }
}