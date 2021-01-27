package ru.geekbrains;

/**
 * @author Vitaly Alekseev
 * @since 25.01.2021
 */
public class TddService {

    public String replaceOccurrences(final String str, final String what, final String to, final int count) {
        if (str == null || what == null || to == null) {
            throw new IllegalArgumentException("one of argument is null");
        }
        final StringBuilder result = new StringBuilder();
        int startIndex = 0, nextIndex = 0, replaces = 0;
        do {
            nextIndex = str.indexOf(what, startIndex);
            if (nextIndex > 0) {
                result.append(str.substring(startIndex, nextIndex));
                if (replaces++ < count) {
                    result.append(to);
                } else {
                    result.append(what);
                }
                startIndex = nextIndex + what.length();
            } else {
                result.append(str.substring(startIndex));
                startIndex = str.length();
            }
        } while (startIndex < str.length());
        return result.toString();
    }
}
