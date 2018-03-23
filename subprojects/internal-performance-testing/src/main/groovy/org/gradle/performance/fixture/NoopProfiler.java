/*
 * Copyright 2018 the original author or authors.
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

package org.gradle.performance.fixture;

import org.gradle.performance.measure.MeasuredOperation;

import java.io.File;
import java.util.Collections;
import java.util.List;

class NoopProfiler extends Profiler {
    @Override
    public void setVersionUnderTest(String versionUnderTest) {

    }

    @Override
    public void setScenarioUnderTest(String scenarioUnderTest) {

    }

    @Override
    public void setUseDaemon(boolean useDaemon) {

    }

    @Override
    public List<String> getAdditionalJvmOpts(File workingDir) {
        return Collections.emptyList();
    }

    @Override
    public List<String> getAdditionalArgs(File workingDir) {
        return Collections.emptyList();
    }

    @Override
    public void collect(BuildExperimentInvocationInfo invocationInfo, MeasuredOperation operation) {

    }
}
