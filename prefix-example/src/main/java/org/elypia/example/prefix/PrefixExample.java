/*
 * Copyright 2019-2020 Elypia CIC and Contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.elypia.example.prefix;

import org.elypia.commandler.Commandler;

/**
 * Our main class, this will initialize Commandler and run the framework.
 *
 * @author seth@elypia.org (Seth Falco)
 */
public class PrefixExample {

    public static void main(String[] args) {
        // Setup Commandler, this will initialize Commandler and perform any validation.
        Commandler commandler = Commandler.create();

        // Run Commandler, this actually sets up all integrations and starts receiving and handling events.
        commandler.run();
    }
}
