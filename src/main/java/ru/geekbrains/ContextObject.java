package ru.geekbrains;

/**
 * @author Vitaly Alekseev
 * @since 28.01.2021
 */
public class ContextObject {

    private final String key;

    private final SecondObject secondObject;

    private ContextObject(String key, SecondObject secondObject) {
        this.key = key;
        this.secondObject = secondObject;
    }

    public String get() {
        return key;
    }

    public SecondObject getSecondObject() {
        return new SecondObject();
    }

    public static class Builder {

        private String key;

        private SecondObject secondObject;

        public Builder key(String key) {
            this.key = key;
            return this;
        }

        public Builder secondObject(SecondObject secondObject) {
            this.secondObject = secondObject;
            return this;
        }

        public ContextObject build() {
            return new ContextObject(key, secondObject);
        }

    }

}
