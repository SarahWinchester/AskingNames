import java.util.Scanner;

public class Name {

    private String words;

    private int lenghtName;



    StringBuilder charName = new StringBuilder();

    public void StringAskingChars() {

        Scanner entry = new Scanner(System.in);

        System.out.println("\nHow Many Words did you name have?");

        lenghtName = entry.nextInt();

        for (int i = 0; i < lenghtName; i++) {

            System.out.print("\n"+ (i+1)+ ": ");
            words = entry.next();
            charName.append(words);
            charName.append(" ");

        }

        System.out.println("\nTu nombre es: \n");
        System.out.println(charName.toString()+"\n" + "              .---.         ,,\n" +
                "   ,,        /     \\       ;,,'\n" +
                "  ;, ;      (  o  o )      ; ;\n" +
                "    ;,';,,,  \\  \\/ /      ,; ;\n" +
                " ,,,  ;,,,,;;,`   '-,;'''',,,'\n" +
                ";,, ;,, ,,,,   ,;  ,,,'';;,,;''';\n" +
                "   ;,,,;    ~~'  '';,,''',,;''''\n" +
                "                      '''\n");

    }
}

