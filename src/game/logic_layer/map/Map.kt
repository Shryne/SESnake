package game.logic_layer.map

import game.logic_layer.unit.Size

/**
 * Created by Seven on 26.06.2016.
 */
interface Map : WithAppearance {
    val size: Size

    fun step()
}