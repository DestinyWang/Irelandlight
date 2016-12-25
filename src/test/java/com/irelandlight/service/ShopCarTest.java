package com.irelandlight.service;

import com.irelandlight.model.ShopCar;
import com.irelandlight.test.BaseJunitTest;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * Created  with Intellij IDEA.
 * User: Ele_Chen
 * Date: 2016/12/5
 * Time: 18:13
 * Description: ShopCar 测试类... .
 */
public class ShopCarTest extends BaseJunitTest {

    @Resource
    private ShopCarService shopCarService;

    @Test
    public void testInsertShopCarByConsumerId() throws Exception {
        Long consumerId = new Long(1009);
        shopCarService.insertShopCarByConsumerId(consumerId);
    }

    @Test
    public void testInsertShopCarByShopCar() throws Exception {
        ShopCar shopCar = new ShopCar();
        shopCar.setConsumerId(1010L);
        shopCarService.insertShopCarByShopCar(shopCar);
        System.out.println("test:"+shopCar.getId());
    }

    @Test
    public void testFindShopCarGoodsDetailByConsumerId() throws Exception {
        Long consumerId = new Long(1001);
        shopCarService.findShopCarGoodsDetailByConsumerId(consumerId);
        //System.out.println(shopCar);
    }

    @Test
    public void testDeleteShopCarByConsumerId()throws Exception{
        shopCarService.deleteShopCarByConsumerId(1010L);
    }

}

