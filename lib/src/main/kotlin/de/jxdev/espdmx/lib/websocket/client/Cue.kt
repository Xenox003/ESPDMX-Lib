package de.jxdev.espdmx.lib.websocket.client

import com.google.gson.annotations.SerializedName
import de.jxdev.espdmx.lib.websocket.enums.CueType

data class Cue (
    @SerializedName("id")       val id      : Int?              = null,
    @SerializedName("name")     val name    : String?           = null,
    @SerializedName("type")     val type    : CueType?          = null,
    @SerializedName("values")   val values  : ArrayList<Int>    = arrayListOf(),
    @SerializedName("meta")     val meta    : ArrayList<Any> = arrayListOf()
)