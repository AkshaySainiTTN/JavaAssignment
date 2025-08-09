package com.demo.service;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.doNothing;

import com.demo.domain.Order;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class OrderServiceTest {

    @InjectMocks
    private OrderService orderService;

    @Mock
    private EmailService emailService;

    @Test
    public void testPlaceOrder(){
        // given
        Order order = new Order(1, "Bulb", 40.0);
        doNothing().when(emailService).sendEmail(order);
        // then
        orderService.placeOrder(order);
        assertThat(order.getPriceWithTax(), is(48.0));
        assertThat(order.isCustomerNotified(), is(true));
    }

    @Test
    public void testPlaceOrderWithCC(){
        Order order = new Order(1,"Bulb",40.0);
        doNothing().when(emailService).sendEmail(order, "Sample CC");
        orderService.placeOrder(order, "Sample CC");

        assertThat(order.getPriceWithTax(), is(48.0));
        assertThat(order.isCustomerNotified(), is(true));
    }
    
}
