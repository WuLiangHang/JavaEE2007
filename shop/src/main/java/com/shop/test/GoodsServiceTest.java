package com.shop.test;

import com.shop.bean.Goods;
import com.shop.service.GoodsService;
import com.shop.service.impl.GoodsServiceImpl;
import org.junit.Test;

import java.math.BigDecimal;

public class GoodsServiceTest {
    private GoodsService goodsService = new GoodsServiceImpl();

    @Test
    public void addGoods() {
        goodsService.addGoods(new Goods(null, "华为手机", "华为", new BigDecimal(1000000),
                100000000, 0, null));
    }

    @Test
    public void deleteGoodsById() {
        goodsService.deleteGoodsById(22);
    }

    @Test
    public void updateGoods() {
        goodsService.updateGoods(new Goods(22, "iphone手机", "苹果", new BigDecimal(999999),
                10, 111110, null));
    }

    @Test
    public void queryGoodsById() {
        System.out.println(goodsService.queryGoodsById(22));
    }

    @Test
    public void queryGoods() {
        for (Goods queryGoods : goodsService.queryGoods()) {
            System.out.println(queryGoods);
        }
    }

}
