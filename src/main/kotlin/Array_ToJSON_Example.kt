import kotlinx.serialization.*
import kotlinx.serialization.json.*
import java.io.File

fun main() {


    @Serializable
    class TestClass (arr)
    var testCollection: ArrayList<String> = arrayListOf("Hi", "HowAreYou")


    val json = Json(JsonConfiguration.Stable.copy(prettyPrint = true))

    var jsonArray = jsonArray {  }

    //    создаем еще один json обьект (для наглядности) и с помощью прошлого json обьекта сериализируем нужный обьект класса
    val jsonData = json.stringify(ArrayList.serializer()., testCollection)




//    запис в файл
    var file = File("test.json")
//    file.writeText(jsonData)
}