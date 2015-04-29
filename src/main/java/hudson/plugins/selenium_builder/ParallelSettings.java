package hudson.plugins.selenium_builder;

import org.kohsuke.stapler.DataBoundConstructor;

import java.io.Serializable;

/**
 * @author Ross Rowe
 */
public class ParallelSettings implements Serializable {

    private int threadPoolSize;

    @DataBoundConstructor
    public ParallelSettings(int threadPoolSize) {
        this.threadPoolSize = threadPoolSize;
    }

    public int getThreadPoolSize() {
        return threadPoolSize;
    }

    public void setThreadPoolSize(int threadPoolSize) {
        this.threadPoolSize = threadPoolSize;
    }
}
