package org.rjgchw.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Huangw
 * @date 2020-06-01 16:33
 */
public class Test {

	public static void main(String[] args) {
		System.setProperty("spring", "classpath");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("${spring}:config.xml");
		SimpleBean bean = context.getBean(SimpleBean.class);
		bean.send();
		context.close();
	}
}
