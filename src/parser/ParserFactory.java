package parser;

public class ParserFactory {

    public Parser getParser(String fileType){
        return switch (fileType) {
            case "JSON" -> new JsonParser();
            case "XML" -> new XmlParser();
            case "FILE" -> new FileParser();
            default -> null;
        };
    }
}
