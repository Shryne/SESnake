package game.logic_layer.unit

/**
 * Created by Seven on 23.06.2016.
 */
data class Position(val x: Int, val y: Int) {

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


class Nat : Number(), Comparable<Nat> {
    override fun compareTo(other: Nat): Int {
        throw UnsupportedOperationException()
    }

    override fun toByte(): Byte {
        throw UnsupportedOperationException()
    }

    override fun toChar(): Char {
        throw UnsupportedOperationException()
    }

    override fun toDouble(): Double {
        throw UnsupportedOperationException()
    }

    override fun toFloat(): Float {
        throw UnsupportedOperationException()
    }

    override fun toInt(): Int {
        throw UnsupportedOperationException()
    }

    override fun toLong(): Long {
        throw UnsupportedOperationException()
    }

    override fun toShort(): Short {
        throw UnsupportedOperationException()
    }
}