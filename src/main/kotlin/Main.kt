//뒷북인데 Companion이라고 써있어서 응? Companion 클래스의
//@JvmStatic
//fun method() {
//    print("static")
//}

class MyClass {
    companion object {
        @JvmStatic
        fun method() {
            print("static")
        }
    }
}

fun main() {
    MyClass.method()
}
