package com.codegym.task.task19.task1928;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* 
Correct the bug. Classes and interfaces
This program has just 1 logical error.
Find and fix it.


Requirements:
1. The Solution class must contain an Example interface.
2. The Solution class must contain an A class that implements the Example interface.
3. The Solution class must contain a B class that implements the Example interface.
4. The Solution class must contain a C class that inherits the A class.
5. Correct just one error in the logic.
*/

//public class Solution {
//    {
//        System.out.println("This is the Solution class");
//    }
//
//    public static void main(String... args) throws IOException {
//        try (
//                FileOutputStream outputStream = new FileOutputStream(args[0]);
//                InputStream is = Solution.class.getClassLoader().getResourceAsStream(args[1]);
//        ) {
//
//            byte[] b = new byte[is.available()];
//            outputStream.write(is.read(b));
//
//            int value = 123_456_789;
//            System.out.println(value);
//
//            Example result = null;
//            String s = "a";
//            switch (s) {
//                case "a": {
//                    result = new Solution().new A();
//                    break;
//                }
//                case "b": {
//                    result = new Solution().new B();
//                    break;
//                }
//                case "c": {
//                    result = new Solution().new C();
//                    break;
//                }
//            }
//
//            if (result instanceof C) {
//                C p = (C) result;
//                System.out.println(p.getClass().getSimpleName());
//            }
//
//        } catch (IOException e) {
//        }
//    }
//
//    interface Example {
//    }
//
//    class A implements Example {
//        {
//            System.out.println("This is the A class");
//        }
//    }
//
//    class B implements Example {
//        {
//            System.out.println("This is the B class");
//        }
//    }
//
//    class C extends A {
//        {
//            System.out.println("This is the C class");
//        }
//    }
//}
