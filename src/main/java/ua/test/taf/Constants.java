package ua.test.taf;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class Constants {

//    public static final String CARD_XML_PATH = "data_files/card/Cards.xml";

//    @NoArgsConstructor(access = AccessLevel.PRIVATE)
//    public static class Attributes {
//        public static final String HREF = "href";
//        public static final String CLASS = "class";
//    }

    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static final class TimeOuts {
        public static final int DEFAULT_TIMEOUT = 50000;
    }
}
