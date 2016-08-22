package game.logic_layer.level

import game.logic_layer.map.Appearance
import game.logic_layer.map.WithAppearance
import game.logic_layer.unit.Size

/**
 * Created by Seven on 03.08.2016.
 */
interface Level : WithAppearance {
    val size: Size

    fun sequence()
}