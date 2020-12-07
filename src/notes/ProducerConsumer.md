# Producer Consumer 模式

* Producer Cousumer角色
    - Producer生产者: MakerThread
    - Consumer消费者: EaterThread
    - Channel通道: Table
* 线程的协调运行要考虑放在中间的东西；线程的互斥处理要考虑应该保护的东西
* InterruptedException
    - object.wait
    - thread.sleep
    - thread.join 
    - interrupt方法只是改变了线程的中断状态，让线程变为中断状态
    - isInterrupted方法检查中断状态，并不会改变中断状态
    - Thread.interrupted方法检查并清除中断状态