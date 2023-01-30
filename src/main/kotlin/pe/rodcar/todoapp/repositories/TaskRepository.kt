package pe.rodcar.todoapp.repositories

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import pe.rodcar.todoapp.models.Task
import java.util.Optional

interface TaskRepository : JpaRepository<Task, Long> {
    @Query(value = "SELECT * FROM tasks WHERE is_task_open = TRUE", nativeQuery = true)
    fun findAllOpenTasks() : List<Task>

    @Query(value = "SELECT * FROM tasks WHERE is_task_open = FALSE", nativeQuery = true)
    fun findAllClosedTasks() : List<Task>

    @Query("SELECT CASE WHEN COUNT(t) > 0 THEN TRUE ELSE FALSE END FROM Task t WHERE t.description =? 1")
    fun doesDescriptionExists(description: String) : Boolean
}