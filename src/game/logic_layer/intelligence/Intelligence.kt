package game.logic_layer.intelligence

import game.logic_layer.clock.Clock

@FunctionalInterface
interface Intelligence {
    fun step(time: Clock)
}