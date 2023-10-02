package com.example.currencyconverter;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class CurrencyConverterBean {
    private long id;
    private String from;
    private String to;
    private BigDecimal conversionMultiple;
    private BigDecimal quantity;
    private BigDecimal totalCalculatedAmt;


    public void setId(long id) {
        this.id = id;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public CurrencyConverterBean() {
    }
    public CurrencyConverterBean(long id, String from, String to, BigDecimal conversionMultiple, BigDecimal quantity, BigDecimal totalCalculatedAmt) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionMultiple = conversionMultiple;
        this.quantity = quantity;
        this.totalCalculatedAmt = totalCalculatedAmt;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public void setConversionMultiple(BigDecimal conversionMultiple) {
        this.conversionMultiple = conversionMultiple;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public void setTotalCalculatedAmt(BigDecimal totalCalculatedAmt) {
        this.totalCalculatedAmt = totalCalculatedAmt;
    }


    public long getId() {
        return id;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public BigDecimal getConversionMultiple() {
        return conversionMultiple;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public BigDecimal getTotalCalculatedAmt() {
        return totalCalculatedAmt;
    }




}
