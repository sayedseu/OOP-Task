package parser;

import model.RootResponse;

import java.util.List;

public interface Parser {
    List<RootResponse> parse(String file);
}
