package game.ui_layer

import game.logic_layer.level.Level
import game.logic_layer.map.Filling.*
import java.awt.Graphics

/**
 * The ui representation of a level.
 *
 * @param level The level to be drawn.
 */
class LevelPanel(private val level: Level) : Scene() {
    override fun paint(g: Graphics) {
        level.appearance.forEach({
            when (it.filling) {
                EMPTY -> g.drawRect(WIDTH, 0, 100, 100)
            }
        })


    }
}