package jp.learn_ddd.task_manager_api.infrastructure.datasource.task

import jp.learn_ddd.task_manager_api.application.usecase.ComposingTask
import jp.learn_ddd.task_manager_api.domain.task.Task
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Param

@Mapper
interface TaskMapper {
    fun getAll(): List<Task>
    fun register(@Param("task") task: ComposingTask)
}
