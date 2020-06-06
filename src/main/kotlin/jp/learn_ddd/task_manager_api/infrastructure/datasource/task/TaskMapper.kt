package jp.learn_ddd.task_manager_api.infrastructure.datasource.task

import jp.learn_ddd.task_manager_api.domain.task.Task
import org.apache.ibatis.annotations.Mapper

@Mapper
interface TaskMapper {
    fun getAll(): List<Task>
}
