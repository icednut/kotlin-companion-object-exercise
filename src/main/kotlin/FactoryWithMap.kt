class FactoryWithMap {
    companion object {
        val factories: Map<MyEnum, Factory> = hashMapOf(
            MyEnum.A to A(),
            MyEnum.B to B(),
        )
        private val defaultFactory = C()
    }

    fun create(value: MyEnum) {
        val factory = factories[value] ?: defaultFactory
        factory.f()
    }
}
