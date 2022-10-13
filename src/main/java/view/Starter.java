package view;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import rest.MarriageController;

public class Starter {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext(
                new String[]{"springContext.xml"}
        );
        MarriageController controller = ctx.getBean("controller", MarriageController.class);
        controller.findMarriageCertificate(new MarriageRequest());
    }
}
