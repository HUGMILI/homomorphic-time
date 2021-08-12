package com.ruoyi.vote.enums;

import java.math.BigInteger;



public enum Vote_w {
     YES1(new BigInteger(String.valueOf(2)), "是"), NO(new BigInteger(String.valueOf(0)), "否");
    public void setYes1(int t){
        BigInteger z= BigInteger.valueOf(t);
    }
    private BigInteger value;

    private String desc;

    Vote_w(BigInteger value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    /**
     * @return the value
     */
    public BigInteger getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(BigInteger value) {
        this.value = value;
    }

    /**
     * @return the desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * @param desc the desc to set
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }
}
