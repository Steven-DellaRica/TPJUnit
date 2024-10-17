package dev.levenshtein;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DistanceLevenshteinParamTest {

    private DistanceLevenshtein distanceLevenshtein;

    @BeforeEach
    public void setUp() {
        distanceLevenshtein = new DistanceLevenshtein();
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/DistanceLevenshtein.csv", numLinesToSkip = 1, delimiter = ';')
    void calculerDistanceTest5(String valeur1, String valeur2, int valeur3) {

        int result = distanceLevenshtein.calculerDistance(valeur1, valeur2);

        assertEquals(valeur3, result);
    }

}
