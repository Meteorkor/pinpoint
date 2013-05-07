package com.profiler;

import com.profiler.config.ProfilerConfig;
import com.profiler.context.TraceContext;

/**
 *
 */
public interface Agent {
    // TODO 필요없을것 같음 started를 start로 바꿔도 될 듯...
    void start();

    void started();

    void stop();

    void addConnector(String protocol, int port);

    TraceContext getTraceContext();

    Object getByteCodeInstrumentor();

    ProfilerConfig getProfilerConfig();
}