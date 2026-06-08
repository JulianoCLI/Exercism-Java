class SqueakyClean {
    static String clean(String identifier) {
        boolean h = false;
        StringBuilder word = new StringBuilder();
        for (Character c : identifier.toCharArray()) {
            if      (c == '4') c = 'a';
            else if (c == '3') c = 'e';
            else if (c == '0') c = 'o';
            else if (c == '1') c = 'l';
            else if (c == '7') c = 't';
            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || c == ' ' || c == '-')) {
                continue;
            }
            if (c == ' ') word.append('_');
            else if (c == '-') h = true;
            else if (h) {
                word.append(Character.toUpperCase(c));
                h = false;
            } else word.append(c);
        }
        return word.toString();
    }
}