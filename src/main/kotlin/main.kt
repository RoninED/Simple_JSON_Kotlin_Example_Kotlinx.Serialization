import kotlinx.serialization.*
import kotlinx.serialization.json.*
import java.io.File

@Serializable
class TestClass (var a: String)

@Serializable
data class Data(val b: TestClass = TestClass("wow"),val b2: TestClass = TestClass("wow2") )

fun main() {

//    Создем json обьект и устанавливаем стабильные настройки с изменением вывода в структурированую форму
    val json = Json(JsonConfiguration.Stable.copy(prettyPrint = true))

//    создаем еще один json обьект (для наглядности) и с помощью прошлого json обьекта сериализируем нужный обьект класса
    val jsonData = json.stringify(Data.serializer(), Data())

//    выводим в консоль
    print(jsonData)

//    создаем обьект файла и присваеваем путь
    var file = File("test.json")

//    записываем в файл второй json обьект
    file.writeText(jsonData)
}

