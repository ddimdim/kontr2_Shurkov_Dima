import kotlinx.coroutines.*
import java.lang.Exception

suspend fun main() = coroutineScope{
    try{
        var n = 0
        println("Введите название насекомого")
        var name = readLine()!!.toString()
        println("Введите скорость передвижения насекомого")
        var speed = readLine()!!.toDouble()
        println("Введите окраску насекомого")
        var color = readLine()!!.toString()
        println("Введите потребляемую пищу насекомого")
        var food = readLine()!!.toString()
        println("Введите среду обитания насекомого")
        var habitat = readLine()!!.toString()
        while (n<=0){
            println("Введите количество функций")
            n = readLine()!!.toInt()
            if (n<=0) println("Меньше 1 функции вывести нельзя")
        }
        var ins1 = Nasled(name, speed, color, food, habitat)
        ins1.info()
        ins1.foood()

        launch {
            for (i in 1..n)
            {
                ins1.walk()
                delay(1500L)
            }

        }
        Unit
    }
    catch (e: Exception)
    {
        println("Данное введено неверно")
    }

}