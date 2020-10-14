package com.harley.leetcode.api;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class No860 {
    public static void main(String[] args) {
        No860 no860 = new No860();
        int[] bills = new int[]{5,5,5,10,20};
        boolean b = no860.lemonadeChange(bills);
        System.out.println(b);
    }

    public boolean lemonadeChange(int[] bills) {
        //统计当前手里可用的零钱
        List<Integer> list = new ArrayList<>();

        //顾客开始买水
        for(int bill : bills) {
            list.add(bill);
            if(bill == 5) {
                //只给5元，不找零
                continue;
            } else if(bill == 10) {
                //给10元，找五元
                if(list.contains(5)) {
                    Iterator<Integer> it=list.iterator();
                    while(it.hasNext()){
                        if(it.next()==5){
                            it.remove();
                            break;
                        }
                    }
                } else{
                    //没有5元  没法找
                    return false;
                }
            } else {
                //给20元，找15元
                if(list.contains(10)) {
                    //给1张10元，1张5元
                    boolean flag10 = true;
                    boolean flag5 = true;
                    Iterator<Integer> it=list.iterator();
                    while(it.hasNext()){
                        Integer next = it.next();
                        if(next==5){
                            if(flag5) {
                                it.remove();
                                flag5 = false;
                            }
                        } else if(next==10){
                            if(flag10) {
                                it.remove();
                                flag10 = false;
                            }
                        }

                        if(!flag5 && !flag10) {
                            break;
                        }
                    }

                    if(flag5 || flag10) {
                        return false;
                    }
                } else {
                    //判断有没有3张5元的
                    int num5 = 0;
                    Iterator<Integer> it=list.iterator();
                    while(it.hasNext()){
                        if(it.next()==5){
                            it.remove();
                            num5++;
                        }
                        if(num5 == 3) {
                            break;
                        }
                    }

                    if(num5 != 3) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
