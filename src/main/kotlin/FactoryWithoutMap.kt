class FactoryWithEnum {
    fun create(value: MyEnumWithFactory) {
        value.factory.f()
    }
}

enum class MyEnumWithFactory(val factory: Factory) {
    A(A()), B(B()), C(C())
}
