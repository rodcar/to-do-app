package pe.rodcar.todoapp.messages.requests

import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull
import pe.rodcar.todoapp.models.Priority
import java.time.LocalDateTime

data class TaskRegisterRequest(
    @NotBlank(message = "Task id can't be empty")
    val id: Long,
    @NotBlank(message = "task's description can't be empty")
    var description: String,
    var isReminderSet: Boolean,
    var isTaskOpen: Boolean,
    @NotNull(message = "task's created on can't be empty")
    val createdOn: LocalDateTime,
    var priority: Priority
)
