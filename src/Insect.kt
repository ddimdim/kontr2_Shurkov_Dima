import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay

abstract class Insect(override var name: String, override var speed: Double, override var color: String,
                      override var food: String, override var habitat: String) : Insects {
    override  fun info(){
        println("Это $name\nСкорость: $speed\nЦвет: $color\nИспользуемая пища: $food\nСреда обитания: $habitat")
    }
    suspend fun foood() = coroutineScope{
        delay(3000L)
        if (food == "Кровь" || name == "Комар")
            println("$name питается кровью")
        else println("$name не питается кровью")
    }
}

