# Balking模式

__停止并返回的意思,在balking模式中，如果守护条件不成立，则立即中断处理__

* Balking 类图
    - guardedMethod: 若守护条件成立则可立即执行，当守护条件不成立则立即返回
    - stateChangingMethod
* 何时使用
    - 并不需要执行时，提高程序性能
    - 不需要等待守护条件成立时，特点是不进行等待
    - 守护条件仅在第一次成立时 e.g:initialized flag
* balk结果的表示方法
    - 忽略balk: 直接返回
    - 通过返回值来表示balk(true/false/null)
    - 通过异常来表示balk的发生
* 超时
    - balking: 守护条件不成立立即返回 vs GuardedSuspension: 守护条件不成立用while等待
    - 在守护条件成立前等待一段时间 (guarded timeout)
    - 没有判断wait是否超时的方法
    - synchronized 中没有超时，也不能中断