package ua.edu.npu;

import org.junit.*;
import ua.edu.npu.SomeClass;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class SomeClassTest {

    private SomeClass someClass;
    private static SomeClass someClassStatic;

    @Before
    public void setUp() throws Exception {
        System.out.println("I am before");
        someClass = new SomeClass();

    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.out.println("I am beforeClass");
        someClassStatic = new SomeClass();
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("I am after");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        System.out.println("I am afterClass");
    }

    @Test
    public void testAssertEquals(){
        System.out.println("I am assertEquals test case");
        assertEquals("assert equals fails", 10, 10);
    }

    @Test
    public void shouldReturnTrueWhenInputNegative() {
        boolean result = SomeClass.isNegative(-10);

        assertTrue("Input is not negative", result);
    }

    @Test
    public void shouldReturnFalseWhenInputNotNegative() {
        boolean result = SomeClass.isNegative(10);

        assertFalse("result should be false",result);
    }

    @Test
    public void shouldReturnFiftyWhenSetDepth() {
        someClass.length = 10;
        someClass.depth = 5;

       int result = someClass.getLengthMultipleDepth();

        assertEquals(50, result);
    }


    @Test
    public void shouldReturnFourWhenDepthDefault() {
        someClass.length = 2;

        int result = someClass.getLengthMultipleDepth();

        assertEquals(4, result);
    }

    @Test
    public void shouldReturnFiftyWhenSetDepthStatic() {
        someClassStatic.length = 10;
        someClassStatic.depth = 5;

        int result = someClassStatic.getLengthMultipleDepth();

        assertEquals(50, result);
    }


    @Test
    public void shouldReturnFourWhenDepthDefaultStatic() {
        someClassStatic.length = 2;

        int result = someClassStatic.getLengthMultipleDepth();

        assertEquals(4, result);
    }

    @Ignore
    @Test
    public void shouldNotRunWhenIgnore(){
        System.out.println("I am assertEquals test case. Ignored");
        assertEquals("assert equals fails", 10, 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenNull() {
        someClass.isXNegative();
    }

    @Test(timeout = 10)
    public void shouldFailTimeout() {
        while (true);
    }

    /**
     * Alternative to setUp() -> @Before - call this method at each test case
     * @return
     */
    private SomeClass getSomeClass() {
        SomeClass someClass = new SomeClass();
        someClass.length = -10;
        return someClass;
    }

}