/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.jsonde.gui.license.codec;

/**
 * Thrown when a Decoder has encountered a failure condition during a decode.
 *
 * @author Apache Software Foundation
 * @version $Id: DecoderException.java 797804 2009-07-25 17:27:04Z ggregory $
 */
public class DecoderException extends Exception {

    /**
     * Constructs a new exception with <code>null</code> as its detail message. The cause is not initialized, and may
     * subsequently be initialized by a call to {@link #initCause}.
     *
     * @since 1.4
     */
    public DecoderException() {
        super();
    }

    /**
     * Constructs a new exception with the specified detail message. The cause is not initialized, and may subsequently
     * be initialized by a call to {@link #initCause}.
     *
     * @param message The detail message which is saved for later retrieval by the {@link #getMessage()} method.
     */
    public DecoderException(String message) {
        super(message);
    }

    /**
     * Constructsa new exception with the specified detail message and cause.
     * <p/>
     * <p>
     * Note that the detail message associated with <code>cause</code> is not automatically incorporated into this
     * exception's detail message.
     * </p>
     *
     * @param message The detail message which is saved for later retrieval by the {@link #getMessage()} method.
     * @param cause   The cause which is saved for later retrieval by the {@link #getCause()} method. A <code>null</code>
     *                value is permitted, and indicates that the cause is nonexistent or unknown.
     * @since 1.4
     */
    public DecoderException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructs a new exception with the specified cause and a detail message of <code>(cause==null ?
     * null : cause.toString())</code> (which typically contains the class and detail message of <code>cause</code>).
     * This constructor is useful for exceptions that are little more than wrappers for other throwables.
     *
     * @param cause The cause which is saved for later retrieval by the {@link #getCause()} method. A <code>null</code>
     *              value is permitted, and indicates that the cause is nonexistent or unknown.
     * @since 1.4
     */
    public DecoderException(Throwable cause) {
        super(cause);
    }
}
