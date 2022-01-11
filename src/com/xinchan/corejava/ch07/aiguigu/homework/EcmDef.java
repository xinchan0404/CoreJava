package com.xinchan.corejava.ch07.aiguigu.homework;

/**
 *
 * @author xinchan
 * @version 1.0.1 2022-01-11
 */
public class EcmDef {
    /**
     * 计算两数相除
     * @param num1
     * @param num2
     * @return
     */
    public int ecm(int num1, int num2) throws EcDef, ArithmeticException{
        if (num1 < 0 || num2 < 0) {
            throw new EcDef("输入数据不能为负数~~");
        }

        return num1 / num2;
    }

    public static void main(String[] args) {
        EcmDef ecmDef = new EcmDef();

        try {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            int ans = ecmDef.ecm(num1, num2);

            System.out.println(ans);
        } catch (EcDef e) {
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("缺少命令行参数 ~~");
        } catch (ArithmeticException e) {
            System.out.println("除 0 ~~");
        } catch (NumberFormatException e) {
            System.out.println("数据类型不一致 ~~");
        }
    }
}
