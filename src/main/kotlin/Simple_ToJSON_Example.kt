import kotlinx.serialization.*
import kotlinx.serialization.json.*
import java.io.File



fun main() {

//  Создаем класс для записи
    @Serializable
    class TestClass (var a: String = "testText")

//  Создаем обьект для записи
    var testObject: TestClass = TestClass()


//    Создем json обьект и устанавливаем стабильные настройки с изменением вывода в структурированую форму
    val json = Json(JsonConfiguration.Stable.copy(prettyPrint = true))

//    создаем еще один json обьект (для наглядности) и с помощью прошлого json обьекта сериализируем нужный обьект класса
    val jsonData = json.stringify(TestClass.serializer(), testObject)

//    выводим в консоль
    print(jsonData)

//    создаем обьект файла и присваеваем путь
    var file = File("test.json")

//    записываем в файл json обьект
    file.writeText(jsonData)
}

