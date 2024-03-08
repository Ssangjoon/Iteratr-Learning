package com.iteratrlearning.chapter4;

public final class Attributes {
    // final : final 키워드는 해당 클래스가 다른 어떤 클래스에 의해 상속될 수 없다는 것을 나타냅니다.
    // 필드에 사용될 때는 그 필드가 변경 불가능(immutable)임을 의미하며, 따라서 PATH 필드는 선언 이후 그 값이 변경될 수 없습니다.

    // static : static 키워드가 사용된 필드나 메소드는 인스턴스가 아닌 클래스에 속해 있음을 의미합니다.
    // 이는 PATH 필드가 Attributes 클래스의 인스턴스를 생성하지 않고도 사용할 수 있음을 의미합니다.
    // 즉, Attributes.PATH와 같은 방식으로 직접 접근할 수 있습니다.
    // static 필드는 클래스가 메모리에 로드될 때 한 번만 생성되며, 클래스의 모든 인스턴스가 이 필드의 같은 단일 복사본을 공유합니다.

    public static final String PATH = "path";
    public static final String PATIENT = "patient";
    public static final String ADDRESS = "address";
    public static final String BODY = "body";
    public static final String WIDTH = "width";
    public static final String HEIGHT = "height";
    public static final String TYPE = "type";
    public static final String AMOUNT = "amount";
}
