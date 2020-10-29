package JavaConcurrencyInPractice.book;

import java.util.concurrent.atomic.AtomicLong;

public class CountingFactorizer {
    // 能够保证所有对计数器对状态对访问操作都是原子性
    private final AtomicLong count = new AtomicLong(0);

    public long getCount() {
        return count.get();
    }
}
