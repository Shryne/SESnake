package game.logic_layer.map

import game.logic_layer.creature.Creature
import game.logic_layer.takeable.Takeable
import game.logic_layer.unit.Size

/**
 * Created by Seven on 03.08.2016.
 */
class EmptyMap(private val creatures: List<Creature>, private val takeables: List<Takeable>) : Map {
    companion object {
        private const val MAP_WIDTH = 30
        private const val MAP_HEIGHT = 12
    }

    override val size = Size(MAP_WIDTH, MAP_HEIGHT)
    override val appearance =
            (creatures + takeables)
                    .map { it.appearance }
                    .reduce { accu, appearance->  accu + appearance }

    override fun step() {
        throw UnsupportedOperationException()
    }
}
