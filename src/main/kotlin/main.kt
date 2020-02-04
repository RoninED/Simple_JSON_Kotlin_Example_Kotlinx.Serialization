import kotlinx.serialization.*
import kotlinx.serialization.json.*
import java.io.File

@Serializable
class TestClass (var a: String)

@Serializable
data class Data(val b: TestClass = TestClass("wow"),val b2: TestClass = TestClass("wow2") )

fun main() {
//    val json = Json(JsonConfiguration.Stable)
//
//    val jsonData = json.stringify(Data.serializer(), Data())
//
    var file = File("test.json")
//
//
//    file.writeText(jsonData)

//    var temp = file.readText()
//    print(temp)

    file.writeText("1\n" +
            "2" +
            "3" +
            "4")
    print(file.readText())

    // Json also has .Default configuration which provides more reasonable settings,
    // but is subject to change in future versions
//    val json = Json(JsonConfiguration.Stable)
    // serializing objects
//    val jsonData = json.stringify(Data.serializer(), Data(42))
//    // serializing lists
//    val jsonList = json.stringify(Data.serializer().list, listOf(Data(42)))
//    println(jsonData) // {"a": 42, "b": "42"}
//    println(jsonList) // [{"a": 42, "b": "42"}]

//    // parsing data back
//    val obj = json.parse(Data.serializer(), """{"a":42}""") // b is optional since it has default value
//    println(obj) // Data(a=42, b="42")



}

