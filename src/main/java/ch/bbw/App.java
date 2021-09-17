package ch.bbw;

import java.util.ArrayList;
import java.util.Scanner;

public class App{
    static ArrayList<Integer> a = new ArrayList<>();
    static ArrayList<Integer> b = new ArrayList<>();

    public static void main( String[] args ){
        int result = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("give Nr 1 and 2, one per line");
        a.add(Integer.valueOf(in.nextLine()));
        b.add(Integer.valueOf(in.nextLine()));

        fillLists();

        for(int i: a){ // remove all values from b, where a is even
            if(i % 2 == 0){
                b.set(a.indexOf(i), 0); // set(i, 0), because remove() alters the num of items in b
            }
        }
        for(int i: b){
            result += i;
        }
        System.out.println("= " + result);
    }
    private static void fillLists(){
        Integer currentA = a.get(0);
        Integer currentB = b.get(0);
        while(currentA > 1){
            currentA = (int) Math.floor(currentA/2);
            currentB *= 2;
            a.add(currentA);
            b.add(currentB);
        }
    }
}
