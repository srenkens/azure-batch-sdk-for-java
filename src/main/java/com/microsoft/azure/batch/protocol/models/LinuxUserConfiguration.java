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
 * Properties used to create a user account on a Linux node.
 */
public class LinuxUserConfiguration {
    /**
     * The user ID of the user account.
     * The uid and gid properties must be specified together or not at all. If
     * not specified the underlying operating system picks the uid.
     */
    @JsonProperty(value = "uid")
    private Integer uid;

    /**
     * The group ID for the user account.
     * The uid and gid properties must be specified together or not at all. If
     * not specified the underlying operating system picks the gid.
     */
    @JsonProperty(value = "gid")
    private Integer gid;

    /**
     * The SSH private key for the user account.
     * The private key must not be password protected. The private key is used
     * to automatically configure asymmetric-key based authentication for SSH
     * between nodes in a Linux pool when the pool's
     * enableInterNodeCommunication property is true (it is ignored if
     * enableInterNodeCommunication is false). It does this by placing the key
     * pair into the user's .ssh directory. If not specified, password-less SSH
     * is not configured between nodes (no modification of the user's .ssh
     * directory is done).
     */
    @JsonProperty(value = "sshPrivateKey")
    private String sshPrivateKey;

    /**
     * Get the uid and gid properties must be specified together or not at all. If not specified the underlying operating system picks the uid.
     *
     * @return the uid value
     */
    public Integer uid() {
        return this.uid;
    }

    /**
     * Set the uid and gid properties must be specified together or not at all. If not specified the underlying operating system picks the uid.
     *
     * @param uid the uid value to set
     * @return the LinuxUserConfiguration object itself.
     */
    public LinuxUserConfiguration withUid(Integer uid) {
        this.uid = uid;
        return this;
    }

    /**
     * Get the uid and gid properties must be specified together or not at all. If not specified the underlying operating system picks the gid.
     *
     * @return the gid value
     */
    public Integer gid() {
        return this.gid;
    }

    /**
     * Set the uid and gid properties must be specified together or not at all. If not specified the underlying operating system picks the gid.
     *
     * @param gid the gid value to set
     * @return the LinuxUserConfiguration object itself.
     */
    public LinuxUserConfiguration withGid(Integer gid) {
        this.gid = gid;
        return this;
    }

    /**
     * Get the private key must not be password protected. The private key is used to automatically configure asymmetric-key based authentication for SSH between nodes in a Linux pool when the pool's enableInterNodeCommunication property is true (it is ignored if enableInterNodeCommunication is false). It does this by placing the key pair into the user's .ssh directory. If not specified, password-less SSH is not configured between nodes (no modification of the user's .ssh directory is done).
     *
     * @return the sshPrivateKey value
     */
    public String sshPrivateKey() {
        return this.sshPrivateKey;
    }

    /**
     * Set the private key must not be password protected. The private key is used to automatically configure asymmetric-key based authentication for SSH between nodes in a Linux pool when the pool's enableInterNodeCommunication property is true (it is ignored if enableInterNodeCommunication is false). It does this by placing the key pair into the user's .ssh directory. If not specified, password-less SSH is not configured between nodes (no modification of the user's .ssh directory is done).
     *
     * @param sshPrivateKey the sshPrivateKey value to set
     * @return the LinuxUserConfiguration object itself.
     */
    public LinuxUserConfiguration withSshPrivateKey(String sshPrivateKey) {
        this.sshPrivateKey = sshPrivateKey;
        return this;
    }

}
