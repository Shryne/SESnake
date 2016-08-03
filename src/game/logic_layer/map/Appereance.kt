package game.logic_layer.map

import java.util.*

enum class Fillment {
    EMPTY, BLOCK, NORMAL_PART
}

/**
 * Created by Seven on 26.06.2016.
 */
class Appereance(private var dataMap: List<Fillment>) {
    //private var dataMap = ArrayList<Fillment>(width * height)

    /**
     * Returns the Fillment in the given Coordinate.
     */
    operator fun get(x: Int, y: Int) = Fillment.EMPTY

    /**
     * Sets the Fillment in the given Coordinate.
     */
    operator fun set(x: Int, y: Int) {}

    /**
     * Returns true, if this and the given Visual have at
     * least one coordinate in common with a #Fillment that
     * isn't EMPTY.
     */
    fun collidesWith(other: Appereance) =
        false

    /*#####################################################
    private helper
    #####################################################*/
}

