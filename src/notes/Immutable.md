# Immutable

__意思是存在着确保实例状态不发生改变的类__

* UML
    - person{frozen}: 字段被初始化之后字段的值就不会再被修改
    - getName{concurrent}: 多个线程执行也没有关系
* 何时使用
    - 实例创建后，状态不再发生改变：将字段声明为final字段，且不存在setter方法
    - 实例是共享的，且被频繁访问
* 考虑成对的mutable类和Immutable类
	- String vs StringBuffer
* 破坏可变性
	- 将字段里保存的实例直接作为getter方法的返回值
	- 将构造函数的参数中传入的实例直接赋给字段
* final
	- final类：无法创建子类
	- final方法：该方法不会被子类的方法重写或隐藏
	- final字段：final字段只能赋值一次