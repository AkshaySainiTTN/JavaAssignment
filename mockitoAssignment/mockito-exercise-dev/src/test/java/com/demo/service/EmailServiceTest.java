package com.demo.service;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.doThrow;

import com.demo.domain.Order;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class EmailServiceTest {

    @InjectMocks
    private EmailService emailService;

    @Test
    public void sendEmail(){
        Order order = new Order(1, "Test Order",40.0);
        order.setCustomerNotified(true);
        emailService.sendEmail(order);
        assertThat(order.isCustomerNotified(), is(false));
    }

    @Test(expected = RuntimeException.class)
    public void sendEmailWithException() {
        Order order = new Order(1, "Test Order", 40.0);
        doThrow(new RuntimeException("An Exception Occurred"))
                .when(emailService).sendEmail(order);
        emailService.sendEmail(order);
    }

    @Test
    public void sendEmailWithCC() {
        Order order = new Order(1, "Test Order", 40.0);
        boolean isNotified = emailService.sendEmail(order, "Sample CC");
        assertThat(isNotified, is(true));
        assertThat(order.isCustomerNotified(), is(true));
    }


}
