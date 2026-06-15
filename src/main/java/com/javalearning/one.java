package com.javalearning;

import com.javalearning.Beans.UserSession;
import com.javalearning.Beans.Vehicle;
import com.javalearning.config.ProjectConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class one {
    static void main() {
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var v1 = context.getBean(UserSession.class);
        var v2 = context.getBean(UserSession.class);

        System.out.println("======================v1"+v1.getSessionId());
        System.out.println("======================v2"+v2.getSessionId());

        System.out.println(v1.hashCode());
        System.out.println(v2.hashCode());

//        var v2 = context.getBean(Vehicle.class);

//        System.out.println("================v1========="+v1.hashCode());
//        System.out.println("================v2========="+v2.hashCode());

    }
}
