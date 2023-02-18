package iroda;


class Heart {
    void heart() {
        int heartC = Integer.parseInt(String.valueOf(10));
        for (int i = -3 * heartC / 2; i <= heartC; i++) {
            for (int j = -3 * heartC / 2; j <= 3 * heartC / 2; j++) {

                int i1 = (-heartC / 2 - i) * (-heartC / 2 - i);
                if ((Math.abs(i) + Math.abs(j) < heartC) || (i1 + (heartC / 2 - j) * (heartC / 2 - j) <= heartC * heartC / 2) || (i1 + (-heartC / 2 - j) * (-heartC / 2 - j) <= heartC * heartC / 2)) {
                    System.out.print("♥️ ");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }
    }
}
