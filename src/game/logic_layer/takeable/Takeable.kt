package game.logic_layer.takeable

import game.logic_layer.clock.Clock
import game.logic_layer.creature.Creature
import game.logic_layer.map.Appereance
import game.logic_layer.unit.Position

/**
 * Created by Seven on 03.08.2016.
 */
interface Takeable {
    val effect: (creature: Creature, clock: Clock) -> Creature
    val position: Position
    val appereance: Appereance
}