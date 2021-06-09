package at.aau.ESOP.AB7.Exercise7;

/**
 * Created by Nikita on 10.05.2021 at 18:41
 */
public class UsingStringBuilder {
    public static void main(String[] args) {
        String[] items = new String[]{"Zahnpasta", "Pyjama", "Turnschuhe" };
        String packed = packMySuitcase(items);
        System.out.println(packed);
    }

    // TODO put your method here
    static String packMySuitcase(String[] items){
        StringBuilder sb = new StringBuilder("Ich packe in meinen Koffer ");

        if(items.length == 0){
            return String.valueOf(sb.append("nichts."));
        } else {
            for (int i = 0; i < items.length; i++) {

                if (items[i] == items[items.length - 1]) {
                    sb.append(items[i] + ".");
                } else if (items[i] == items[items.length - 2]) {
                    sb.append(items[i] + " und ");
                } else
                    sb.append(items[i] + ", ");
            }
        }
        return String.valueOf(sb);
    }
}
