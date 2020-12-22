package com.neda.backend;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Random;

public class Hesab3 {
    static Scanner input = new Scanner(System.in);
    static String lastTarakonesh = "";
    static int hesab = 0;
    static int mablagh = 0;
    static int j = 0;
    static int y = 0;
    static Boolean e = true;
    static ArrayList<String> comment = new ArrayList<>();
    static ArrayList<Integer> Account = new ArrayList<Integer>();
    static HashMap<Integer, Integer> alist = new HashMap<>();

    static {
        alist.put(60376977, 100);
        alist.put(60376988, 200);
        alist.put(60376999, 300);
        alist.put(60376966, 400);
        alist.put(60376911, 500);
        alist.put(60376912, 550);
        alist.put(60376913, 365);
        alist.put(60376914, 466);
        alist.put(60376915, 751);
        alist.put(60376916, 965);
        alist.put(60376917, 854);
        alist.put(60376918, 580);
        alist.put(60376919, 365);
        alist.put(60376955, 789);
        alist.put(60376922, 695);
    }

    public static void main(String[] args) {
//        alist.put(60376977, 100);
//        alist.put(60376988, 200);
//        alist.put(60376999, 300);
//        alist.put(60376966, 400);
//        alist.put(60376911, 500);
//        alist.put(60376912, 550);
//        alist.put(60376913, 365);
//        alist.put(60376914, 466);
//        alist.put(60376915, 751);
//        alist.put(60376916, 965);
//        alist.put(60376917, 854);
//        alist.put(60376918, 580);
//        alist.put(60376919, 365);
//        alist.put(60376955, 789);
//        alist.put(60376922, 695);
        System.out.println("salam  shomare hesab karbar ra vared konid :");
        hesab = alist.get(input.nextInt());
        while (e) {
            System.out.println(
                    "\n-->1-mojoodi\n-->2-seporde gozari\n-->3-bardash\n-->4-akharin tarakonesh\n-->5-dah tarakonesh akhar\n-->6-soode seporde\n-->7-ghorekeshi \n-->8-ghorekeshie ajib\n-->9-khorooj");

            int x = input.nextInt();
            switch (x) {

                case 1:
                    Mojoodi(hesab);
                    break;

                case 2:
                    SepordeGozari();
                    break;

                case 3:
                    Bardasht();
                    break;

                case 4:
                    AkharinTarakonesh();
                    break;

                case 5:
                    DahTarakonesheAkhar();
                    break;

                case 6:
                    SoodeSeporde();
                    break;
                case 7:
                    Ghorekeshi();
                    break;

                case 8:
                    GhorekeshiAjib();
                  
                     break;
                case 9:
                    khorooj();
                    break;
            }
        }
    }

    public static void Mojoodi(int hesab) {
        System.out.printf("mojoodi hesab : %d", hesab);
    }
    public static void SepordeGozari() {
        System.out.println("seporde jadid ra vared namaeed :");
        int y = input.nextInt();
        String a=" tooman variz";
        hesab = hesab + y;
        Account.add( y);
        comment.add("variz");
        lastTarakonesh = y+a;
    }
    public static void Bardasht(){
        System.out.println("mablagh bardashtie khod ra vared konid : ");
        j=input.nextInt();
        String a=" tooman bardasht ";
        if(j<=hesab){
          Account.add( j);
            hesab=hesab-j;
            comment.add("bardasht"); 
            lastTarakonesh=j+a; 
        }
        else{
            System.out.println("mablagh vared shode az mojoodi hesab shoma bishtar ast");
        }
    }
    public static void AkharinTarakonesh(){
        System.out.printf(lastTarakonesh);
    }
    public static void DahTarakonesheAkhar(){
        System.out.println("10 trakonesh last:");

        for (int i = 0; i < Account.size(); i++) {
            System.out.println(Account.get(i)+comment.get(i));
            
        }
    }
    public static void SoodeSeporde(){
        System.out.println("soode hesab :");
        float sood =  (float) (hesab * 31 * 0.14);
        System.out.println(sood);
    }
    public static void Ghorekeshi(){
        System.out.println("mablagh ra vared konid :");
       mablagh=input.nextInt();
       String a="tooman variz";
       Random in = new Random();
       Object [] values =  alist.values().toArray();
       int randomvalue= (int )values[in.nextInt(values.length)];
       hesab=mablagh+randomvalue;
       lastTarakonesh=mablagh+a;
       Account.add( mablagh);
       comment.add("variz");

    }
   public static void GhorekeshiAjib(){
    Random rnd=new Random();
    long number=10000000+rnd.nextInt(99999999);
    int Account=15;
    while (sumDigit(number)>=Account) {
        long x=sumDigit(number);
        x=(x*3)+1;
        number=x;    
    } 
    long win=sumDigit(number);
    System.out.printf("farde %d barandey ghorekeshi ast. ",win);
     
}

public static long sumDigit(Long number){  
        if (number<10) {
            return number;
        } else {  
            
            return number%10+sumDigit(number/10); 
        }
        }

    public static void khorooj() {
                e=false;
            }
        }

        
    

    

    


       

    
    