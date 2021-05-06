## 建造者模式

1. 定义   
   建造者模式又叫生成器模式,其定义为:讲一个复杂的对象的构建和他的表示分离出来,使同样的构造可以创建不同的表示.


2. 角色   
   建造者模式主要存在4个角色,分别是 `Director导演类` ,`Builder抽象建造者`,`ConcerteBuilder具体建造者`,`Product产品类`
    - 产品类: 通常是实现了模板方法模式,也就是既有模板方法也有基本方法.
    - 抽象建造者: 规范产品的组建,一般是由子类实现
    - 具体建造者: 实现抽象类定义好的方法并返回一个组建好的对象
    - 导演类:  负责安排已有模块的建造顺序并且告诉builder开始建造

----
> 在建造模式的各种应用中，最常见的是在mybatis中创建 `SqlSessionFactory` 对象的过程。
> 在使用过程中我们先定义了一个configuration.xml的配置文件，在里面设定了 `SqlSessionFactory`的相关实现细节，
> 然后以流的形式将其传递到 `SqlSessionFactoryBuilder`的build()方法。这里的xml文件取代了我们的导演类(Director)，在其中确定了建造顺序及实现细节。
> `SqlSessionFactoryBuilder`是具体的建造者，没有抽象建造者，产品为 `SqlSessionFactory`

```java
class Test {
    static void setUp() throws Exception {
        // create an SqlSessionFactory
        try (Reader reader = Resources.getResourceAsReader("org/apache/ibatis/submitted/basetest/mybatis-config.xml")) {
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        }
        // populate in-memory database
        BaseDataTest.runScript(sqlSessionFactory.getConfiguration().getEnvironment().getDataSource(),
                "org/apache/ibatis/submitted/basetest/CreateDB.sql");
    }
}

class SqlSessionFactoryBuilder{
    public SqlSessionFactory build(Reader reader) {
        return build(reader, null, null);
    }
    /*  ........  */
}
```

----

3. 优点
    - 封装性 建造者模式可以使客户端不知道其产品内部的组成细节,比如例子中我们是不需要知道 每一个具体模型内部是如何组建的,产生的对象类型就是CarModel
    - 建造者独立,容易扩展 BenzBuilder和BmwBuilder是相互独立的,对系统扩展有利
    - 便于控制细节风险 由于具体的建造者是独立的,因此可以对建造过程逐步细化,而不会对其他模块产生风险.


4. 对比工厂方法模式
    - 建造者模式最主要的功能是基本方法的调用顺序安排,即基本方法是已经实现了的,不同的调用顺序会产生不同的对象
    - 工厂方法模式的重点是创建对象,创建零件是他的主要职责,组装顺序不是他要关注的.
