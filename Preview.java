package iroda;

import iroda.constants.HelloStr;

import static iroda.constants.HelloStr.SLEEP_TIME;

/**
 * Created by Abdurashidov Shahzod on 18/02/23 19:00.
 * company
 * shahzod9933@gmail.com
 */
public class Preview {
    public static void main(String args[]) {
        new Express().showExpress();
        new Heart().heart();
    }
}

class Express {
    public void showExpress() {
        for (int i = 0; i < HelloStr.HelloStr.length(); i++) {
            System.err.print(HelloStr.HelloStr.charAt(i));
            try {
                Thread.sleep(SLEEP_TIME);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("");
    }
}