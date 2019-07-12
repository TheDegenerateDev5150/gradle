/*
 * Copyright 2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// tag::apply-plugin[]
plugins {
    `swift-library`
}
// end::apply-plugin[]

// tag::dependency-management[]
library {
    dependencies {
        // FIXME: Put real deps here.
        api("io.qt:core:5.1")
        implementation("io.qt:network:5.1")
    }
}
// end::dependency-management[]

// tag::configure-target-machines[]
library {
    targetMachines.set(listOf(machines.linux.x86, machines.linux.x86_64,
        machines.macOS.x86_64))
}
// end::configure-target-machines[]

// tag::configure-linkages[]
library {
    linkage.set(listOf(Linkage.STATIC, Linkage.SHARED))
}
// end::configure-linkages[]