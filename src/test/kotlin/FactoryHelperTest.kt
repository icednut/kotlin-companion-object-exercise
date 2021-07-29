import org.junit.jupiter.api.Test

internal class FactoryHelperTest {

    @Test
    fun `근데 팩토리가 아닌 상황에서도 companion을 꼭 써야 될까?`() {
        val factoryHelper = FactoryHelper()

        factoryHelper.create(MyEnum.B)
    }

    @Test
    fun `when도 없앨 수 있지 않을까?`() {
        val factoryHelper = FactoryWithMap()

        factoryHelper.create(MyEnum.B)
    }

    @Test
    fun `map도 없앨 수 있지 않을까?`() {
        val factoryHelper = FactoryWithEnum()

        factoryHelper.create(MyEnumWithFactory.B)
    }
}
