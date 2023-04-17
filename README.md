## Description
Temporary personal repo to experiment with Swing, for GUI elements used in a [game](https://github.com/Senozoid/ZenChron) (currently private) I am making.

## Structure
_(if class is not mentioned, it's homonymous)_
* mainWindow
    * topPanel
    * mainPanel
      * mainMenuPanel _(class: MenuPanel)_
      * gamePanel
        * display
          * scroller _(class: JScrollPane)_
            * textArea _(class: JTextArea)_
          * optPanel
        * gameMenuPanel _(class: MenuPanel)_

## Minor Issues
1. The game menu may open while toggling the main menu.
