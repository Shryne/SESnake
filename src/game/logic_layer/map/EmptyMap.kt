package game.logic_layer.map

import game.logic_layer.creature.Creature
import game.logic_layer.takeable.Takeable

/**
 * Created by Seven on 03.08.2016.
 */
class EmptyMap(private val creatures: List<Creature>, private val takeables: List<Takeable>) : Map {
    companion object {
        private const val MAP_WIDTH = 30
        private const val MAP_HEIGHT = 12
    }

    override val appearance = emptyAppearance(MAP_WIDTH, MAP_HEIGHT) + sum(creatures) + sum(takeables)

    override fun step() {
        throw UnsupportedOperationException()
    }
}

/**
 * Adds all the appearances of the given objects to one.
 */
fun sum(objects: Collection<WithAppearance>) =
        objects.reduce { result, appearance ->  result + appearance }