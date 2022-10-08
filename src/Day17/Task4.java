package Day17;

public class Task4 {
    public static void main(String[] args) {

        byte[] byte1 = new byte[3];

        byte1[0] = (byte) (Math.random() * 127);
        byte1[1] = (byte) (Math.random() * 127);
        byte1[2] = (byte) (Math.random() * 127);

        // LET'S SEE USING FOR LOOP CONDITION
        // when u use a reputation always think about loop

        for (int i = 0; i < byte1.length; i++) {
           byte1[i] = (byte) (Math.random()*127);
        }

        for (int i = 0; i < byte1.length; i++) {
            System.out.println(byte1[i]);
        }











    }
}
