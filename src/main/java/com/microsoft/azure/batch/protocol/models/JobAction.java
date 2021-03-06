/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for JobAction.
 */
public enum JobAction {
    /** Take no action. */
    NONE("none"),

    /** Disable the job. This is equivalent to calling the disable job API, with a disableTasks value of requeue. */
    DISABLE("disable"),

    /** Terminate the job. The terminateReason in the job's executionInfo is set to "TaskFailed". */
    TERMINATE("terminate");

    /** The actual serialized value for a JobAction instance. */
    private String value;

    JobAction(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a JobAction instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed JobAction object, or null if unable to parse.
     */
    @JsonCreator
    public static JobAction fromString(String value) {
        JobAction[] items = JobAction.values();
        for (JobAction item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
