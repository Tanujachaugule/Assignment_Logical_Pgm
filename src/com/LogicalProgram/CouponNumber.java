package com.LogicalProgram;

public class CouponNumber {
    public static void main(String[] args) {
        char[] chars="tanujachaugule".toCharArray();
        int max=100000;
        int random=(int) (Math.random()*max);
        StringBuffer stringbuilder=new StringBuffer();
        while(random>0)
        {
            stringbuilder.append(chars[random % chars.length]);
            random /= chars.length;
        }
        String couponCode=stringbuilder.toString();
        System.out.println("Coupon Code:" + couponCode);
    }
}
