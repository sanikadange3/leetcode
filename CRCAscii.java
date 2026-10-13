import java.util.Scanne ;

public class CRCAscii {

    // XOR two binary strings, ignoring the first bit
    static String xor(String a, String b) {
        StringBuilder result = new StringBuilder();

        for (int i = 1; i < b.length(); i++) {
            result.append(a.charAt(i) == b.charAt(i) ? '0' : '1');
        }

        return result.toString();
    }

    // Binary division for CRC
    static String divide(String data, String divisor) {

        int n = divisor.length();

        String temp = data.substring(0, n);

        for (int i = n; i < data.length(); i++) {

            if (temp.charAt(0) == '1') {
                temp = xor(temp, divisor) + data.charAt(i);
            } else {
                temp = xor(temp, "0".repeat(n)) + data.charAt(i);
            }
        }

        // Final XOR
        if (temp.charAt(0) == '1') {
            temp = xor(temp, divisor);
        } else {
            temp = xor(temp, "0".repeat(n));
        }

        return temp;
    }

    // Convert ASCII text into 8-bit binary
    static String asciiToBinary(String text) {

        StringBuilder binary = new StringBuilder();

        for (char c : text.toCharArray())
             {

            String ascii = String.format(
                    "%8s",
                    Integer.toBinaryString(c)
            ).replace(' ', '0');

            binary.append(ascii);
        }

        return binary.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Sender side
        System.out.print("Enter ASCII text: ");
        String text = sc.nextLine();

        System.out.print("Enter generator polynomial in binary: ");
        String divisor = sc.nextLine();

        // Convert text to binary
        String data = asciiToBinary(text);

        System.out.println("\nASCII Binary Data: " + data);

        // Append n-1 zeros
        String appendedData =
                data + "0".repeat(divisor.length() - 1);

        System.out.println("Data after appending zeros: "
                + appendedData);

        // Calculate CRC
        String crc = divide(appendedData, divisor);

        System.out.println("CRC: " + crc);

        // Create transmitted codeword
        String transmittedData = data + crc;

        System.out.println("Transmitted Data: "
                + transmittedData);

        // Receiver side
        System.out.print("\nEnter received data: ");
        String receivedData = sc.nextLine();

        String remainder = divide(receivedData, divisor);

        System.out.println("Remainder: " + remainder);

        if (remainder.contains("1")) {
            System.out.println("Error Detected!");
        } else {
            System.out.println("No Error Detected.");
        }

        sc.close();
    }
}