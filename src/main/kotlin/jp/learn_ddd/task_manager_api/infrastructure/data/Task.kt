package jp.learn_ddd.task_manager_api.infrastructure.data

import javax.persistence.*

@Entity
class Task (
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column
    var id: Int = 0,
    @Column
    var title: String = "not assign",
    @Column
    var details: String? = "not assign",
    @Column(name = "task_type_id")
    var taskTypeID: Int? = 0,
    @Column(name = "parent_task_id")
    var parentTaskID: Int? = 0
)