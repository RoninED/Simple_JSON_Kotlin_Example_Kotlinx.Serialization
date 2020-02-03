import kotlinx.serialization.*
import kotlinx.serialization.json.Json


fun main() {


    @Serializable
    data class Data(
        val text:String = "text_test"
    )

    var json: Json = Data.serializer
}


