import kotlinx.serialization.*
import kotlinx.serialization.json.*
import java.io.File

fun main() {

    //создаем обьект с массивом
    @Serializable
    class TestClass (var arr: ArrayList<String>)
    var testObj:TestClass = TestClass(arrayListOf("Hi", "HowAreYou"))

    //сериализация в джсон обьект
    val json = Json(JsonConfiguration.Stable.copy(prettyPrint = true))
    val jsonData = json.stringify(TestClass.serializer(), testObj)

    //запись в файл
    var file = File("test.json")
    file.writeText(jsonData)

    //парсинг в обьект из файла и вывод инфы
    println(json.parse(TestClass.serializer(), file.readText()).arr[0])
    println(json.parse(TestClass.serializer(), file.readText()).arr[1])
}




//    var jsonArray = jsonArray {  }