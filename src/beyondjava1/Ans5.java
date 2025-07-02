package beyondjava1;
public class Ans5 {
    public static void main(String[] args) {
        String repeated = "Hello".repeat(3);
        System.out.println(repeated);
        String withUni = "\u2005  Akshay  \u2005";
        System.out.println(withUni.strip());
        String withSpaces = "\nAkshay\t";
        System.out.println(withSpaces.trim());
        System.out.println("code".isBlank());
        String Inden = "Line1";
        System.out.println(Inden.indent(10));
        String upper = "heLlo".transform(s -> s.toUpperCase());
        System.out.println(upper);  // JAVA
//        String indented = """
//                Line1
//                    Line2
//                        Line C
//                """;
        String stripIndentt = """
                Line1 
                     Line2 
                       Line3 """;
        System.out.println(stripIndentt.stripIndent());
        String escaped = "Hello\\nWorld\\tnewtab";
        System.out.println("translateEscapes"+escaped.translateEscapes());
        String template = "Hello, %s. You have %d new messages";
        System.out.println("formatted(): " + template.formatted("Akshay", 3));

        String html = """
                <html>
                    <body>
                        <h1>Welcome</h1>
                    </body>
                </html>
                """;
        System.out.println("triple quotes:\n" + html);

    }
}
