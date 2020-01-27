package ua.test.taf.core.enums;

import lombok.Getter;

public enum TestCacheKey {
    PAGE_NAME("PAGE_NAME");

    @Getter
    private String key;

    TestCacheKey(String key) {
        this.key = key;
    }
}
