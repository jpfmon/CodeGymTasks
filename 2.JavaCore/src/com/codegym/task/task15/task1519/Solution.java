package com.codegym.task.task15.task1519;

import java.io.*;

/* 
Different methods for different types
Different methods for different types
1. Read data from the console until the word "exit" is entered.
2. For each value (except "exit"), call the print method. If the value:
2.1. contains a period ("."), then call the print method for Double;
2.2. is greater than zero, but less than 128, then call the print method for short;
2.3. less than or equal to zero or greater than or equal to 128, then call the print method for Integer;
2.4. otherwise, call the print method for String.


Requirements:
1. The program must read data from the keyboard.
2. The program should stop reading data from the keyboard after "exit" is entered.
3. If the entered string contains a period (".") and can be correctly converted to a Double, the print(Double value) method should be called.
4. If the entered string can be correctly converted to a short and the resulting number is greater than 0, but less than 128, the print(short value) method should be called.
5. If the entered string can be correctly converted to an Integer and the resulting number is less than or equal to 0 or greater than or equal to 128, the print(Integer value) method should be called.
6. In all other cases, the print(String value) method should be called.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //write your code here

        Double doble;
        Short corto;
        Integer integer;

        InputStream inputStream = System.in;

        Reader inputStreamReader = new InputStreamReader(inputStream);

        BufferedReader buffer = new BufferedReader(inputStreamReader);

        while(true){
            boolean integerOk=false;
            boolean dobleOk=false;
            boolean cortoOk=false;
            boolean canBeDouble=false;
            String text = buffer.readLine();

            if(text.equals("exit")){
                print(text);
                break;
            }

            char[] car = text.toCharArray();

            for(char c:car) {
                if (c == '.') {
                    canBeDouble = true;
                    break;
                }
            }

            if(canBeDouble){
                try{
                        doble = Double.parseDouble(text);
                        dobleOk =true;
                        print(doble);
                    }catch (Exception e){

                    }
            } else{
                try{
                        corto = Short.parseShort(text);
                        cortoOk =true;
                        if(corto<128 && corto>0){
                            print(corto);
                        }else{
                            try{
                                integer = Integer.parseInt(text);
                                integerOk = true;
                                print(integer);
                            }catch (Exception e){

                            }
                        }
                    }catch (Exception e){
                    }

                    if(!cortoOk && !integerOk){
                        try{
                            integer = Integer.parseInt(text);
                            integerOk = true;
                            print(integer);
                        }catch (Exception e){

                        }
                    }

                if(!cortoOk && !dobleOk && !integerOk){
                    print(text);
                }
            }
        }




    }

    public static void print(Double value) {
        System.out.println("This is a Double. Value: " + value);
    }

    public static void print(String value) {
        System.out.println("This is a String. Value: " + value);
    }

    public static void print(short value) {
        System.out.println("This is a short. Value: " + value);
    }

    public static void print(Integer value) {
        System.out.println("This is an Integer. Value: " + value);
    }
}
