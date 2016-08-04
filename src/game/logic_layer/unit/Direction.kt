package game.logic_layer.unit

/**
 * A class to describe the current direction an entity
 * is taking. As we are using a two dimensional grid,
 * where usually one field corresponds to one step of movement,
 * a direction like (x = 1, y = 1) would be faster than
 * (x = 1, y = 0).
 *
 * IMPORTANT: This enum is just modelling the direction and
 * for this reason it isn't even important, if x = 1 or x = 100.
 * Only the ratio between x and y is important.
 * It shouldn't be misused to represent speed.
 */
enum class Direction(val x: Int, val y: Int) {
    NON(0, 0),
    LEFT(-1, 0),
    RIGHT(1, 0),
    TOP(0, -1),
    BOTTOM(0, 1);

    companion object {
        private const val MIN_DIRECTION = -1
        private const val MAX_DIRECTION = 1
    }

    init {
        assert(x.within(MIN_DIRECTION, MAX_DIRECTION) &&
                y.within(MIN_DIRECTION, MAX_DIRECTION))
    }
}

fun Int.within(smaller: Int, greater: Int) =
        smaller <= this && this <= greater