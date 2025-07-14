package com.demo.service;

import com.demo.domain.Order;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class OrderserviceTest {

    private static OrderService orderService;
    private static Order order;

    @BeforeClass
    public static void setUp() {
        orderService = new OrderService();
        order = new Order(11, "Bread", 1900.00);
    }

    @Before
    public void resetOrder() {
        System.out.println("Order Reset");
        order = new Order(11, "=Pizza", 1900.00);
    }

    @Test(expected = RuntimeException.class)
    public void testPlaceOrder() {
        orderService.placeOrder(order);
    }

    @Test
    public void testPlaceOrder_withcc_NotifiesCustomer() {
        String cc = "Akshay";
        boolean isNotified = orderService.placeOrder(order, cc);
        assertTrue(isNotified);
    }

    @Test
    public void testPlaceOrder_withcc_TaxPrice() {
        String cc = "Aman";
        boolean isNotified = orderService.placeOrder(order, cc);
        assertTrue(isNotified);
    }
}