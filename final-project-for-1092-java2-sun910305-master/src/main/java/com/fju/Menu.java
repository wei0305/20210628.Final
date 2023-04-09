package com.fju;

public class Menu {
//餐點品項
    String Latte = "莊園拿鐵";
    String Cappuccino = "卡布奇諾";
    String OrangeGreenTea = "鮮橙綠茶";
    String EggBurger = "起司蛋堡";
    String Bagel = "火腿貝果";
    String SmallRedTea = "超值紅茶";
    String SmallAmericano = "小熱美式";
    String SetA = "A套餐"; //"起司蛋堡" + "超值紅茶", +15元
    String SetB = "B套餐"; //"火腿貝果" + "小熱美式", +20元




//ice,hot
    String I;
    String H;



//餐點數量
    int l;
    int c;
    int o;
    int e;
    int b;
    int seta;
    int setb;



//餐點價格
    int priceL = 75;
    int priceC = 95;
    int priceO = 50;
    int priceE = 55;
    int priceB = 60;
    int priceSetA = 70;
    int priceSetB = 80;







//選單
    public void list(){
        System.out.println("1. " + Latte + "\t" + priceL + "元");
        System.out.println("2. " + Cappuccino + "\t" + priceC + "元");
        System.out.println("3. " + OrangeGreenTea + "\t" + priceO + "元");
        System.out.println("4. " + EggBurger + "\t" + priceE + "元");
        System.out.println("5. " + Bagel + "\t" + priceB + "元");
        System.out.println("A, " + "起司蛋堡 +15元搭配超值紅茶" + "\t " + priceSetA + "元");
        System.out.println("B, " + "火腿貝果 +20元搭配小熱美式" + "\t " + priceSetB + "元");
    }


}
