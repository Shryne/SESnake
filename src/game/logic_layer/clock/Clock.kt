package game.logic_layer.clock

import game.logic_layer.unit.Nat

/**
 * Created by Seven on 03.08.2016.
 */
interface Clock {
    fun ticks(): Nat
}