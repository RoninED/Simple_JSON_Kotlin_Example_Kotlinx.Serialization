import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonConfiguration
import java.io.File

fun main() {

    //  Создаем класс для записи
    @Serializable
    class TestClass (var a: String)

    // Обьект нужного нам файла
    var file = File("test.json")

    //    Создем json обьект и устанавливаем стабильные настройки с изменением вывода в структурированую форму
    val json = Json(JsonConfiguration.Stable.copy(prettyPrint = true))

    //  Создаем обьект для записи
    var testObject: TestClass = json.parse(TestClass.serializer(), file.readText())

    //    Вывод в консоль текста из обьекта
    print(testObject.a)
}