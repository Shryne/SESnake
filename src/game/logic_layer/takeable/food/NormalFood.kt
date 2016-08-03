package game.logic_layer.takeable.food

import game.logic_layer.clock.Clock
import game.logic_layer.creature.Creature
import game.logic_layer.map.Appereance
import game.logic_layer.unit.Position

class NormalFood(override val position: Position) : Food() {
    override val effect = {
        creature: Creature, clock: Clock -> creature
    }
    
    override val appereance = Appereance(

    )
}