package game

fun main(args: Array<String>) {
    println(x(15)[1])
}

data class x(var a: Int) {
    operator fun plus(b: Int) =
            x(a + b)

    operator fun get(pos: Int) = 15
}