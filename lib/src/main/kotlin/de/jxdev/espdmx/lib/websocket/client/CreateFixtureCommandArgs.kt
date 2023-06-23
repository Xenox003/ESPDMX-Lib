package de.jxdev.espdmx.lib.websocket.client

import com.google.gson.annotations.SerializedName
import de.jxdev.espdmx.lib.websocket.CommandArgs
import de.jxdev.espdmx.lib.websocket.enums.ChannelType

data class CreateFixtureCommandArgs (
    @SerializedName("name"         ) var name         : String?           = null,
    @SerializedName("channelCount" ) var channelCount : Int?              = null,
    @SerializedName("channelNames" ) var channelNames : ArrayList<String> = arrayListOf(),
    @SerializedName("channelTypes" ) var channelTypes : ArrayList<ChannelType> = arrayListOf()
) : CommandArgs()