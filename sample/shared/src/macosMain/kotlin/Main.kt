import androidx.compose.ui.window.Window
import platform.AppKit.NSApp
import tech.annexflow.sample.App

fun main() {
    Window(
        title = "precompose-navigation-typesafe",
    ) {
        App()
    }
    NSApp?.run()
}
