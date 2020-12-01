# Guarded Suspension

__通过让线程等待来保证实例的安全性__

* GuardedSuspension 类图
    - guardedMethod: 若守护条件成立则可立即执行，当守护条件不成立就要进行等待;while和wait语句实现
    - stateChangingMethod:notify/notifyAll
* GuardedSuspension类似于附加条件的synchronized方法/多线程的if
* LinkedBlockingQueue类中使用了GuardedSuspension模式