// Example of Interface Segregation Principle in Kotlin

interface Swimmable {
    fun swim()
}

interface Flyable {
    fun fly()
}

interface Walkable {
    fun walk()
}

class Duck : Swimmable, Flyable, Walkable {
    override fun swim() {
        println("Duck is swimming")
    }

    override fun fly() {
        println("Duck is flying")
    }

    override fun walk() {
        println("Duck is walking")
    }
}

class Penguin : Swimmable, Walkable {
    override fun swim() {
        println("Penguin is swimming")
    }

    override fun walk() {
        println("Penguin is walking")
    }
}

fun main() {
    val duck = Duck()
    val penguin = Penguin()

    duck.swim()
    duck.fly()
    duck.walk()

    penguin.swim()
    penguin.walk()
}
