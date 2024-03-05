package com.iteratrlearning.chapter4;

import java.util.Map;


// 도메인 클래스를 이용하면 개념에 이름을 붙이고 수행할 수 있는 동작과 값을 제한할 수 있다.
// Document는 오직 문서 관리 시스템에서만 만들 수 있어야 하므로 패키지 영역으로 생성자를 제공하고,
// 문서 관리 시스템이 위치한 패키지에만 접근 권한을 준다.

public class Document {
    private final Map<String, String> attributes;

    Document(final Map<String, String> attributes) {
        this.attributes = attributes;
    }

    public String getAttribute(final String attributeName) {
        return attributes.get(attributeName);
    }
}