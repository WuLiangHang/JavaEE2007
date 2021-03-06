package com.shop.dao;

import com.shop.bean.Goods;

import java.util.List;

public interface GoodsDao {
    public int addGoods(Goods goods);

    public int deleteGoodsById(Integer id);

    public int updateGoods(Goods goods);

    public Goods queryGoodsById(Integer id);

    public List<Goods> queryGoods();

    Integer queryForPageTotalCount();

    List<Goods> queryForPageItems(int begin, int pageSize);

    Integer queryForPageTotalCountByPrice(int min, int max);

    List<Goods> queryForPageItemsByPrice(int begin, int pageSize, int min, int max);
}
