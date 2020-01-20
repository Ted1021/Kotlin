package chap5.section05

internal class InternalClass {
    internal var i = 1
    internal fun icfunc() {
        i += 1
    }
    
    fun access() {
        icfunc()
    }
}