package game.logic_layer.map

import game.logic_layer.creature.Creature
import game.logic_layer.takeable.Takeable

/**
 * Created by Seven on 03.08.2016.
 */
class EmptyMap(private val creatures: List<Creature>, private val takeables: List<Takeable>) : Map {

    override fun step() {
        throw UnsupportedOperationException()
    }
}