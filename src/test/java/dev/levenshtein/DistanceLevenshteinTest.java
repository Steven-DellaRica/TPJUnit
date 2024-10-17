package dev.levenshtein;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DistanceLevenshteinTest {

    private static Object[][] testDatas;

    private DistanceLevenshtein distanceLevenshtein;

    @BeforeAll
    static void setUpBeforeClass() {
        testDatas = new Object[][] {
                {"chocolat", "chocolatine", 3},
                {"chat", "chats", 1},
                {"machins", "machines", 1},
                {"java", "jee", 3},
        };
    }

    @BeforeEach
    public void setUp() {
        distanceLevenshtein = new DistanceLevenshtein();
    }

    @Test
    void calculerDistanceTest() {
        System.out.println(distanceLevenshtein.calculerDistance("", "chocolatine"));

        String mot1 = (String)testDatas[0][0];
        String mot2 = (String)testDatas[0][1];
        int expectedDistance = (int)testDatas[0][2];

        int result = distanceLevenshtein.calculerDistance(mot1, mot2);

        assertEquals(expectedDistance, result);
    }

    @Test
    void calculerDistanceTest2() {
        System.out.println(distanceLevenshtein.calculerDistance("chat", "chats"));

        String mot1 = (String)testDatas[1][0];
        String mot2 = (String)testDatas[1][1];
        int expectedDistance = (int)testDatas[1][2];

        int result = distanceLevenshtein.calculerDistance(mot1, mot2);

        assertEquals(expectedDistance, result);
    }

    @Test
    void calculerDistanceTest3() {
        System.out.println(distanceLevenshtein.calculerDistance("machins", "machines"));

        String mot1 = (String)testDatas[2][0];
        String mot2 = (String)testDatas[2][1];
        int expectedDistance = (int)testDatas[2][2];

        int result = distanceLevenshtein.calculerDistance(mot1, mot2);

        assertEquals(expectedDistance, result);
    }

    @Test
    void calculerDistanceTest4() {
        System.out.println(distanceLevenshtein.calculerDistance("java", "jee"));

        String mot1 = (String)testDatas[3][0];
        String mot2 = (String)testDatas[3][1];
        int expectedDistance = (int)testDatas[3][2];

        int result = distanceLevenshtein.calculerDistance(mot1, mot2);

        assertEquals(expectedDistance, result);
    }

    @Test
    void testPremierParametreNull() {
        AppException exception = assertThrows(AppException.class, () -> {
            distanceLevenshtein.calculerDistance(null, "test");
        });
        assertEquals("le premier paramètre ne peut être null ou vide", exception.getMessage());
    }

    @Test
    void testPremierParametreVide() {
        AppException exception = assertThrows(AppException.class, () -> {
            distanceLevenshtein.calculerDistance("", "test");
        });
        assertEquals("le premier paramètre ne peut être null ou vide", exception.getMessage());
    }

    @Test
    void testSecondParametreNull() {
        AppException exception = assertThrows(AppException.class, () -> {
            distanceLevenshtein.calculerDistance("test", null);
        });
        assertEquals("le second paramètre ne peut être null ou vide", exception.getMessage());
    }

    @Test
    void testSecondParametreVide() {
        AppException exception = assertThrows(AppException.class, () -> {
            distanceLevenshtein.calculerDistance("test", "");
        });
        assertEquals("le second paramètre ne peut être null ou vide", exception.getMessage());
    }

}