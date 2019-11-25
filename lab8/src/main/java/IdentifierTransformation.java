public final class IdentifierTransformation {

    public static String snakeCaseIdentifierToPascalCase(String identifier) {
        identifier = snakeCaseIdentifierToCamelCase(identifier);
        return identifier.substring(0,1).toUpperCase() + identifier.substring(1);
    }

    public static String snakeCaseIdentifierToCamelCase(String identifier) {
        while (identifier.contains("_")){
            identifier = identifier.replaceFirst("_[a-z]", String.valueOf(Character.toUpperCase(identifier.charAt(identifier.indexOf("_")+1))));
        }
        return  identifier;
    }
}