package game.logic_layer.takeable

import game.logic_layer.clock.Clock
import game.logic_layer.creature.Creature
import game.logic_layer.map.Appearance
import game.logic_layer.map.WithAppearance
import game.logic_layer.unit.Position

/**
 * Created by Seven on 03.08.2016.
 */
interface Takeable : WithAppearance {
    val effect: (creature: Creature, clock: Clock) -> Creature
    val position: Position
}