package de.jxdev.espdmx.lib.serialization

import com.google.gson.JsonElement
import com.google.gson.JsonObject
import com.google.gson.JsonSerializationContext
import com.google.gson.JsonSerializer
import de.jxdev.espdmx.lib.websocket.Command
import java.lang.reflect.Type

class CommandSerializer : JsonSerializer<Command> {

    override fun serialize(
        src: Command?,
        typeOfSrc: Type?,
        context: JsonSerializationContext?
    ): JsonElement {
        if (src == null) return JsonObject()
        if (context == null) return JsonObject()

        val commandObj = JsonObject()

        val bodyClassType = getArgClass(src.baseCommand.toString(), src.subCommand.toString())?.argBody
        commandObj.addProperty("base_command",src.baseCommand.toString())
        commandObj.addProperty("sub_command",src.subCommand.toString())
        commandObj.add("args", context.serialize(src.args, bodyClassType))

        return commandObj
    }

}