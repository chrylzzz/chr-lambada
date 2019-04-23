package com.lnsoft.po;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created By Chr on 2019/4/23/0023.
 */
public class Apple {

    private String appleId;

    private String appleName;

    private Date appleSaleDate;

    private BigDecimal applePrice;

    private Integer appleNums;

    public Apple() {
    }

    public Apple(String appleId, String appleName, Date appleSaleDate, BigDecimal applePrice, Integer appleNums) {
        this.appleId = appleId;
        this.appleName = appleName;
        this.appleSaleDate = appleSaleDate;
        this.applePrice = applePrice;
        this.appleNums = appleNums;
    }

    public String getAppleId() {
        return appleId;
    }

    public void setAppleId(String appleId) {
        this.appleId = appleId;
    }

    public String getAppleName() {
        return appleName;
    }

    public void setAppleName(String appleName) {
        this.appleName = appleName;
    }

    public Date getAppleSaleDate() {
        return appleSaleDate;
    }

    public void setAppleSaleDate(Date appleSaleDate) {
        this.appleSaleDate = appleSaleDate;
    }

    public BigDecimal getApplePrice() {
        return applePrice;
    }

    public void setApplePrice(BigDecimal applePrice) {
        this.applePrice = applePrice;
    }

    public Integer getAppleNums() {
        return appleNums;
    }

    public void setAppleNums(Integer appleNums) {
        this.appleNums = appleNums;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "appleId='" + appleId + '\'' +
                ", appleName='" + appleName + '\'' +
                ", appleSaleDate=" + appleSaleDate +
                ", applePrice=" + applePrice +
                ", appleNums=" + appleNums +
                '}';
    }
}
