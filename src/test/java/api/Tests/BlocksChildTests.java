package api.Tests;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.POJO.Blocks;
import com.POJO.Blocks.Children;
import com.POJO.Blocks.Children.Rich_text;

import io.restassured.http.ContentType;

public class BlocksChildTests {
	 Blocks blocksrequestpayload;

	    @BeforeClass
	    public void setUp() {
	        blocksrequestpayload = new Blocks();
	        List<Blocks.Children> childlist = new ArrayList<Children>();

	        // Creating first child block (heading_2)
	        Blocks.Children heading2Child = new Blocks.Children();
	        heading2Child.setObject("block");
	        heading2Child.setType("heading_2");

	        // Creating rich text for heading_2
	        Blocks.Children.Heading_2 heading2Payload = new Blocks.Children.Heading_2();
	        List<Blocks.Children.Rich_text> heading2RichTextList = new ArrayList<Rich_text>();
	        Blocks.Children.Rich_text heading2RichTextPayload = new Blocks.Children.Rich_text();
	        heading2RichTextPayload.setType("text");
	        Blocks.Children.Text heading2TextPayload = new Blocks.Children.Text();
	        heading2TextPayload.setContent("Lacinato kale");
	        heading2RichTextPayload.setText(heading2TextPayload);
	        heading2RichTextList.add(heading2RichTextPayload);
	        heading2Payload.setRich_text(heading2RichTextList);
	        heading2Child.setHeading_2(heading2Payload);
	        childlist.add(heading2Child);

	        // Creating second child block (paragraph)
	        Blocks.Children paragraphChild = new Blocks.Children();
	        paragraphChild.setType("paragraph");
	        paragraphChild.setObject("block");
	        Blocks.Children.Paragraph paragraphPayload = new Blocks.Children.Paragraph();

	        // Creating rich text for paragraph
	        List<Blocks.Children.Rich_text> paragraphRichTextList = new ArrayList<Rich_text>();
	        Blocks.Children.Rich_text paragraphRichTextPayload = new Blocks.Children.Rich_text();
	        paragraphRichTextPayload.setType("text");
	        Blocks.Children.Text paragraphTextPayload = new Blocks.Children.Text();
	        paragraphTextPayload.setContent("Lacinato kale is a variety of kale with a long tradition");
	        paragraphRichTextPayload.setText(paragraphTextPayload);
	        paragraphRichTextList.add(paragraphRichTextPayload);
	        paragraphPayload.setRich_text(paragraphRichTextList);
	        paragraphChild.setParagraph(paragraphPayload);
	        childlist.add(paragraphChild);

	        blocksrequestpayload.setChildren(childlist);
	    }

	    @Test
	    public void testCreateAddress() {
	        given()
	            .contentType(ContentType.JSON)
	            .body(blocksrequestpayload)
	            .log().body()
	        .when()
	            .post("https://reqres.in/api/users")
	        .then()
	            .log().status();
	    }
	}
