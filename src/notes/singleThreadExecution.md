# Single Thread Execution

__意思是以一个线程执行，用于限制，以确保同一时间只让一个线程执行处理__

* use synchronized 
* SharedResource class
    - safeMethod: 多个线程调用也不会发生问题的方法
    - unsafeMethod: 多个线程同时调用会发生问题，必须加以保护
* single thread execution模式会保护unsafeMethod, 声明为synchronized方法
* 只允许单个线程执行的程序范围称为临界区
* 死锁发生的条件
    - 多个SharedResource
    - 线程在已持有某个sharedResource时还想获得其他SharedResource的锁
    - 获取SharedResource的锁的顺序并不固定
* 何时使用singleThreadExecution模式
    - SharedResource状态会发生改变
* 继承反常 子类化时失去安全性
* 基本类型、引用类型的赋值和引用是原子操作；但long和double的赋值和引用是非原子操作
* long double在线程间共享时，需要将其放入synchronized中操作，或者声明为volatile

 
