package blanco.apex.formatter;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.junit.Test;

import blanco.apex.parser.token.BlancoApexToken;

public class BlancoApexFormatter003Test {
	private static final String TARGET_FILE1 = "./test/data/apex/MySimpleTest2.cls";

	@Test
	public void test() throws IOException {
		final List<BlancoApexToken> tokenList = new BlancoApexFormatter().format(new File(TARGET_FILE1)); //
		// System.out.println(BlancoApexParserUtil.tokenList2String(tokenList));

		assertEquals(
				"SOURCE[ANNOTATION[SPECIAL_CHAR[@],WORD[isTest],NEWLINE[n]],CLASS[WORD[public],WHITESPACE[ ],WORD[without],WHITESPACE[ ],WORD[sharing],WHITESPACE[ ],WORD[class],WHITESPACE[ ],WORD[MySimpleTest],BLOCK(CLASS_DEF)[SPECIAL_CHAR[{],NEWLINE[n],WHITESPACE[    ],METHOD[WORD[static]WHITESPACE[ ]WORD[testMethod]WHITESPACE[ ]WORD[void]WHITESPACE[ ]WORD[testMain002]PARENTHESIS[SPECIAL_CHAR[(],SPECIAL_CHAR[)]]BLOCK(METHOD_DEF)[SPECIAL_CHAR[{],NEWLINE[n],WHITESPACE[        ],STATEMENT[WORD[System],SPECIAL_CHAR[.],WORD[assert],PARENTHESIS[SPECIAL_CHAR[(],WORD[false],SPECIAL_CHAR[,],WHITESPACE[ ],LITERAL(STRING)['Hello test world!'],SPECIAL_CHAR[)]],SPECIAL_CHAR[;]],NEWLINE[n],WHITESPACE[    ],SPECIAL_CHAR[}]]],NEWLINE[n],NEWLINE[n],WHITESPACE[    ],METHOD[WORD[static]WHITESPACE[ ]WORD[void]WHITESPACE[ ]WORD[test001]PARENTHESIS[SPECIAL_CHAR[(],SPECIAL_CHAR[)]]BLOCK(METHOD_DEF)[SPECIAL_CHAR[{],NEWLINE[n],WHITESPACE[        ],STATEMENT[WORD[Integer],WHITESPACE[ ],WORD[i],SPECIAL_CHAR[=],LITERAL(NUMBER)[0],SPECIAL_CHAR[;]],NEWLINE[n],WHITESPACE[        ],STATEMENT[WORD[while],PARENTHESIS[SPECIAL_CHAR[(],LITERAL(NUMBER)[5],SPECIAL_CHAR[>],WORD[i],SPECIAL_CHAR[)]],BLOCK(MULTI_STATEMENT)[SPECIAL_CHAR[{],NEWLINE[n],WHITESPACE[            ],STATEMENT[WORD[i],SPECIAL_CHAR[++],SPECIAL_CHAR[;]],NEWLINE[n],WHITESPACE[        ],SPECIAL_CHAR[}]],NEWLINE[n],WORD[return],SPECIAL_CHAR[;]],NEWLINE[n],WHITESPACE[    ],SPECIAL_CHAR[}]]],NEWLINE[n],WHITESPACE[],SPECIAL_CHAR[}]]],NEWLINE[n]]",
				tokenList.get(0).getDisplayString());
	}
}
