package util;

import lombok.Getter;

@Getter

public enum Category {
    APPETIZER("1"),
    MAIN("2"),
    DESSERT("3"),
    DRINK("4");

    private final String code;

    Category(String code) {
        this.code = code;
    }

    public static Category getCategoryByCode(String code) {
        for (Category value : Category.values()) {
            if (value.getCode().equals(code)) {
                return value;
            }
        }

        return null;
    }

    private static class CategoryNotFoundException extends Throwable {
        public CategoryNotFoundException(String s) {
        }
    }
}
