package game.logic_layer.creature

import game.logic_layer.intelligence.Intelligence
import game.logic_layer.map.Appearance
import game.logic_layer.unit.Bounds
import game.logic_layer.unit.Direction
import game.logic_layer.unit.Speed
import java.time.Clock

interface Creature {
    val bounds: Bounds
    val speed: Speed
    val intelligence: (creature: Creature, clock: Clock) -> Creature
    val direction: Direction
    val appearance: Appearance

    fun step()
}