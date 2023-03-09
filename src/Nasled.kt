
class Nasled(override var name: String, override var speed: Double, override var color: String, override var food: String, override var habitat: String
) : Insect(name, speed, color, food, habitat) {
    override fun walk(){
        println("$name где-то ходит бродит или летает")
    }
}