package de.jxdev.espdmx.lib.websocket.client

import com.google.gson.annotations.SerializedName
import de.jxdev.espdmx.lib.websocket.CommandArgs

data class CreatePatchCommandArgs (
    @SerializedName("name")         val name            : String?   = null,
    @SerializedName("fixtureName")  val fixtureName     : String?   = null,
    @SerializedName("startChannel") val startChannel    : Int?      = null
) : CommandArgs()