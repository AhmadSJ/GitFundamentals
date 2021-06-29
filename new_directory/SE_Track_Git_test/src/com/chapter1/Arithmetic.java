package com.chapter1;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.function.Predicate;



public class Arithmetic {
//Added some comments in the new_branch
    public static void main(String[] args){
        int i=0, j=0;
        X1: for(i = 0; i < 3; i++){
            
            X2: for(j = 3; j > 0; j--){
                System.out.println(("i: " + i) + (" j: " +j));
                if(i < j) continue X1;
                else break X2;
            }
        }
        System.out.println(i+" "+j);
    }

}

