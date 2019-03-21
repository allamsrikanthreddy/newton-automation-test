package com.mckinsey.lime.listeners;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

//TODO: Refactor
public class MyTransformer implements IAnnotationTransformer {
    @Override
    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
//        if (Arrays.asList(annotation.getGroups()).contains("paymentAPI") && TestData.getConfigData().getAppEnvironment() == CommonEnums.AppEnvironment.UAT) {
//            annotation.setEnabled(false);
//        }
    }
}
