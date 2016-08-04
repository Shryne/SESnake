package game.logic_layer.clock

import game.logic_layer.unit.Nat

/**
 * Created by Seven on 03.08.2016.
 */
interface Clock {

    /**
     * @return The amount of ticks this clock has done since its creation.
     */
    fun ticks(): Nat
}