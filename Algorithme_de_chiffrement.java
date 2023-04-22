public static String encrypt(String plaintext, int[] key) {
    StringBuilder ciphertext = new StringBuilder();
    for (int i = 0; i < plaintext.length(); i += 8) {
        char[] block = plaintext.substring(i, i + 8).toCharArray();
        char[] newBlock = new char[8];
        for (int j = 0; j < key.length; j++) {
            newBlock[j] = block[key[j]];
        }
        ciphertext.append(newBlock);
    }
    return ciphertext.toString();
}
