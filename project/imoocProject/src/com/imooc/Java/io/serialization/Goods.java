package com.imooc.Java.io.serialization;

import java.io.Serializable;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/3/2 16:20
 * @注释：
 */
public class Goods implements Serializable {
    private String goodsId;
    private String goodsName;
    private double price;
    public Goods(String goodsId,String goodsName,double price){
        this.goodsId=goodsId;
        this.goodsName=goodsName;
        this.price=price;
    }
    public String getGoodsId() {
        return goodsId;
    }
    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }
    public String getGoodsName() {
        return goodsName;
    }
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "商品信息 [编号：" + goodsId + ", 名称：" + goodsName
                + ", 价格：" + price + "]";
    }

}
