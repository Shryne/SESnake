package game.logic_layer.map

import java.util.*

/**
 * Corresponds to the filling of a field in the grid.
 */
enum class Filling {
    /**
     * Nothing filled
     */
    EMPTY,

    /**
     * An invisible, but existent block that can still collide with
     * others.
     */
    INVISIBLE,

    /**
     * A normal block for a lifeless entity, like a wall.
     */
    BLOCK,

    /**
     * A block for a living part, like a normal snake.
     */
    NORMAL_PART,
    NORMA_FOOD_PART
}

/**
 * A rectangular array to represent the appearance of
 * every entity inside the game.
 *
 * precondition: lines.all { line -> lines.all { line.size == it.size } }
 */
class Appearance(private vararg val lines: Line) {
    init {
        lines.forEach {
            line ->
                lines.forEach {
                    if (line.size != it.size) {
                        throw IllegalArgumentException(
                                "The length of $line (${line.size}) is not equal to $it (${it.size})"
                        )
                    }
                }
        }
    }

    /**
     * Returns the Fillment in the given Coordinate.
     */
    operator fun get(x: Int, y: Int) = lines[x][y]

    /**
     * Returns true, if this and the given Visual have at
     * least one coordinate in common with a #Fillment that
     * isn't EMPTY.
     */
    fun collidesWith(other: Appearance) =
        false

    /*#####################################################
    private helper
    #####################################################*/
}

/**
 * A line inside the Appearance class.
 */
class Line(private vararg val dataLine: Filling) {
    val size = dataLine.size
    operator fun get(index: Int) = dataLine[index]
}