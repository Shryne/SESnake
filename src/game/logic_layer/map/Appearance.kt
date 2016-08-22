package game.logic_layer.map

import game.logic_layer.unit.Nat
import game.logic_layer.unit.Position
import java.util.*
import java.util.function.Consumer

interface WithAppearance {
    val appearance: Appearance
}

data class Part(val position: Position, val filling: Filling)

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
    NORMA_FOOD_PART,

    /**
     * A block consisting of at least two other blocks,
     * that are overlapping each other.
     */
    OVERLAPPING
}

/**
 * A rectangular array to represent the appearance of
 * every entity inside the game.
 *
 * precondition: lines.all { line -> lines.all { line.size == it.size } }
 */
class Appearance(private vararg val parts: Part) {
    init {
        /*
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
        */
    }

    /**
     * Returns the Fillment in the given Coordinate.
     */
    operator fun get(x: Int, y: Int) = 0

    operator fun plus(other: Appearance) =
        Appearance(*parts, *other.parts)


    //fun min(other: Appearance) = other.

    fun forEach(action: (Part) -> Unit) =
            parts.forEach { action(it) }

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
