package extension_03;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

public class BeanUtils {
    public static HashMap<String, Object> backupProp(Object bean) {
        //把bean的所有属性及数值放入到Hashmap中
        HashMap<String, Object> map = new HashMap<>();
        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
            PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();
            for (PropertyDescriptor des : descriptors) {
                //属性名称
                String fieldName = des.getName();
                //读取属性的方法
                Method getter = des.getWriteMethod();
                Object invoke = getter.invoke(bean, new Object() {
                });
                //如果有这个属性
                if (!fieldName.equalsIgnoreCase("class")) {
                    map.put(fieldName, invoke);
                }
            }


        } catch (IntrospectionException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

        return map;
    }

    public static void restoreProp(Object bean, HashMap<String, Object> propMap) {
        try {
            //获得Bean描述
            BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
            //获得属性描述
            PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();
            //遍历所有属性
            for (PropertyDescriptor des : descriptors) {
                //属性名称
                String fieldName = des.getName();
                //如果有这个属性
                if (propMap.containsKey(fieldName)) {
                    //写属性的方法
                    Method setter = des.getWriteMethod();
                    setter.invoke(bean, new Object[]{propMap.get(fieldName)});
                }
            }
        } catch (Exception e) {
            //异常处理
            System.out.println("shit");
            e.printStackTrace();
        }
    }
}
