package com.mmall.util;


import java.math.BigDecimal;

/**
 * @Description
 * @Author Jessica
 * @Version v
 * @Date 2021/10/4
 */
public class BigDecimalUtil {

    private BigDecimalUtil() {
    }

    /**
     * addition
     * @param v1
     * @param v2
     * @return
     */
    public static BigDecimal add(double v1, double v2) {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v1));
        return b1.add(b2);
    }

    /**
     * subtraction
     * @param v1
     * @param v2
     * @return
     */
    public static BigDecimal sub(double v1, double v2) {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v1));
        return b1.subtract(b2);
    }

    /**
     * multiplication
     * @param v1
     * @param v2
     * @return
     */
    public static BigDecimal mul(double v1, double v2) {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v1));
        return b1.multiply(b2);
    }

    /**
     * division
     * @param v1
     * @param v2
     * @return
     */
    public static BigDecimal div(double v1, double v2) {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v1));
        return b1.divide(b2,2,BigDecimal.ROUND_HALF_UP);//四舍五入，保留两位小数

        //除不尽的情况
    }


}
