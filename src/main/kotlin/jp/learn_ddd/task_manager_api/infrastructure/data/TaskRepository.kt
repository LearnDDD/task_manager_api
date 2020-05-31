package jp.learn_ddd.task_manager_api.infrastructure.data

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TaskRepository : JpaRepository<Task, String> {
}