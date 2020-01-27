package ua.test.taf.core.cache;

import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

import lombok.NoArgsConstructor;
import ua.test.taf.core.enums.TestCacheKey;

@NoArgsConstructor
public final class TestCache {
    private static final ThreadLocal<TestSessionMap> CACHE = new InheritableThreadLocal<>();

    public static void initializeTestCache() {
        CACHE.set(new TestSessionMap());
    }

    private static TestSessionMap getCache() {
        return CACHE.get();
    }

    public static void putDataInCache(final TestCacheKey key, final Object value) {
        getCache().put(key, value);
    }

    public static Object get(final TestCacheKey key) {
        return getCache().get(key);
    }

    public static boolean containsKey(final TestCacheKey key) {
        return getCache().containsKey(key);
    }

    public static void clearCache() {
        getCache().clear();
        CACHE.remove();
    }

    private static class TestSessionMap extends ConcurrentHashMap {
        @Override
        public Object put(final Object key, final Object value) {
            return Objects.isNull(value) ? super.remove(key) : super.put(key, value);
        }
    }
}
