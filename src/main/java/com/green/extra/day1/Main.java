package com.green.extra.day1;

class Main {
    public static void main(String[] args) {
        System.out.println(args.length);
        for(int i=0; i<args.length; i++) {
            System.out.printf("args[%d]: %s\n", i, args[i]);
        }
        System.out.println("----------");
        for(String s : args) {
            System.out.println(s);
        }
    }
}

class Util {

}

class Util2 {

}

class Util3 {

}