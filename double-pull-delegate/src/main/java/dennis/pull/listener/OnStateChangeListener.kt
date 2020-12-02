package dennis.pull.listener

import dennis.pull.ScrollState


interface OnStateChangeListener {

    fun pullViewShow(state: ScrollState)

    fun pullViewHide(state: ScrollState)

    fun pullViewMove(state: ScrollState, offset: Int)

    fun pullViewOpenStart()

    fun pullViewOpenFinish()
}
