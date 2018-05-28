package top.ljming.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.ljming.common.api.CommonService;

import java.io.IOException;

public class ConsumerApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"application.xml"});

        context.start();

        CommonService commonService = (CommonService) context.getBean("commonService");
        System.out.println(commonService.getInfo("ljming"));

        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
