package game.logic_layer.unit

/**
 * Created by Seven on 03.08.2016.
 */
enum class Direction(val x: Int, val y: Int) {
    NON(0, 0),
    LEFT(-1, 0),
    RIGHT(1, 0),
    TOP(0, -1),
    BOTTOM(0, 1);

    private val MIN_DIRECTION = -1
    private val MAX_DIRECTION = 1

    init {
        assert(x.within(MIN_DIRECTION, MAX_DIRECTION) &&
                y.within(MIN_DIRECTION, MAX_DIRECTION))
    }


}

fun Int.within(smaller: Int, greater: Int) =
        smaller <= this && this <= greater