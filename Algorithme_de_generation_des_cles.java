public static int[] generateKey(int[] perm, int shiftOrder) {
    int[] key = {0, 1, 2, 3, 4, 5, 6, 7};
    for (int i = 0; i < shiftOrder; i++) {
        int temp = key[0];
        System.arraycopy(key, 1, key, 0, key.length - 1);
        key[key.length - 1] = temp;
    }
    int[] newKey = new int[8];
    for (int i = 0; i < perm.length; i++) {
        newKey[i] = indexOf(key, perm[i]);
    }
    return newKey;
}

private static int indexOf(int[] array, int value) {
    for (int i = 0; i < array.length; i++) {
        if (array[i] == value) {
            return i;
        }
    }
    return -1;
}
