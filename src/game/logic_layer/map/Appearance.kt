package game.logic_layer.map

import game.logic_layer.unit.Nat
import game.logic_layer.unit.Position
import java.util.*
import java.util.function.Consumer

interface WithAppearance {
    val appearance: Appearance
}

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
class Appearance(private val position: Position, private vararg val lines: Line) {
    private val width = lines.getOrElse(0) { i -> emptyLine(0) }.size

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
     * @param appearance To be put on this appearance. This has to fit
     * inside this Appearance -> The position + lines have to be inside
     * this appearance.
     * @return An Appearance combined with the given appearance.
     * @throws IllegalArgumentException If appearance doesn't fit in
     * this Appearance.
     */
    fun with(appearance: Appearance) =
            Appearance(
                    position,
                    lines.mapIndexed { i, line ->
                        if (contains(i.asPosition())) {
                            
                        }
                    }
            )

    //fun min(other: Appearance) = other.

    fun forEach(action: (Line) -> Unit) {
        lines.forEach { action(it) }
    }


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

    private fun Int.asPosition() =
            Position(Nat(this % width), Nat(this / width))
}

fun emptyAppearance(width: Int, height: Int) =
        Appearance(*Array(height, { emptyLine(height) }))

/**
 * A line inside the Appearance class.
 */
class Line(private vararg val dataLine: Filling) {
    val size = dataLine.size
    operator fun get(index: Int) = dataLine[index]

    fun forEach(action: (Filling) -> Unit) =
            dataLine.forEach { action(it) }

    operator fun plus(other: Line) =
            Line()
}

fun emptyLine(width: Int) =
        Line(*Array(width, { Filling.EMPTY }))

private operator fun Array<Line>.get(x: Int, y: Int) =
        this[x][y]