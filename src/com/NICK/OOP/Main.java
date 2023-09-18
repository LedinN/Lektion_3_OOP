package com.NICK.OOP;

import com.NICK.OOP.model.Student;

public class Main {
    public static void main(String[] args) {

        //Instantiate object
        Student benny = new Student("Benny",15,true);
        Student frida = new Student("Frida",19,false);

        System.out.println(benny.name);
        System.out.println(benny.age);
        System.out.println(benny.name + " wants coffee? " + benny.wantCoffee);

        System.out.println(frida.name);
        System.out.println(frida.age);
        System.out.println(frida.name + " wants coffee: " + frida.wantCoffee);

        /*
        int sum = 0;
        int sum2 = 0;

        sum = addition(15,15); //This returns
        addition2(15,15); //This does NOT return
        System.out.println(sum);
    }
    public static int addition(int x, int y){
        return x+y;
    }

    /* How to create a method
    * #1 Visibility modifier: public, protected, no mod, private
    * #2 Static: exclude if not needed
    * #3 Datatype to return: Send data. If nothing, set 'void'
    * #4 Name: camelCase (addTwoNumbers) followed by () then {}
     */
/*
        public static void addition2 ( int x, int y){

        }
*/

    }
}
