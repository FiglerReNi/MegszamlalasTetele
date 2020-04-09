/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FReni
 */
public class Megszamlalastetele {
    public static void main(String[]args){
        int[] a=new int[16];
        for(int i=0; i<a.length; i++){
            a[i]=(int)(Math.random()*10);
            System.out.print(a[i]+" ");
        }
        int db=0;
        for(int i=0; i<a.length; i++){
            if(a[i]==5){
                db=db+1;
            }
        }
        System.out.println();
        System.out.println("Az ötös dobások száma: "+db);
    }    
}
