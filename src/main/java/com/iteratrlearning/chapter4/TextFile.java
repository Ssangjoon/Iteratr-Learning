package com.iteratrlearning.chapter4;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

import static com.iteratrlearning.chapter4.Attributes.PATH;
import static java.util.stream.Collectors.toList;

/*
TextFile 은 Document의 서브 클래스가 아니다.
TextFile은 텍스트 파일이라는 기본 개념을 모델링하는 클래스로 텍스트 파일에서 데이터를 추출하는 메서드를 포함한다.
도메인 클래스를 사용하면 상속같이 쉽게 깨질 수 있는 계층을 만들지 않으면서도 코드를 재사용할 수 있다.
*/

class TextFile {
    private final Map<String, String> attributes;
    private final List<String> lines;


    TextFile(final File file) throws IOException {
        attributes = new HashMap<>();
        attributes.put(PATH, file.getPath());
        lines = Files.lines(file.toPath()).collect(toList());
    }

    Map<String, String> getAttributes() {
        return attributes;
    }

    int addLines(
            final int start,
            final Predicate<String> isEnd,
            final String attributeName) {

        final StringBuilder accumulator = new StringBuilder();
        int lineNumber;
        for (lineNumber = start; lineNumber < lines.size(); lineNumber++) {
            final String line = lines.get(lineNumber);
            if (isEnd.test(line)) {
                break;
            }

            accumulator.append(line);
            accumulator.append("\n");
        }
        attributes.put(attributeName, accumulator.toString().trim());
        return lineNumber;
    }
    void addLineSuffix(final String prefix, final String attributeName) {
        for(final String line: lines) {
            if (line.startsWith(prefix)) {
                attributes.put(attributeName, line.substring(prefix.length()));
                break;
            }
        }
    }
}