/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The set of changes to be made to a task.
 */
public class TaskUpdateParameter {
    /**
     * Constraints that apply to this task.
     * If omitted, the task is given the default constraints. For
     * multi-instance tasks, updating the retention time applies only to the
     * primary task and not subtasks.
     */
    @JsonProperty(value = "constraints")
    private TaskConstraints constraints;

    /**
     * Get if omitted, the task is given the default constraints. For multi-instance tasks, updating the retention time applies only to the primary task and not subtasks.
     *
     * @return the constraints value
     */
    public TaskConstraints constraints() {
        return this.constraints;
    }

    /**
     * Set if omitted, the task is given the default constraints. For multi-instance tasks, updating the retention time applies only to the primary task and not subtasks.
     *
     * @param constraints the constraints value to set
     * @return the TaskUpdateParameter object itself.
     */
    public TaskUpdateParameter withConstraints(TaskConstraints constraints) {
        this.constraints = constraints;
        return this;
    }

}
