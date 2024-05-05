package com.example.myapplication

interface Destinations {
    val route:String
}

object Home:Destinations {
    override val route: String
        get() = "Home"
}

object Counter:Destinations {
    override val route: String
        get() = "Counter"
}

object DiceRoller:Destinations {
    override val route: String
        get() = "DiceRoller"
}

object LocalWebViewDes:Destinations {
    override val route: String
        get() = "WebView"
}
