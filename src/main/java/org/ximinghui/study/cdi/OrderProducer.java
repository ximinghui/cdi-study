package org.ximinghui.study.cdi;

import jakarta.enterprise.event.Event;
import jakarta.inject.Inject;
import org.ximinghui.study.cdi.bean.Order;

public class OrderProducer {

  private final Event<Order> orderEvent;

  @Inject
  public OrderProducer(Event<Order> orderEvent) {
    this.orderEvent = orderEvent;
  }

  public void placeOrder(Order order) {
    orderEvent.fire(order);
  }

}

