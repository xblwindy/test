package com.jcohy.scis.test;

import java.util.HashMap;

public class Daily03 {

    /**
     * 639172每个位数上的数字都是不同的，且平方后所得数字的所有位数都不会出现组成它自身的数字。
     * （639172*639172=408540845584），类似于639172这样的6位数还有几个？分别是什么？
     * 这题采用的HashMap结构判断有无重复，也可以采用下题的数组判断。
     */
    public void selectNum(){
        for(long n = 100000; n <= 999999;n++){
            if(isSelfRepeat(n))                    //有相同的数字，则跳过
                continue;
            else if(isPingFangRepeat(n*n,n)){    //该数的平方中是否有与该数相同的数字
                continue;
            }
            else{                                //符合条件，则打印
                System.out.println(n);
            }
        }
    }

    public boolean isSelfRepeat(long n){
        HashMap<Long,String> m=new HashMap<Long,String>();
        //存储的时候判断有无重复值
        while(n!=0){
            if(m.containsKey(n%10)){
                return true;
            }
            else{
                m.put(n%10,"1");
            }
            n=n/10;
        }
        return false;
    }

    public boolean isPingFangRepeat(long pingfang,long n){
        HashMap<Long,String> m=new HashMap<Long,String>();
        while(n!=0){
            m.put(n%10,"1");
            n=n/10;
        }

        while(pingfang!=0){
            if(m.containsKey(pingfang%10)){
                return true;
            }
            pingfang=pingfang/10;
        }
        return false;
    }

    public static void main(String args[]){
        new Daily03().selectNum();
    }

}
