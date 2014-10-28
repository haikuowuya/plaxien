package me.everything.plaxien;

import junit.framework.TestCase;

public class NodeTest extends TestCase {

    public void testNode() {
        String title = "title";
        Explain.Node node = new Explain.Node(title, null, true);

        assertEquals(node.title, new String(title));
        assertEquals(node.expanded, true);
        assertEquals(node.type, Explain.Node.NODE);
        assertEquals(node.getType(), Explain.Node.NODE);
        assertEquals(node.getTitle(), node.title);


    }

    public void testAddChildren() {
        String title = "title";
        Explain.Node node = new Explain.Node("title", null, true);
        assertEquals(node.children.size(), 0);
        Explain.Node child = node.addChild("Child");
        assertEquals(node.children.size(), 1);
        node.addChild("Child");
        assertEquals(node.children.size(), 2);

        node.addValue("foo", "Bar").addValue("baz","bag");
        assertEquals(node.children.size(), 4);
        assertEquals(node.children.size(), node.size());


    }

    public void testValueNode() {


        Explain.ValueNode vn = new Explain.ValueNode("Foo", 1);
        assertEquals(vn.title, "Foo");
        assertEquals(vn.value, 1);

    }
}
