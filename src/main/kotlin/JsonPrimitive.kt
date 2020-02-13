import kotlinx.serialization.json.JsonPrimitive
import java.io.File

fun main() {
    var jsonPrimitive: JsonPrimitive = JsonPrimitive(1)
//    =========================================================
    println(jsonPrimitive)

    var whatTheType:String = jsonPrimitive.content

    var int: Int = jsonPrimitive.content.toInt()
    println(int + 1)

    //    записываем в файл json обьект
    var file = File("test.json")
    file.writeText(jsonPrimitive.content)

    jsonPrimitive = JsonPrimitive("abc")
//    =========================================================
    println(jsonPrimitive)
    println(jsonPrimitive.content)

    var string: String = jsonPrimitive.content
    print(string)
}