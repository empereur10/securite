public static String decrypt(String ciphertext, int[] key) {
    StringBuilder plaintext = new StringBuilder();
    for (int i = 0; i < ciphertext.length(); i += 8) {
        char[] block = ciphertext.substring(i, i + 8).toCharArray();
        char[] newBlock = new char[8];
        for (int j = 0; j < key.length; j++) {
            newBlock[key[j]] = block[j];
        }
        plaintext.append(newBlock);
    }
    return plaintext.toString();
}