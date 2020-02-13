import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonPrimitive


fun main() {

// оздание обьекта
    @Serializable
    class TestClass(var a: String = "testText")
    var testObject: TestClass = TestClass()

    var jsonPrimitive1: JsonPrimitive = JsonPrimitive("Hi1")


//    var jtest: JsonElement = JsonPrimitive

}