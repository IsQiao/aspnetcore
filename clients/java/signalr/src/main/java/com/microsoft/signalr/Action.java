// Copyright (c) .NET Foundation. All rights reserved.
// Licensed under the Apache License, Version 2.0. See License.txt in the project root for license information.

package com.microsoft.signalr;

/**
 * A callback that takes no parameters.
 */
@FunctionalInterface
public interface Action {
    void invoke();
}
