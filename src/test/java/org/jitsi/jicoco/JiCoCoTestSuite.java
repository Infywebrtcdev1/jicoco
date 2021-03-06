/*
 * Copyright @ 2015 Atlassian Pty Ltd
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
package org.jitsi.jicoco;

import org.jitsi.cmd.*;
import org.jitsi.influxdb.LineProtocolTest;
import org.jitsi.retry.*;
import org.junit.runner.*;
import org.junit.runners.*;

/**
 *
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
    CmdLineArgsTest.class,
    LineProtocolTest.class,
    RetryStrategyTest.class
})
public class JiCoCoTestSuite
{
}
