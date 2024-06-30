package org.ximinghui.study.cdi;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.ximinghui.study.cdi.bean.Order;

import java.util.Scanner;

public class Test {

  public static Order generateNewOrder() {
    System.out.print("请输入订单号并按回车下单：");
    return new Order(new Scanner(System.in).next());
  }

  public static void main(String[] args) {
    try (WeldContainer container = new Weld().initialize()) {
      // 从CDI容器中获取一个Bean实例
      OrderProducer producer = container.select(OrderProducer.class).get();
      // 调用 placeOrder 方法
      producer.placeOrder(generateNewOrder());
    }
  }

}

