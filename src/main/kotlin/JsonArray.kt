import kotlinx.serialization.json.*
import java.io.File

fun main() {
    var jsonPrimitive1: JsonPrimitive = JsonPrimitive("Hi1")
    var jsonPrimitive2: JsonPrimitive = JsonPrimitive("Hi2")
    var jsonPrimitive3: JsonPrimitive = JsonPrimitive("Hi3")


    var list: List<JsonElement> = listOf(jsonPrimitive1, jsonPrimitive2, jsonPrimitive3)
    var jsonArray: JsonArray = JsonArray(list)

    print(jsonArray)


    val json = Json(JsonConfiguration.Stable.copy(prettyPrint = true))

//    создаем еще один json обьект (для наглядности) и с помощью прошлого json обьекта сериализируем нужный обьект класса
    val jsonData = json.parseJson(jsonArray.toString())




}