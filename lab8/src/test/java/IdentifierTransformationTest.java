import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IdentifierTransformationTest {

    @Test
    void snakeCaseIdentifierToPascalCase() {
        assertEquals("SnakeCase", IdentifierTransformation.snakeCaseIdentifierToPascalCase("snake_case"));
    }

    @Test
    void longSnakeCaseToPascalCase(){
        assertEquals("ALongSnakeCase", IdentifierTransformation.snakeCaseIdentifierToPascalCase("a_long_snake_case"));
    }

    @Test
    void shortSnakeCaseToPascalCase(){
        assertEquals("Short", IdentifierTransformation.snakeCaseIdentifierToPascalCase("short"));
    }

    @Test
    void longSnakeCaseToCamalCase(){
        assertEquals("aLongSnakeCase", IdentifierTransformation.snakeCaseIdentifierToCamelCase("a_long_snake_case"));
    }

    @Test
    void snakeCaseIdentifierToCamelCase() {
        assertEquals("snakeCase", IdentifierTransformation.snakeCaseIdentifierToCamelCase("snake_case"));
    }

    @Test
    void shortSnakeCaseToCamelCase(){
        assertEquals("short", IdentifierTransformation.snakeCaseIdentifierToCamelCase("short"));
    }


}