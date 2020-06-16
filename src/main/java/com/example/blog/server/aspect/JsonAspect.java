package com.example.blog.server.aspect;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import com.example.blog.server.entity.CommonContainer;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class JsonAspect {

//    @Pointcut("target(com.example.blog.server.controller.RestfulController)")
    public void point() {}

//    @Around("point()")
//    public Object around(ProceedingJoinPoint pjp) throws Throwable {
//        System.out.println("ssssssssssssssssssssss");
//        Object object = pjp.proceed();
//        CommonContainer commonContainer = new CommonContainer();
//        commonContainer.setData(object);
//
//        return commonContainer;
//    }
}
