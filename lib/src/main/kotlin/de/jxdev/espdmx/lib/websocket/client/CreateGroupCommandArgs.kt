package de.jxdev.espdmx.lib.websocket.client

import com.google.gson.annotations.SerializedName
import de.jxdev.espdmx.lib.websocket.CommandArgs

data class CreateGroupCommandArgs(
    @SerializedName("name")     val name    : String?               = null,
    @SerializedName("patches")  val patches : ArrayList<String>     = arrayListOf()
) : CommandArgs()