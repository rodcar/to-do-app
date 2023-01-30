package pe.rodcar.todoapp.messages.dtos

import pe.rodcar.todoapp.models.Priority
import java.time.LocalDateTime

data class TaskDto(
    val id: Long,
    var description: String,
    var isReminderSet: Boolean,
    var isTaskOpen: Boolean,
    val createdOn: LocalDateTime,
    var priority: Priority
)
