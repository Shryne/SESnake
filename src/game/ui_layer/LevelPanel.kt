package game.ui_layer

import game.logic_layer.level.Level
import game.logic_layer.map.Filling.*
import game.logic_layer.unit.Nat
import java.awt.Dimension
import java.awt.Graphics
import javax.swing.JFrame

/**
 * The ui representation of a level.
 *
 * @param level The level to be drawn.
 */
class LevelPanel(private val level: Level) : Scene() {
    override fun paint(g: Graphics) {
        level.appearance.forEach({
            it.forEach {
                when (it) {
                    
                    EMPTY -> g.drawRect(0, 0, 100, 100)
                }
            }
        })


    }
}