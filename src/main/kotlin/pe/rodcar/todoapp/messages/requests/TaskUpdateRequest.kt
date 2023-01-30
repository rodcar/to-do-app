package pe.rodcar.todoapp.messages.requests

import pe.rodcar.todoapp.models.Priority

data class TaskUpdateRequest(
    var description: String?,
    var isReminderSet: Boolean?,
    var isTaskOpen: Boolean?,
    var priority: Priority?
)
