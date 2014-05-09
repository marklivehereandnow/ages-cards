/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.livehereandnow.ages.util;

/**
 *
 * @author mark
 */
public class CardContentParser {

    public int getTodoCnt() {
        return todoCnt;
    }

    private void setTodoCnt(int todoCnt) {
        this.todoCnt = todoCnt;
    }

    public int getDoneCnt() {
        return doneCnt;
    }

    private void setDoneCnt(int doneCnt) {
        this.doneCnt = doneCnt;
    }

    public boolean isComplete() {
        return isComplete;
    }

    private void setIsComplete(boolean isComplete) {
        this.isComplete = isComplete;
    }

    private int todoCnt = 0;
    private int doneCnt = 0;
    private boolean isComplete = false;

    public void doParse(String content) {

        String cmd = content;
        String[] strTokens = cmd.split(";");// **it's in Chinese, 2 bytes***
//            System.out.println(strTokens);
//        System.out.println("===================================================================");
//        System.out.println("\n" + this.ID + " " + this.卡名 + "=>=>" + this.內容);
        for (String item : strTokens) {
//            System.out.println(item);
            todoCnt++;
//                 System.out.println("--------------------------------------------------------------");

        }
//        System.out.println("----------------------------已解析-----------------------------------");
        for (String item : strTokens) {//按每個句子解析，句子是按分號區隔開來的
            if (item.length() > 0) {
//                    String[] strTokens2 = item.split("[+]");
                String[] strTokens2 = item.split("[:]");//以冒號隔開，左邊的為key，右邊的val

                String key = strTokens2[0];//key是字符串
                String valStr="";
                int val = -999;//val是整數，使用Integer的解析功能，如果不能解析成整數，系統會報錯
                try {
                    valStr = strTokens2[1];
                    val = Integer.parseInt(strTokens2[1]);//val是整數，使用Integer的解析功能，如果不能解析成整數，系統會報錯
                } catch (Exception ex) {

                }
                switch (key) {
                    case "內政點數":
//                        System.out.println(key + ":" + val);
                        doneCnt++;
                        break;
                    case "軍事點數":
//                        System.out.println(key + ":" + val);
                        doneCnt++;
                        break;
                    case "建築上限":
//                        System.out.println(key + ":" + val);
                        doneCnt++;
                        break;
                    case "內政手牌上限":
//                        System.out.println(key + ":" + val);
                        doneCnt++;
                        break;
                    case "軍事手牌上限":
//                        System.out.println(key + ":" + val);
                        doneCnt++;
                        break;
                    case "軍力":
//                        System.out.println(key + ":" + val);
                        doneCnt++;
                        break;
                    case "資源":
//                        System.out.println(key + ":" + val);
                        doneCnt++;
                        break;

                    case "每個玩家免費擴充人口":
//                        System.out.println(key + ":" + val);
                        doneCnt++;
                        break;

                    case "食物":
//                        System.out.println(key + ":" + val);
                        doneCnt++;
                        break;

                    case "科技":
//                        System.out.println(key + ":" + val);
                        doneCnt++;
                        break;

                    case "文化":
//                        System.out.println(key + ":" + val);
                        doneCnt++;
                        break;

                    default:
                        System.out.println("   不知道, [key]=" + key+" [val]="+valStr);

                }
                /*
    
                 if (key.equals("內政點數")) {
                 System.out.println("內政點數:" + val);
                 this.whitePoints.setPoints(val);
                 doneCnt++;
                 }
                 if (key.equals("軍事點數")) {
                 System.out.println("軍事點數:" + val);
                 //                        System.out.println("1234567");
                 this.redPoints.setPoints(val);
                 doneCnt++;
                 }
                 if (key.equals("建築上限")) {
                 System.out.println("建築上限:" + val);
                 doneCnt++;
                 }

                 if (key.equals("內政手牌上限")) {
                 System.out.println("內政手牌上限:" + val);
                 doneCnt++;
                 }

                 if (key.equals("軍事手牌上限")) {
                 System.out.println("軍事手牌上限:" + val);
                 doneCnt++;
                 }
                 if (key.equals("軍力")) {
                 System.out.println("軍力:" + val);
                 doneCnt++;
                 }
                 if (key.equals("每個玩家免費擴充人口")) {
                 System.out.println("每個玩家免費擴充人口:" + val);
                 doneCnt++;
                 }
                 if (key.equals("資源")) {
                 System.out.println("資源:" + val);
                 doneCnt++;
                 }
    
                 if (key.equals("食物")) {
                 System.out.println("食物:" + val);
                 doneCnt++;
                 }

                 if (key.equals("科技")) {
                 System.out.println("科技:" + val);
                 doneCnt++;
                 }

                 if (key.equals("文化")) {
                 System.out.println("文化:" + val);
                 doneCnt++;
                 }

                 //                    if (key.equals("科技生產")) {
                 //                        System.out.println("科技生產:" + val);
                 //                        doneCnt++;
                 //                    }                   
                 if (key.equals("文化生產")) {
                 System.out.println("文化生產:" + val);
                 doneCnt++;
                 }

                 //                    if (key.equals("文化生產")) {
                 //                        System.out.println("文化生產:" + val);
                 //                        doneCnt++;
                 //                    }
                 if (key.equals("科技生產")) {
                 System.out.println("文化生產:" + val);
                 doneCnt++;
                 }

                 if (key.equals("黃點")) {
                 System.out.println("黃點:" + val);
                 doneCnt++;
                 }
                 if (key.equals("藍點")) {
                 System.out.println("藍點:" + val);
                 doneCnt++;
                 }
                 */
            }

        }
        System.out.println("");
//        System.out.println("----------------------------解析結果-----------------------------------");
        if (doneCnt == todoCnt) {
//                isDone = true;
//            this.是否完全解析完畢 = true;
            setIsComplete(true);
//            System.out.println("是否全部解析完畢? YES!");
        } else {
//            System.out.println("是否全部解析完畢? NO!");
            setIsComplete(false);
      
        }

//        System.out.println("  應該解析個數:" + todoCnt);

//        System.out.println("  已解析個數" + doneCnt);

    }

}
