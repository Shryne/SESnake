package game.logic_layer.unit

/**
 * Created by Seven on 23.06.2016.
 */
data class Position(val x: Nat, val y: Nat) {

}

data class Size(val w: Int, val h: Int) {

}

data class Bounds(val pos: Position, val size: Size) {

}

/**
 * A class to represent the position inside of Visual and other 'container'.
 * The game.main purpose for this class is to check the validity of another
 * coordinate.
 */
data class Coordinate2d(val x: Nat, val y: Nat) {
    operator fun contains(other: Coordinate2d) =
            other.x < x && other.y < y

}

class Nat(val value: Int) : Number(), Comparable<Nat> {
    override fun compareTo(other: Nat) =
        value.compareTo(other.toInt())

    override fun toByte() = value.toByte()
    override fun toChar() = value.toChar()
    override fun toDouble() = value.toDouble()
    override fun toFloat() = value.toFloat()
    override fun toInt() = value.toInt()
    override fun toLong() = value.toLong()
    override fun toShort() = value.toShort()

    operator fun plus(other: Nat) = Nat(value + other.toInt())
    operator fun minus(other: Nat) = Nat(value - other.toInt())
    operator fun times(other: Nat) = Nat(value * other.toInt())
    operator fun div(other: Nat) = Nat(value / other.toInt())
    operator fun mod(other: Nat) = Nat(value % other.toInt())
}