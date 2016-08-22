package game.ui_layer

import java.awt.Dimension
import java.awt.Graphics
import javax.swing.JFrame

/**
 * The window for the entire game. To switch to a scene from another,
 * just pop in the new one.
 */
class Window(settings: WindowSettings, firstScene: Scene) {
    private val window = object : JFrame(settings.title) {
        override fun paint(g: Graphics) {

        }
    }

    init {
        window.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        window.size = Dimension(settings.width, settings.height)
        window.isVisible = true
        window.isResizable = false
        window.add(firstScene)
        window.setLocationRelativeTo(null)
    }

    /**
     * Removes the old scene and adds the new one. If the
     * window had multiple components by some incident
     * they will all be replaced by the given scene.
     */
    fun switchTo(nextScene: Scene) {
        window.removeAll()
        window.add(nextScene)
    }
}

/**
 * An immutable class to hold the different aspects of a window.
 *
 * Precondition: width > 0 && height > 0
 */
data class WindowSettings(val width: Int, val height: Int, val title: String) {
    init {
        require(width > 0 && height > 0)
    }
}