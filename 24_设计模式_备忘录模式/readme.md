## 一、备忘录模式

1. 定义
    - 在不破坏封装性的前提下，捕获一个对象的内部状态，并在这个对象之外保存这个状态。这样可以保证在以后可以将该对象恢复到原先的保存状态。

2. 备忘录模式应用
    - 需要保存和恢复数据的相关场景
    - 需要提供一个可以回滚的操作（Ctrl + z）
    - 需要监控的副本场景。如需要监控一个对象的属性，但是监控功能又不是系统的主业务，即即使监控功能出现问题对主模块的影响也不大。
    - 数据库中的事务管理功能 

#### 在备忘录模式中直接将对象序列化后保存在备忘录对象中