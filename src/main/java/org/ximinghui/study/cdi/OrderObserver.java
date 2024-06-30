package org.ximinghui.study.cdi;

import jakarta.enterprise.event.Observes;
import org.ximinghui.study.cdi.bean.Order;

public class OrderObserver {

  public void onOrder(@Observes Order order) {
    System.out.println("收到订单：" + order.id());
  }

}

