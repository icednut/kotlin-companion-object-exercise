interface Factory {
    fun f()
}

class A : Factory {
    override fun f() = print("A called")
}

class B : Factory {
    override fun f() = print("B called")
}

class C : Factory {
    override fun f() = print("Else called")
}

class FactoryHelper {
    fun create(value: MyEnum) {
        val function = when (value) {
            MyEnum.A -> A()
            MyEnum.B -> B()
            else -> C()
        }::f

        function()
    }
}

enum class MyEnum {
    A, B
}
