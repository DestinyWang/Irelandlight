package com.irelandlight.service;

import com.irelandlight.model.Consumer;
import com.irelandlight.model.Order;
import com.irelandlight.test.BaseJunitTest;
import org.junit.Test;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created  with Intellij IDEA.
 * User: Ele_Chen
 * Date: 2016/12/9
 * Time: 22:49
 * Description: 订单service测试 .
 */
public class OrderTest extends BaseJunitTest {

    @Resource
    private OrderService orderService;

    //查询订单的所有信息
    @Test
    public void testFindAllOrder() throws Exception{
        List<Order> orders = orderService.findAllOrder();
        System.out.println(orders);
    }
    //查找某个用户的所有订单
    @Test
    public void testFindOrderByConsumerId() throws Exception{
        List<Order> orders = orderService.findOrderByConsumerId(1002L);
        System.out.println(orders);
    }

    //查找用户有效订单
    @Test
    public void testFindValidOrderByConsumerId() throws Exception{
        List<Order> orders = orderService.findValidOrderByConsumerId(1002L);
        System.out.println(orders);
    }
    //查找某个用户的所有订单详情
    @Test
    public void testFindAllOrderDetailByConsumerId() throws Exception{
        Consumer consumer = orderService.findAllOrderDetailByConsumerId(1002L);
        System.out.println(consumer);
    }
    //查询用户的某个订单详情
    @Test
    public void testFindOneOrderDetail() throws Exception{
        Order order = orderService.findOneOrderDetail(1002L,2L);
        System.out.println(order);
    }
    //查询用户的某种状态的订单信息
    @Test
    public void testFindOneStatusOrderDetail() throws Exception{
        Consumer consumer = orderService.findOneStatusOrderDetail(1001L,1);
        System.out.println(consumer);
    }
    //增加订单（下单） 返回订单ID
    @Test
    public void testInsertOrder() throws Exception{
        Order order = new Order();
        order.setConsumerId(1002L);
        order.setAddressId(2L);
        order.setCouponId(2L);
        order.setGift("小礼物");
        order.setOrderNumber("cx04141061");
        order.setPayWay(1);
        order.setTransferWay(1);
        order.setTableWareCount(4);
        order.setPrice(new BigDecimal(123.38));
        order.setRemark("生日快乐");
        order.setTransferTime("今天下午两点");
        System.out.println(order.getPrice());

        orderService.insertOrder(order);
        System.out.println(order.getId());
    }
}
